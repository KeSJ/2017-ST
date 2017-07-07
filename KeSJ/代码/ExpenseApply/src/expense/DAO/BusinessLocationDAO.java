package expense.DAO;

import expense.model.*;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

/**
 * Created by lenovo on 2017/7/6 0006.
 */
public class BusinessLocationDAO {
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

    public void addBusinessLocation(BusinessLocation businessLocation) {//���
        Session session = getSession();
        session.beginTransaction();
        session.save(businessLocation);
        session.getTransaction().commit();
    }

    public void modifyBusinessLocation(BusinessLocation businessLocation) {//�޸�
        Session session = getSession();
        session.beginTransaction();
        session.update(businessLocation);
        session.getTransaction().commit();
    }

    public BusinessLocation findBusinessLocation(String busLocId) {//ͨ���������
        Session session = getSession();
        session.beginTransaction();
        BusinessLocation businessLocation  = (BusinessLocation) session.get(BusinessLocation.class, busLocId);
        session.getTransaction().commit();
        return businessLocation;
    }

}