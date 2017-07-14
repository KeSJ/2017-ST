package expense.DAO;

import expense.model.*;

import java.util.List;

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

    public void addExpendDetail(ExpenseDetail expendDetail) {//添加
        Session session = getSession();
        session.beginTransaction();
        session.save(expendDetail);
        session.getTransaction().commit();
    }

    public void modifyExpendDetail(ExpenseDetail expendDetail) {//修改
        Session session = getSession();
        session.beginTransaction();
        session.update(expendDetail);
        session.getTransaction().commit();
    }

    public ExpenseDetail findExpendDetail(String expDetId) {//通过主码查找
        Session session = getSession();
        session.beginTransaction();
        ExpenseDetail expendDetail  = (ExpenseDetail) session.get(ExpenseDetail.class, expDetId);
        session.getTransaction().commit();
        return expendDetail;
    }
    
    public List<ExpenseDetail> findByEId(int eId){
		Session session = getSession();
		session.beginTransaction();
		String hql = "from ExpenseDetail where eId = " + eId + "order by expDetId";
		List<ExpenseDetail> expenseDetails = session.createQuery(hql).list();
		session.getTransaction().commit();
		return expenseDetails;
		
	}

}