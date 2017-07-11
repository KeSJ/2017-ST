package expense.action;

import java.util.Date;
import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import expense.model.Budget;
import expense.model.BudgetDetail;
import expense.model.BudgetItem;
import expense.model.ProPlanCategory;
import expense.model.ProTecRes;
import expense.model.TecMngArea;
import expense.service.BudgetDetailService;
import expense.service.BudgetItemService;
import expense.service.BudgetService;
import expense.service.ProPlanCategoryService;
import expense.service.ProTecResService;
import expense.service.TecMngAreaService;

public class BudgetAction extends ActionSupport {
	private ProPlanCategoryService proPlanCategoryService;
	private ProTecResService proTecResService;
	private TecMngAreaService tecMngAreaService;
	private BudgetItemService budgetItemService;
	private BudgetService budgetService;
	private BudgetDetailService budgetDetailService;

	private List<ProPlanCategory> proPlanCategories;
	private List<ProTecRes> proTecReses;
	private List<TecMngArea> tecMngAreas;
	private List<BudgetItem> budgetItems;

	private String project_name;
	private String ppcCode;
	private String tmaCode;
	private String ptrCode;
	private Date start_time;
	private Date end_time;
	private int my_price;
	private int agencies_price;
	private double itemMoney[];
	
	private String returnMsg;

	public String loadBudgetRequest() throws Exception {
		proPlanCategories = proPlanCategoryService.findAllInUse();
		proTecReses = proTecResService.findAllInUse();
		tecMngAreas = tecMngAreaService.findAllInUse();
		budgetItems = budgetItemService.findAllInUse();
		return SUCCESS;
	}
	
	public String budgetRequest() throws Exception{
		Budget budget = new Budget();
		budget.setPpcCode(ppcCode);
		budget.setTmaCode(tmaCode);
		budget.setPtrCode(ptrCode);
		budget.setProjectName(project_name);
		budget.setProStartTime(start_time);
		budget.setProFinishTime(end_time);
		budget.setSelfRaised(my_price);
		budget.setApply(agencies_price);
		budget.setBudAppTea(ActionContext.getContext().getSession().get("currentUserId").toString());
		budget.setBudAppDate(new Date(System.currentTimeMillis()));
		budgetService.addBudget(budget);
		for(int i = 0; i < itemMoney.length; i++){
			if(itemMoney[i] > 0){
				BudgetDetail budgetDetail = new BudgetDetail();
				budgetDetail.setBudgetDetailSum(itemMoney[i]);
				budgetDetail.setBudgetId(budget.getBudId());
				budgetDetail.setBudgetItemId(i + 1);
				budgetDetailService.addBudgetDetail(budgetDetail);
			}
		}
		returnMsg = "申请成功，请等待财务人员审核";
		return SUCCESS;
	}

	public ProPlanCategoryService getProPlanCategoryService() {
		return proPlanCategoryService;
	}

	public void setProPlanCategoryService(ProPlanCategoryService proPlanCategoryService) {
		this.proPlanCategoryService = proPlanCategoryService;
	}

	public ProTecResService getProTecResService() {
		return proTecResService;
	}

	public void setProTecResService(ProTecResService proTecResService) {
		this.proTecResService = proTecResService;
	}

	public TecMngAreaService getTecMngAreaService() {
		return tecMngAreaService;
	}

	public void setTecMngAreaService(TecMngAreaService tecMngAreaService) {
		this.tecMngAreaService = tecMngAreaService;
	}

	public BudgetItemService getBudgetItemService() {
		return budgetItemService;
	}

	public void setBudgetItemService(BudgetItemService budgetItemService) {
		this.budgetItemService = budgetItemService;
	}

	public BudgetService getBudgetService() {
		return budgetService;
	}

	public void setBudgetService(BudgetService budgetService) {
		this.budgetService = budgetService;
	}

	public BudgetDetailService getBudgetDetailService() {
		return budgetDetailService;
	}

	public void setBudgetDetailService(BudgetDetailService budgetDetailService) {
		this.budgetDetailService = budgetDetailService;
	}

	public List<ProPlanCategory> getProPlanCategories() {
		return proPlanCategories;
	}

	public List<ProTecRes> getProTecReses() {
		return proTecReses;
	}

	public List<TecMngArea> getTecMngAreas() {
		return tecMngAreas;
	}

	public List<BudgetItem> getBudgetItems() {
		return budgetItems;
	}

	public void setBudgetItems(List<BudgetItem> budgetItems) {
		this.budgetItems = budgetItems;
	}

	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}

	public void setPpcCode(String ppcCode) {
		this.ppcCode = ppcCode;
	}

	public void setTmaCode(String tmaCode) {
		this.tmaCode = tmaCode;
	}

	public void setPtrCode(String ptrCode) {
		this.ptrCode = ptrCode;
	}

	public void setStart_time(Date start_time) {
		this.start_time = start_time;
	}

	public void setEnd_time(Date end_time) {
		this.end_time = end_time;
	}

	public void setMy_price(int my_price) {
		this.my_price = my_price;
	}

	public void setAgencies_price(int agencies_price) {
		this.agencies_price = agencies_price;
	}

	public void setItemMoney(double[] itemMoney) {
		this.itemMoney = itemMoney;
	}

	public String getReturnMsg() {
		return returnMsg;
	}
	
}
