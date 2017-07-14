package expense.DAO;


import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

import expense.model.Expense;

/**
 * Created by lenovo on 2017/7/6 0006.
 */
public class   ExpenseDAO {
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

    public void addExpense(Expense expense) {//添加
        Session session = getSession();
        session.beginTransaction();
        session.save(expense);
        session.getTransaction().commit();
    }

    public void modifyExpense(Expense expense) {//修改
        Session session = getSession();
        session.beginTransaction();
        session.update(expense);
        session.getTransaction().commit();
    }

    public Expense findExpense(int eId) {//通过主码查找
        Session session = getSession();
        session.beginTransaction();
        Expense expense = (Expense) session.get(Expense.class, eId);
        session.getTransaction().commit();
        return expense;
    }
    
    public List<Expense> findAll(){
		Session session = getSession();
		session.beginTransaction();
		String hql = "from Expense";
		List<Expense> expenses = session.createQuery(hql).list();
		session.getTransaction().commit();
		return expenses;
	}
	
	public List<Expense> findAllUnpend(){
		Session session = getSession();
		session.beginTransaction();
		String hql = "from Expense where eCheckStaff is null order by eId";
		List<Expense> expenses = session.createQuery(hql).list();
		session.getTransaction().commit();
		return expenses;
	}

}