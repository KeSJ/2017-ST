package expense.DAO;

import expense.model.*;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

/**
 * Created by lenovo on 2017/7/6 0006.
 */
public class   ExpenseDetailDAO {
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

    public void addExpendDetail(ExpenseDetail expendDetail) {//���
        Session session = getSession();
        session.beginTransaction();
        session.save(expendDetail);
        session.getTransaction().commit();
    }

    public void modifyExpendDetail(ExpenseDetail expendDetail) {//�޸�
        Session session = getSession();
        session.beginTransaction();
        session.update(expendDetail);
        session.getTransaction().commit();
    }

    public ExpenseDetail findExpendDetail(String expDetId) {//ͨ���������
        Session session = getSession();
        session.beginTransaction();
        ExpenseDetail expendDetail  = (ExpenseDetail) session.get(ExpenseDetail.class, expDetId);
        session.getTransaction().commit();
        return expendDetail;
    }

}