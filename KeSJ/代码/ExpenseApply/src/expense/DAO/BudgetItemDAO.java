package expense.DAO;

import expense.model.Appendix;
import expense.model.BudgetDetail;
import expense.model.BudgetItem;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

/**
 * Created by lenovo on 2017/7/6 0006.
 */
public class BudgetItemDAO {
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

    public void addBudgetItem(BudgetItem budgetItem) {//添加
        Session session = getSession();
        session.beginTransaction();
        session.save(budgetItem);
        session.getTransaction().commit();
    }

    public void modifyBudgetItem(BudgetItem budgetItem) {//修改
        Session session = getSession();
        session.beginTransaction();
        session.update(budgetItem);
        session.getTransaction().commit();
    }

    public BudgetItem findBudgetItem(int budgetItemId) {//通过主码查找
        Session session = getSession();
        session.beginTransaction();
        BudgetItem budgetItem = (BudgetItem) session.get(BudgetItem.class, budgetItemId);
        session.getTransaction().commit();
        return budgetItem;
    }
    
    public List<BudgetItem> findByName(String name){
    	Session session = getSession();
    	session.beginTransaction();
    	String hql = "from BudgetItem where budgetItemName like '%" + name + "%' order by budgetItemId";
    	List<BudgetItem> budgetItems = session.createQuery(hql).list();
    	session.getTransaction().commit();
    	return budgetItems;
    }
    
    public List<BudgetItem> findByNameInUse(String name){
    	Session session = getSession();
    	session.beginTransaction();
    	String hql = "from BudgetItem where budgetItemName like '%" + name + "%' and budgetInUse = 1 order by budgetItemId";
    	List<BudgetItem> budgetItems = session.createQuery(hql).list();
    	session.getTransaction().commit();
    	return budgetItems;
    }
}
