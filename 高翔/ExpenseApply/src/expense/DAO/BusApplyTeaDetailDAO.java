package expense.DAO;

import expense.model.BusApplyTeaDetail;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

/**
 * Created by lenovo on 2017/7/9 0009.
 */
public class BusApplyTeaDetailDAO {
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

    public void addBusApplyTeaDetail(BusApplyTeaDetail busApplyTeaDetail) {//添加
        Session session = getSession();
        session.beginTransaction();
        session.save(busApplyTeaDetail);
        session.getTransaction().commit();
    }

    public void modifyBudgetItem(BusApplyTeaDetail busApplyTeaDetail) {//修改
        Session session = getSession();
        session.beginTransaction();
        session.update(busApplyTeaDetail);
        session.getTransaction().commit();
    }

    public BusApplyTeaDetail findBusApplyTeaDetail(String busApplyTeaDetailId) {//通过主码查找
        Session session = getSession();
        session.beginTransaction();
        BusApplyTeaDetail busApplyTeaDetail = (BusApplyTeaDetail) session.get(BusApplyTeaDetail.class, busApplyTeaDetailId);
        session.getTransaction().commit();
        return busApplyTeaDetail;
    }

}
