package expense.DAO;

import expense.model.*;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

/**
 * Created by lenovo on 2017/7/6 0006.
 */
public class   TecMngAreaDAO {
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

    public void addTecMngArea(TecMngArea tecMngArea) {//添加
        Session session = getSession();
        session.beginTransaction();
        session.save(tecMngArea);
        session.getTransaction().commit();
    }

    public void modifyTecMngArea(TecMngArea tecMngArea) {//修改
        Session session = getSession();
        session.beginTransaction();
        session.update(tecMngArea);
        session.getTransaction().commit();
    }

    public TecMngArea findTecMngArea(String tmaCode) {//通过主码查找
        Session session = getSession();
        session.beginTransaction();
        TecMngArea tecMngArea  = (TecMngArea) session.get(TecMngArea.class, tmaCode);
        session.getTransaction().commit();
        return tecMngArea;
    }

}