package expense.DAO;

import expense.model.Appendix;
import expense.model.BudgetDetail;
import expense.model.Business;
import expense.model.BusinessDetail;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

/**
 * Created by lenovo on 2017/7/6 0006.
 */
public class BusinessDetailDAO {
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

    public void addBusinessDetail(BusinessDetail businessDetail) {//添加
        Session session = getSession();
        session.beginTransaction();
        session.save(businessDetail);
        session.getTransaction().commit();
    }

    public void modifyBusinessDetail(BusinessDetail businessDetail) {//修改
        Session session = getSession();
        session.beginTransaction();
        session.update(businessDetail);
        session.getTransaction().commit();
    }

    public BusinessDetail findBusinessDetail(String busDetId) {//通过主码查找
        Session session = getSession();
        session.beginTransaction();
        BusinessDetail businessDetail = (BusinessDetail) session.get(BusinessDetail.class, busDetId);
        session.getTransaction().commit();
        return businessDetail;
    }

}
