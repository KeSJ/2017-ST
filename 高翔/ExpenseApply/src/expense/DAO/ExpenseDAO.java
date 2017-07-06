package expense.DAO;

import expense.model.*;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

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

    public void addExpense(Expense expense) {//���
        Session session = getSession();
        session.beginTransaction();
        session.save(expense);
        session.getTransaction().commit();
    }

    public void modifyExpense(Expense expense) {//�޸�
        Session session = getSession();
        session.beginTransaction();
        session.update(expense);
        session.getTransaction().commit();
    }

    public Expense findExpense(String eId) {//ͨ���������
        Session session = getSession();
        session.beginTransaction();
        Expense expense = (Expense) session.get(Expense.class, eId);
        session.getTransaction().commit();
        return expense;
    }

}