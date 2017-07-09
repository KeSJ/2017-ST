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

	public void addProTecRes(ProTecRes proTecRes) {// 添加
		Session session = getSession();
		session.beginTransaction();
		session.save(proTecRes);
		session.getTransaction().commit();
	}

	public void modifyProTecRes(ProTecRes proTecRes) {// 修改
		Session session = getSession();
		session.beginTransaction();
		session.update(proTecRes);
		session.getTransaction().commit();
	}

	public ProTecRes findProTecRes(String ptrCode) {// 通过主码查找
		Session session = getSession();
		session.beginTransaction();
		ProTecRes proTecRes = (ProTecRes) session.get(ProTecRes.class, ptrCode);
		session.getTransaction().commit();
		return proTecRes;
	}

	// 通过名字模糊查询
	public List<ProTecRes> findByName(String name) {
		Session session = getSession();
		session.beginTransaction();
		String hql = "from ProTecRes where ptrName like '%" + name + "%' order by ptrCode";
		List<ProTecRes> proTecRes = session.createQuery(hql).list();
		session.getTransaction().commit();
		return proTecRes;
	}

}