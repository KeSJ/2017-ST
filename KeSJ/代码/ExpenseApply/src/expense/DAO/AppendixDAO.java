package expense.DAO;

import expense.model.Appendix;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

/**
 * Created by lenovo on 2017/7/6 0006.
 */
public class AppendixDAO {
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

    public void addAppedendix(Appendix appendix) {//���
        Session session = getSession();
        session.beginTransaction();
        session.save(appendix);
        session.getTransaction().commit();
    }
    public void modifyAppendix(Appendix appendix) {//�޸�
        Session session = getSession();
        session.beginTransaction();
        session.update(appendix);
        session.getTransaction().commit();
    }
    public Appendix findAppendix(String appendixId) {//ͨ���������
        Session session = getSession();
        session.beginTransaction();
        Appendix appendix = (Appendix) session.get(Appendix.class, appendixId);
        session.getTransaction().commit();
        return appendix;
    }

}
