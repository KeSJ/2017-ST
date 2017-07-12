package expense.DAO;

import expense.model.*;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

/**
 * Created by lenovo on 2017/7/6 0006.
 */
public class ProPlanCategoryDAO {
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

	public void addProPlanCategory(ProPlanCategory proPlanCategory) {// 添加
		Session session = getSession();
		session.beginTransaction();
		session.save(proPlanCategory);
		session.getTransaction().commit();
	}

	public void modifyProPlanCategory(ProPlanCategory proPlanCategory) {// 修改
		Session session = getSession();
		session.beginTransaction();
		session.update(proPlanCategory);
		session.getTransaction().commit();
	}

	public ProPlanCategory findProPlanCategory(String ppcCode) {// 通过主码查找
		Session session = getSession();
		session.beginTransaction();
		ProPlanCategory proPlanCategory = (ProPlanCategory) session.get(ProPlanCategory.class, ppcCode);
		session.getTransaction().commit();
		return proPlanCategory;
	}

	// 通过名字模糊查询
	public List<ProPlanCategory> findProPlanCategoryByName(String name) {
		Session session = getSession();
		session.beginTransaction();
		String hql = "from ProPlanCategory where ppcName like '%" + name + "%' order by ppcCode";
		List<ProPlanCategory> planCategories = session.createQuery(hql).list();
		session.getTransaction().commit();
		return planCategories;
	}
	
	// 通过名字模糊查询可用的PPC
		public List<ProPlanCategory> findByNameInUser(String name) {
			Session session = getSession();
			session.beginTransaction();
			String hql = "from ProPlanCategory where ppcName like '%" + name + "%' and ppcInUse = 1 order by ppcCode";
			List<ProPlanCategory> planCategories = session.createQuery(hql).list();
			session.getTransaction().commit();
			return planCategories;
		}

}