package expense.DAO;

import expense.model.Appendix;
import expense.model.BudgetDetail;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

/**
 * Created by lenovo on 2017/7/6 0006.
 */
public class BudgetDetailDAO {
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

	public void addBudgetDetail(BudgetDetail budgetDetail) {// ���
		Session session = getSession();
		session.beginTransaction();
		session.save(budgetDetail);
		session.getTransaction().commit();
	}

	public void modifyBudgetDetail(BudgetDetail budgetDetail) {// �޸�
		Session session = getSession();
		session.beginTransaction();
		session.update(budgetDetail);
		session.getTransaction().commit();
	}

	public BudgetDetail findBudgetDetail(int budgetDetailId) {// ͨ���������
		Session session = getSession();
		session.beginTransaction();
		BudgetDetail budgetDetail = (BudgetDetail) session.get(BudgetDetail.class, budgetDetailId);
		session.getTransaction().commit();
		return budgetDetail;
	}
	
	public List<BudgetDetail> findByBudId(int budId){
		Session session = getSession();
		session.beginTransaction();
		String hql = "from BudgetDetail where budgetId = " + budId + "order by budgetDetailId";
		List<BudgetDetail> budgetDetails = session.createQuery(hql).list();
		session.getTransaction().commit();
		return budgetDetails;
		
	}

}
