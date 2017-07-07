package expense.DAO;

import expense.model.Appendix;
import expense.model.BudgetDetail;
import expense.model.Business;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

/**
 * Created by lenovo on 2017/7/6 0006.
 */
public class BusinessDAO {
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

    public void addBusiness(Business business) {//���
        Session session = getSession();
        session.beginTransaction();
        session.save(business);
        session.getTransaction().commit();
    }

    public void modifyBusiness(Business business) {//�޸�
        Session session = getSession();
        session.beginTransaction();
        session.update(business);
        session.getTransaction().commit();
    }

    public Business findBusiness(String businessId) {//ͨ���������
        Session session = getSession();
        session.beginTransaction();
        Business business = (Business) session.get(Business.class, businessId);
        session.getTransaction().commit();
        return business;
    }
}
