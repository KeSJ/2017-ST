package expense.DAO;

import expense.model.Accept;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

/**
 * Created by lenovo on 2017/7/6 0006.
 */
public class AcceptDAO {
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

    public void addAccept(Accept accept) {//添加
        Session session = getSession();
        session.beginTransaction();
        session.save(accept);
        session.getTransaction().commit();
    }
    public void modifyAccept(Accept accept) {//修改
        Session session = getSession();
        session.beginTransaction();
        session.update(accept);
        session.getTransaction().commit();
    }
    public Accept findAccept(String acceptId) {//通过主码查找
        Session session = getSession();
        session.beginTransaction();
        Accept accept = (Accept) session.get(Accept.class, acceptId);
        session.getTransaction().commit();
        return accept;
    }



}
