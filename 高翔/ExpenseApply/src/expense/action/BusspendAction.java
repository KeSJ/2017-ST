package expense.action;

import java.util.ArrayList;
import java.util.List;

import expense.DAO.BudgetDAO;
import expense.DAO.BusApplyTeaDetailDAO;
import expense.DAO.BusinessDAO;
import expense.model.Budget;
import expense.model.BusApplyTeaDetail;
import expense.model.Business;

public class BusspendAction 
{
	BusinessDAO businessDAO = new BusinessDAO();
	private List<Business> businesses; 
	private List<Budget> budgets= new ArrayList<Budget>();
	private BudgetDAO budgetDAO;
	private BusApplyTeaDetailDAO busApplyTeaDetailDAO;
	private List<BusApplyTeaDetail> busApplyTeaDetails= new ArrayList<BusApplyTeaDetail>();
	
	public String load() throws Exception 
    {
//    	businessitems= businessItemDAO.findAllBusinessItem();
//    	
//    	System.out.println(budgetDetailDAO.findBudgetDetailByBudIDandBudItemIDetail(313, 5).getBudgetDetailSum()+"���÷�Ԥ��");
//    	return "success";
		businesses = businessDAO.findBusinessByBusCheckDate();
		System.out.println("businesses�ĳ���Ϊ"+businesses.size());
		for (int i = 0; i < businesses.size(); i++) 
		{
			//businesses.get(i).getBudgetId();
			Budget budget = budgetDAO.findBudet(businesses.get(i).getBudgetId());
//			System.out.println(budget.getApply()+budget.getBudAppTea());
			budgets.add(budget);//�ҵ�����δͨ����Business����Ŀ�����֡�
			//System.out.println(budgetDAO.findBudet(businesses.get(i).getBudgetId()).getProjectName());
			//busApplyTeaDetails.add(busApplyTeaDetailDAO.findBusinessByBusinessId(businesses.get(i).getBusinessId()).get(0));//�������ҳ��걨�˵�
			busApplyTeaDetailDAO.findBusinessByBusinessId(1);
			
		}
		return "success";
    }


	public BusApplyTeaDetailDAO getBusApplyTeaDetailDAO() {
		return busApplyTeaDetailDAO;
	}


	public void setBusApplyTeaDetailDAO(BusApplyTeaDetailDAO busApplyTeaDetailDAO) {
		this.busApplyTeaDetailDAO = busApplyTeaDetailDAO;
	}


	public List<BusApplyTeaDetail> getBusApplyTeaDetails() {
		return busApplyTeaDetails;
	}


	public void setBusApplyTeaDetails(List<BusApplyTeaDetail> busApplyTeaDetails) {
		this.busApplyTeaDetails = busApplyTeaDetails;
	}


	public BusinessDAO getBusinessDAO() {
		return businessDAO;
	}


	public void setBusinessDAO(BusinessDAO businessDAO) {
		this.businessDAO = businessDAO;
	}


	public List<Business> getBusinesses() {
		return businesses;
	}


	public void setBusinesses(List<Business> businesses) {
		this.businesses = businesses;
	}


	public List<Budget> getBudgets() {
		return budgets;
	}


	public void setBudgets(List<Budget> budgets) {
		this.budgets = budgets;
	}


	public BudgetDAO getBudgetDAO() {
		return budgetDAO;
	}


	public void setBudgetDAO(BudgetDAO budgetDAO) {
		this.budgetDAO = budgetDAO;
	}
	

}
