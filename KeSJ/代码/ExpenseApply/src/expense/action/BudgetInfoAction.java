package expense.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import expense.model.Budget;
import expense.model.BudgetDetail;
import expense.model.BudgetItem;
import expense.service.BudgetDetailService;
import expense.service.BudgetItemService;
import expense.service.BudgetService;
import expense.service.ProPlanCategoryService;
import expense.service.ProTecResService;
import expense.service.TecMngAreaService;

public class BudgetInfoAction extends ActionSupport {
	private BudgetService budgetService;
	private ProPlanCategoryService proPlanCategoryService;
	private ProTecResService proTecResService;
	private TecMngAreaService tecMngAreaService;
	private BudgetItemService budgetItemService;
	private BudgetDetailService budgetDetailService;

	private List<Budget> budgets;
	private int budId;
	private Budget budget;
	private String ppcName;
	private String tmaName;
	private String ptrName;
	private double total_money;
	private List<BudgetItem> budgetItems;
	
	public String execute(){
		String currentUserType = ActionContext.getContext().getSession().get("currentUserType").toString();
		String currentUserId = ActionContext.getContext().getSession().get("currentUserId").toString();
		//预算信息预览
		if(currentUserType == "教师"){
			budgets = budgetService.findByTeaId(currentUserId);
		}else {
			budgets = budgetService.findAllBudgets();
		}
		for(int i = 0; i < budgets.size(); i++){
			if(budgets.get(i).getBudCheckStaff() == null){
				budgets.get(i).setBudState("未审核");
			}else {
				if(budgets.get(i).isBudResult()){
					budgets.get(i).setBudState("通过");
				}else {
					budgets.get(i).setBudState("不通过");
				}
			}
		}
		if(budId != 0){
			//预算详细信息
			budget = budgetService.findBudget(budId);
			ppcName = proPlanCategoryService.findProPlanCategory(budget.getPpcCode()).getPpcName();
			tmaName = tecMngAreaService.findTecMngArea(budget.getTmaCode()).getTmaName();
			ptrName = proTecResService.findProTecRes(budget.getPtrCode()).getPtrName();
			total_money = budget.getSelfRaised() + budget.getApply();
			//预算条目和金额
			List<BudgetDetail> budgetDetails = budgetDetailService.findByBudId(budId);
			budgetItems = new ArrayList<BudgetItem>();
			for(int i = 0; i < budgetDetails.size(); i++){
				BudgetDetail budgetDetail = budgetDetails.get(i);
				BudgetItem budgetItem = budgetItemService.findBudgetItem(budgetDetail.getBudgetItemId());
				budgetItem.setBudgetItemMoney(budgetDetail.getBudgetDetailSum());
				budgetItems.add(budgetItem);
			}
		}
		return SUCCESS;
	}

	public BudgetService getBudgetService() {
		return budgetService;
	}

	public void setBudgetService(BudgetService budgetService) {
		this.budgetService = budgetService;
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

	public BudgetDetailService getBudgetDetailService() {
		return budgetDetailService;
	}

	public void setBudgetDetailService(BudgetDetailService budgetDetailService) {
		this.budgetDetailService = budgetDetailService;
	}

	public List<Budget> getBudgets() {
		return budgets;
	}

	public Budget getBudget() {
		return budget;
	}

	public String getPpcName() {
		return ppcName;
	}

	public String getTmaName() {
		return tmaName;
	}

	public String getPtrName() {
		return ptrName;
	}

	public double getTotal_money() {
		return total_money;
	}

	public List<BudgetItem> getBudgetItems() {
		return budgetItems;
	}

	public void setBudId(int budId) {
		this.budId = budId;
	}

}
