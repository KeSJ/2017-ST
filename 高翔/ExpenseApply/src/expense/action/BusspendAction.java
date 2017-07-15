package expense.action;

import java.util.ArrayList;
import java.util.List;

import expense.DAO.AcceptDAO;
import expense.DAO.BudgetDAO;
import expense.DAO.BusApplyTeaDetailDAO;
import expense.DAO.BusinessDAO;
import expense.DAO.BusinessItemDAO;
import expense.model.Accept;
import expense.model.Budget;
import expense.model.BusApplyTeaDetail;
import expense.model.Business;
import expense.model.BusinessItem;
import expense.model.ZhuanYong;

public class BusspendAction 
{
	private BusinessDAO businessDAO = new BusinessDAO();
	private List<Business> businesses; 
	private int itemId;
	private List<Budget> budgets= new ArrayList<Budget>();
	private BudgetDAO budgetDAO;
	private BusApplyTeaDetailDAO busApplyTeaDetailDAO;
	private BusinessItemDAO businessItemDAO;
	private AcceptDAO acceptDAO;
	private List<BusApplyTeaDetail> busApplyTeaDetails= new ArrayList<BusApplyTeaDetail>();
	private List<ZhuanYong> zhuanYongs = new ArrayList<ZhuanYong>();
	private List<BusinessItem>businessItems = new ArrayList<BusinessItem>();
	
	public String load() throws Exception 
    {
//    	businessitems= businessItemDAO.findAllBusinessItem();
//    	
//    	System.out.println(budgetDetailDAO.findBudgetDetailByBudIDandBudItemIDetail(313, 5).getBudgetDetailSum()+"差旅费预算");
//    	return "success";
		businesses = businessDAO.findBusinessByBusCheckDate();
		System.out.println("businesses的长度为"+businesses.size());
		for (int i = 0; i < businesses.size(); i++) 
		{
			System.out.println("length"+businesses.size());
			Budget budget = budgetDAO.findBudet(businesses.get(i).getBudgetId());
			budgets.add(budget);//找到所有未通过的Business的项目的名字。
			int bId =businesses.get(i).getBusinessId();//取出当前的businessID
			System.out.println("bId"+bId);			
			ZhuanYong zhuanYong = new ZhuanYong();
			zhuanYong.setProjectName(budget.getProjectName());
			zhuanYong.setTeacherName(acceptDAO.findAcceptByApplyId(bId).get(0).getTeacherId());
			zhuanYongs.add(zhuanYong);
			//开始出差条目了！
			businessItems=businessItemDAO.findAllBusinessItem();
			
							
		}
		return "success";
    }


	public AcceptDAO getAcceptDAO() {
		return acceptDAO;
	}


	public void setAcceptDAO(AcceptDAO acceptDAO) {
		this.acceptDAO = acceptDAO;
	}


	public List<ZhuanYong> getZhuanYongs() {
		return zhuanYongs;
	}


	public void setZhuanYongs(List<ZhuanYong> zhuanYongs) {
		this.zhuanYongs = zhuanYongs;
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
	public String stopBusinessItem() throws Exception {
		BusinessItem businessItem =businessItemDAO.findBusinessItem(itemId);
		businessItem.setBusItemInUse(false);
		businessItemDAO.modifyBusinessItem(businessItem);
		//loadExpensePend();
;
//		ExpenseItem expenseItem = expenseItemService.findExpenseItem(itemId);
//		expenseItem.setExpInuse(false);
//		expenseItemService.modifyExpenseItem(expenseItem);
		return "success";
	}

	public String startBusinessItem() throws Exception {
		BusinessItem businessItem =businessItemDAO.findBusinessItem(itemId);
		businessItem.setBusItemInUse(true);
		businessItemDAO.modifyBusinessItem(businessItem);

		return "success";

	}


	public int getItemId() {
		return itemId;
	}


	public void setItemId(int itemId) {
		this.itemId = itemId;
	}


	public BusinessItemDAO getBusinessItemDAO() {
		return businessItemDAO;
	}


	public void setBusinessItemDAO(BusinessItemDAO businessItemDAO) {
		this.businessItemDAO = businessItemDAO;
	}


	public List<BusinessItem> getBusinessItems() {
		return businessItems;
	}


	public void setBusinessItems(List<BusinessItem> businessItems) {
		this.businessItems = businessItems;
	}
	

}
