package expense.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import expense.model.Budget;
import expense.model.Expense;
import expense.model.ExpenseDetail;
import expense.model.ExpenseItem;
import expense.service.BudgetService;
import expense.service.ExpenseDetailService;
import expense.service.ExpenseItemService;
import expense.service.ExpenseService;
import expense.service.ProPlanCategoryService;
import expense.service.ProTecResService;
import expense.service.TecMngAreaService;

public class ExpenseInfoAction extends ActionSupport {

	private ExpenseService expenseService;
	private BudgetService budgetService;
	private ProPlanCategoryService proPlanCategoryService;
	private ProTecResService proTecResService;
	private TecMngAreaService tecMngAreaService;
	private ExpenseItemService expenseItemService;
	private ExpenseDetailService expenseDetailService;

	private List<Expense> expenses;
	private int expId;
	private Budget budget;
	private String ppcName;
	private String tmaName;
	private String ptrName;
	private double total_money;
	private List<ExpenseItem> expenseItems;
	private String reason;

	public String execute() {
		String currentUserType = ActionContext.getContext().getSession().get("currentUserType").toString();
		String currentUserId = ActionContext.getContext().getSession().get("currentUserId").toString();
		// 报销单信息预览
		if (currentUserType.equals("教师")) {
			expenses = expenseService.findByTeaId(currentUserId);
		} else {
			expenses = expenseService.findAll();
		}
		for (int i = 0; i < expenses.size(); i++) {
			Budget budget2 = budgetService.findBudget(expenses.get(i).getBudId());
			expenses.get(i).setProName(budget2.getProjectName());
			if (expenses.get(i).geteCheckStaff() == null) {
				expenses.get(i).seteState("未审核");
			} else {
				if (expenses.get(i).iseResult()) {
					expenses.get(i).seteState("通过");
				} else {
					expenses.get(i).seteState("不通过");
				}
			}
		}
		if (expId != 0) {
			// 报销单详细信息
			Expense expense = expenseService.findExpense(expId);
			reason = expense.geteRejectReason();
			budget = budgetService.findBudget(expense.getBudId());
			ppcName = proPlanCategoryService.findProPlanCategory(budget.getPpcCode()).getPpcName();
			tmaName = tecMngAreaService.findTecMngArea(budget.getTmaCode()).getTmaName();
			ptrName = proTecResService.findProTecRes(budget.getPtrCode()).getPtrName();
			total_money = budget.getSelfRaised() + budget.getApply();
			/* System.out.println(expense.iseResult()); */
			// 报销条目和金额
			List<ExpenseDetail> expenseDetails = expenseDetailService.findByEId(expId);
			expenseItems = new ArrayList<ExpenseItem>();
			System.out.println("预算条目数：" + expenseDetails.size());
			for (int i = 0; i < expenseDetails.size(); i++) {
				ExpenseDetail expenseDetail = expenseDetails.get(i);
				ExpenseItem expenseItem = expenseItemService.findExpenseItem(expenseDetail.getExpItemId());
				expenseItem.setExpMoney(expenseDetail.getExpDetSum());
				expenseItems.add(expenseItem);
			}
		}
		return SUCCESS;
	}

	public ExpenseService getExpenseService() {
		return expenseService;
	}

	public void setExpenseService(ExpenseService expenseService) {
		this.expenseService = expenseService;
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

	public ExpenseItemService getExpenseItemService() {
		return expenseItemService;
	}

	public void setExpenseItemService(ExpenseItemService expenseItemService) {
		this.expenseItemService = expenseItemService;
	}

	public ExpenseDetailService getExpenseDetailService() {
		return expenseDetailService;
	}

	public void setExpenseDetailService(ExpenseDetailService expenseDetailService) {
		this.expenseDetailService = expenseDetailService;
	}

	public List<Expense> getExpenses() {
		return expenses;
	}

	public void setExpId(int expId) {
		this.expId = expId;
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

	public List<ExpenseItem> getExpenseItems() {
		return expenseItems;
	}

	public String getReason() {
		return reason;
	}

}
