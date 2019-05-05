/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evs.java.springmvc.class11.hibernate;

import evs.java.springmvc.class11.model.UserModel;
import evs.java.springmvc.class9.dao.UserDao;
import evs.java.springmvc.class9.model.User;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.SQLQuery;
import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.criterion.Restrictions;

import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author shahzad
 */
public class UserDaoHibernate implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void setDataSource(DataSource ds) {
        // Empty
    }

    @Override
    public boolean create(User user) {
        boolean ret;
        Session session = sessionFactory.openSession();
        UserModel um = user.clone();
        ret = session.save(um) != null;
        session.close();
        return ret;
    }

    @Override
    public List<User> all() {
        Session session = sessionFactory.openSession();
        List<UserModel> all
                = session.createQuery("from UserModel")
                .list();
        session.close();

        List<User> retAll = new ArrayList<User>();
        for (UserModel u : all) {
            retAll.add(u.clone());
        }
        return retAll;
    }

    @Override
    public User get(Integer id) {
        Session session = sessionFactory.openSession();
        UserModel u = (UserModel) session.get(UserModel.class, id);
        session.close();
        return u.clone();
    }

    @Override
    public User delete(Integer id) {
        Session session = sessionFactory.openSession();
        UserModel u = (UserModel) session.get(UserModel.class, id);
        session.delete(u);
        session.close();
        return u.clone();
    }

    @Override
    public boolean update(User user) {
        Session session = sessionFactory.openSession();
        UserModel um = (UserModel) session.get(UserModel.class, user.getId());
        um.setName(user.getName());
        um.setEmail(user.getEmail());
        um.setPhone(user.getPhone());
        um.setUsername(user.getUsername());
        um.setUserpass(user.getUserpass());
        session.saveOrUpdate(um);
        session.close();
        return true;

    }

    @Override
    public User validate(String username, String password) {
        Session session = sessionFactory.openSession();
//        Criteria criteria = session.createCriteria(UserModel.class);
//        criteria.add(Restrictions.eq("username", username));
//        criteria.add(Restrictions.eq("userpass", password));
//        List<UserModel> results = criteria.list();
//        return (results.size() > 0) ? results.get(0).clone() : null;

        String sql = "SELECT * FROM USER "
                + "WHERE username= :username AND "
                + "userpass = :userpass";
        SQLQuery query = session.createSQLQuery(sql);
        query.addEntity(UserModel.class);
        query.setParameter("username", username);
        query.setParameter("userpass", password);
        List<UserModel> results = query.list();
        return (results.size() > 0) ? results.get(0).clone() : null;
    }

}
