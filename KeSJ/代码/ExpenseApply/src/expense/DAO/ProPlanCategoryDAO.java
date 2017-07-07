package expense.DAO;

import expense.model.*;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

/**
 * Created by lenovo on 2017/7/6 0006.
 */
public class   ProPlanCategoryDAO {
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

    public void addProPlanCategory(ProPlanCategory proPlanCategory) {//添加
        Session session = getSession();
        session.beginTransaction();
        session.save(proPlanCategory);
        session.getTransaction().commit();
    }

    public void modifyProPlanCategory(ProPlanCategory proPlanCategory) {//修改
        Session session = getSession();
        session.beginTransaction();
        session.update(proPlanCategory);
        session.getTransaction().commit();
    }

    public ProPlanCategory findProPlanCategory(String ppcCode) {//通过主码查找
        Session session = getSession();
        session.beginTransaction();
       ProPlanCategory proPlanCategory= (ProPlanCategory) session.get(ProPlanCategory.class, ppcCode);
        session.getTransaction().commit();
        return proPlanCategory;
    }

}