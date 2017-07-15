package expense.DAO;

import expense.model.*;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

/**
 * Created by lenovo on 2017/7/6 0006.
 */
public class   UserDAO {
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    public void addUser(User user) {//添加
        Session session = getSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
    }

    public void modifyUser(User user) {//修改
        Session session = getSession();
        session.beginTransaction();
        session.update(user);
        session.getTransaction().commit();
    }

    public User findUser(String userId) {//通过主码查找
        Session session = getSession();
        session.beginTransaction();
        User user = (User) session.get(User.class, userId);
        session.getTransaction().commit();
        return user;
    }
    
    public List<User> findUsersByName(String userName){
    	Session session = getSession();
        session.beginTransaction();
        String hql = "from User where userName like '%" + userName + "%' order by userId";
        List<User> users = session.createQuery(hql).list();
        session.getTransaction().commit();
        return users;
    }

}