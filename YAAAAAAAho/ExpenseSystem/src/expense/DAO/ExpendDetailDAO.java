package expense.DAO;

import expense.model.*;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

/**
 * Created by lenovo on 2017/7/6 0006.
 */
public class   ExpendDetailDAO {
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

    public void addExpendDetail(ExpendDetail expendDetail) {//添加
        Session session = getSession();
        session.beginTransaction();
        session.save(expendDetail);
        session.getTransaction().commit();
    }

    public void modifyExpendDetail(ExpendDetail expendDetail) {//修改
        Session session = getSession();
        session.beginTransaction();
        session.update(expendDetail);
        session.getTransaction().commit();
    }

    public ExpendDetail findExpendDetail(String expDetId) {//通过主码查找
        Session session = getSession();
        session.beginTransaction();
        ExpendDetail expendDetail  = (ExpendDetail) session.get(ExpendDetail.class, expDetId);
        session.getTransaction().commit();
        return expendDetail;
    }

}