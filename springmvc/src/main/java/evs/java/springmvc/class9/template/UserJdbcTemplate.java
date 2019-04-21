/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evs.java.springmvc.class9.template;

import evs.java.springmvc.class9.dao.UserDao;
import evs.java.springmvc.class9.mapper.UserRowMapper;
import evs.java.springmvc.class9.model.User;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author shahzad
 */
public class UserJdbcTemplate implements UserDao {
    
    private DataSource dataSource;

    private JdbcTemplate template;

    @Override
    public void setDataSource(DataSource ds) {
        this.dataSource = ds;
        this.template = new JdbcTemplate(dataSource);
    }

    @Override
    public boolean create(User user) {
        // Create 
        String sql = "INSERT INTO user "
                + "(name, email, phone, username, userpass ) "
                + "VALUES (?,?,?,?,?) ";
        int ret = template.update(sql, user.getName(),
                user.getEmail(), user.getPhone(),
                user.getUsername(), user.getUserpass());
        return ret == 1;
    }

    @Override
    public User get(Integer id) {
        String sql = query + "WHERE id=?";
        User user = null;
        try {
            user = template.queryForObject(sql,
                    new UserRowMapper(), id);
        } catch (Exception e) {
            e.printStackTrace();
            user = null;
        }
        return user;
    }

    @Override
    public List<User> all() {
        return template.query(query, new UserRowMapper());
    }

    @Override
    public User delete(Integer id) {
        User u = get(id);
        int ret = 0;
        if (u != null) {
            String sql = "DELETE FROM user "
                    + "WHERE id=?";
            ret = template.update(sql, id);
        }
        return ret == 1 ? u : null;
    }

    @Override
    public boolean update(User user) {
        // Update
        String sql = "UPDATE user "
                + "SET name=?, email=?, phone=?,"
                + " username=?, userpass=?"
                + " WHERE id=? ";
        int ret = template.update(sql, user.getName(),
                user.getEmail(), user.getPhone(),
                user.getUsername(), user.getUserpass(),
                user.getId());
        return ret == 1;
    }

    @Override
    public User validate(String username, String password) {
        String sql = query + " WHERE username=?"
                + " AND userpass=?";
        User user = null;
        try {
            user = template.queryForObject(
                    sql, // Query
                    new RowMapper<User>() {
                        @Override
                        public User mapRow(ResultSet rs, int i) throws SQLException {
                            User u = new User() ;
                            u.setUsername(rs.getString("username")) ;
                            u.setUserpass(rs.getString("userpass"));
                            return  u ;
                        }
                    },
                    //new UserRowMapper(), // Row Mapper
                    username, password // Args
            );
        } catch (Exception e) {
            e.printStackTrace();
            user = null;
        }
        return user;
    }

}
