package expense.DAO;

import expense.model.Appendix;
import expense.model.Budget;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

/**
 * Created by lenovo on 2017/7/6 0006.
 */
public class BudgetDAO {
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

	public void addBudget(Budget budget) {// 添加
		Session session = getSession();
		session.beginTransaction();
		session.save(budget);
		session.getTransaction().commit();
	}

	public void modifyBudget(Budget budget) {// 修改
		Session session = getSession();
		session.beginTransaction();
		session.update(budget);
		session.getTransaction().commit();
	}

	public Budget findBudet(String budId) {// 通过主码查找
		Session session = getSession();
		session.beginTransaction();
		Budget budget = (Budget) session.get(Budget.class, budId);
		session.getTransaction().commit();
		return budget;
	}
	
	

}
