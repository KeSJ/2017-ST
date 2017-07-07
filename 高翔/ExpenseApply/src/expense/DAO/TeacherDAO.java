package expense.DAO;

import expense.model.*;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

/**
 * Created by lenovo on 2017/7/6 0006.
 */
public class   TeacherDAO {
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

    public void addTeacher(Teacher teacher) {//���
        Session session = getSession();
        session.beginTransaction();
        session.save(teacher);
        session.getTransaction().commit();
    }

    public void modifyTeacher(Teacher teacher) {//�޸�
        Session session = getSession();
        session.beginTransaction();
        session.update(teacher);
        session.getTransaction().commit();
    }

    public Teacher findTeacher(String tId) {//ͨ���������
        Session session = getSession();
        session.beginTransaction();
        Teacher teacher = (Teacher) session.get(Teacher.class, tId);
        session.getTransaction().commit();
        return teacher;
    }

}