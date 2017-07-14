package expense.DAO;

import expense.model.*;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

/**
 * Created by lenovo on 2017/7/6 0006.
 */
public class ProTecResDAO {
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

	public void addProTecRes(ProTecRes proTecRes) {// ���
		Session session = getSession();
		session.beginTransaction();
		session.save(proTecRes);
		session.getTransaction().commit();
	}

	public void modifyProTecRes(ProTecRes proTecRes) {// �޸�
		Session session = getSession();
		session.beginTransaction();
		session.update(proTecRes);
		session.getTransaction().commit();
	}

	public ProTecRes findProTecRes(String ptrCode) {// ͨ���������
		Session session = getSession();
		session.beginTransaction();
		ProTecRes proTecRes = (ProTecRes) session.get(ProTecRes.class, ptrCode);
		session.getTransaction().commit();
		return proTecRes;
	}

	// ͨ������ģ����ѯ
	public List<ProTecRes> findByName(String name) {
		Session session = getSession();
		session.beginTransaction();
		String hql = "from ProTecRes where ptrName like '%" + name + "%' order by ptrCode";
		List<ProTecRes> proTecRes = session.createQuery(hql).list();
		session.getTransaction().commit();
		return proTecRes;
	}
	public List<ProTecRes> findByNameInUse(String name) {
		Session session = getSession();
		session.beginTransaction();
		String hql = "from ProTecRes where ptrName like '%" + name + "%' and ptrInUse = 1 order by ptrCode";
		List<ProTecRes> proTecRes = session.createQuery(hql).list();
		session.getTransaction().commit();
		return proTecRes;
	}
}