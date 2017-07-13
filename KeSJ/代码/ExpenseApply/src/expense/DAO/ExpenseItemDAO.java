package expense.DAO;

import expense.model.*;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

/**
 * Created by lenovo on 2017/7/6 0006.
 */
public class ExpenseItemDAO {
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

	public void addExpenseItem(ExpenseItem expenseItem) {// 添加
		Session session = getSession();
		session.beginTransaction();
		session.save(expenseItem);
		session.getTransaction().commit();
	}

	public void modifyExpenseItem(ExpenseItem expenseItem) {// 修改
		Session session = getSession();
		session.beginTransaction();
		session.update(expenseItem);
		session.getTransaction().commit();
	}

	public ExpenseItem findExpenseItem(int expItemId) {// 通过主码查找
		Session session = getSession();
		session.beginTransaction();
		ExpenseItem expenseItem = (ExpenseItem) session.get(ExpenseItem.class, expItemId);
		session.getTransaction().commit();
		return expenseItem;
	}

	public List<ExpenseItem> findExpenseItemsByName(String expItemName) {
		Session session = getSession();
		session.beginTransaction();
		String hql = "from ExpenseItem where expItemName like '%" + "%' order by expItemId";
		List<ExpenseItem> expenseItems = session.createQuery(hql).list();
		session.getTransaction().commit();
		return expenseItems;
	}

	public List<ExpenseItem> findExpenseItemByNameInUse(String expItemName) {
		Session session = getSession();
		session.beginTransaction();
		String hql = "from ExpenseItem where expItemName like '%"
				+ "%' and expInuse = 1 order by expItemId";
		List<ExpenseItem> expenseItems = session.createQuery(hql).list();
		session.getTransaction().commit();
		return expenseItems;
	}

}