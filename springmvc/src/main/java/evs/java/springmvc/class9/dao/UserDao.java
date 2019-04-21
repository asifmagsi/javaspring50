/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evs.java.springmvc.class9.dao;

import evs.java.springmvc.class9.model.User;
import java.util.List;
import javax.sql.DataSource;

/**
 *
 * @author shahzad
 */
public interface UserDao {
    
    public String query = 
            "SELECT id, name, email, phone, "
            + "username, userpass, active "
            + "FROM user " ;
    
    public void setDataSource ( DataSource ds ) ;
    
    public boolean create( User user ) ;
    
    public List<User> all() ;
    
    public User get ( Integer id ) ;
    
    public User delete ( Integer id ) ;
    
    public boolean update (User user ) ;
    
    public User validate ( String username, String password ) ;
    
}
