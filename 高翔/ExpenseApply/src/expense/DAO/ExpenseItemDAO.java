package expense.DAO;

import expense.model.*;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

/**
 * Created by lenovo on 2017/7/6 0006.
 */
public class   ExpenseItemDAO {
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

    public void addExpenseItem(ExpenseItem expenseItem) {//添加
        Session session = getSession();
        session.beginTransaction();
        session.save(expenseItem);
        session.getTransaction().commit();
    }

    public void modifyExpenseItem(ExpenseItem expenseItem) {//修改
        Session session = getSession();
        session.beginTransaction();
        session.update(expenseItem);
        session.getTransaction().commit();
    }

    public ExpenseItem findExpenseItem(String expItemId) {//通过主码查找
        Session session = getSession();
        session.beginTransaction();
        ExpenseItem expenseItem= (ExpenseItem) session.get(ExpenseItem.class, expItemId);
        session.getTransaction().commit();
        return expenseItem;
    }

}