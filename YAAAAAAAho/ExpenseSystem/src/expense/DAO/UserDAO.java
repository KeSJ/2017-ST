package expense.DAO;

import expense.model.*;
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

    public void addUser(User user) {//���
        Session session = getSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
    }

    public void modifyUser(User user) {//�޸�
        Session session = getSession();
        session.beginTransaction();
        session.update(user);
        session.getTransaction().commit();
    }

    public User findUser(String userId) {//ͨ���������
        Session session = getSession();
        session.beginTransaction();
        User user = (User) session.get(User.class, userId);
        session.getTransaction().commit();
        return user;
    }

}