package expense.DAO;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

import expense.model.BusApplyTeaDetail;
import expense.model.Business;


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

	    public void modifyBusApplyTeaDetail(BusApplyTeaDetail busApplyTeaDetail) {//修改
	        Session session = getSession();
	        session.beginTransaction();
	        session.update(busApplyTeaDetail);
	        session.getTransaction().commit();
	    }

	    public BusApplyTeaDetail findBusApplyTeaDetail(int  busApplyTeaDetailId ) {//通过主码查找
	        Session session = getSession();
	        session.beginTransaction();
	        BusApplyTeaDetail busApplyTeaDetail = (BusApplyTeaDetail) session.get(BusApplyTeaDetail.class,  busApplyTeaDetailId);
	        session.getTransaction().commit();
	        return busApplyTeaDetail;
	    }
	    public List<BusApplyTeaDetail> findBusinessByBusinessId(int businessId)
	    {
	    	System.out.println(businessId+"businessid");
	    	Session session = getSession();
	        session.beginTransaction();
	        String hql = "from busapplyteadetail where BusinessId =  "+businessId;
	        List<BusApplyTeaDetail> BusApplyTeaDetails = session.createQuery(hql).list();
	        session.getTransaction().commit();
	        return BusApplyTeaDetails;
	    }
	    

}
