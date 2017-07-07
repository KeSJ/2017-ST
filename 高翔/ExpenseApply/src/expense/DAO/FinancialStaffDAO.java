package expense.DAO;

import expense.model.*;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

/**
 * Created by lenovo on 2017/7/6 0006.
 */
public class   FinancialStaffDAO {
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

    public void addFinancialStaff(FinancialStaff financialStaff) {//添加
        Session session = getSession();
        session.beginTransaction();
        session.save(financialStaff);
        session.getTransaction().commit();
    }

    public void modifyFinancialStaff(FinancialStaff financialStaff) {//修改
        Session session = getSession();
        session.beginTransaction();
        session.update(financialStaff);
        session.getTransaction().commit();
    }

    public FinancialStaff findFinancialStaff(String fsId)
    {//通过主码查找
        Session session = getSession();
        session.beginTransaction();
        FinancialStaff financialStaff= (FinancialStaff) session.get(FinancialStaff.class, fsId);
        session.getTransaction().commit();
        return financialStaff;
    }


}