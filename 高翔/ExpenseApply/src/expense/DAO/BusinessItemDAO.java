package expense.DAO;

import expense.model.*;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

/**
 * Created by lenovo on 2017/7/6 0006.
 */
public class BusinessItemDAO {
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

    public void addBusinessItem(BusinessItem businessItem) {//添加
        Session session = getSession();
        session.beginTransaction();
        session.save(businessItem);
        session.getTransaction().commit();
    }

    public void modifyBusinessItem(BusinessItem businessItem) {//修改
        Session session = getSession();
        session.beginTransaction();
        session.update(businessItem);
        session.getTransaction().commit();
    }

    public BusinessItem findBusinessItem(String busItemId) {//通过主码查找
        Session session = getSession();
        session.beginTransaction();
        BusinessItem businessItem = (BusinessItem) session.get(BusinessItem.class, busItemId);
        session.getTransaction().commit();
        return businessItem;
    }

}