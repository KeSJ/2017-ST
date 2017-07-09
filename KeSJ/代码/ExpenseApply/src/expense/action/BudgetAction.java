package expense.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import expense.model.BudgetItem;
import expense.model.ProPlanCategory;
import expense.model.ProTecRes;
import expense.model.TecMngArea;
import expense.service.BudgetItemService;
import expense.service.ProPlanCategoryService;
import expense.service.ProTecResService;
import expense.service.TecMngAreaService;

public class BudgetAction extends ActionSupport {
	private ProPlanCategoryService proPlanCategoryService;
	private ProTecResService proTecResService;
	private TecMngAreaService tecMngAreaService;
	private BudgetItemService budgetItemService;

	private List<ProPlanCategory> proPlanCategories;
	private List<ProTecRes> proTecReses;
	private List<TecMngArea> tecMngAreas;
	private List<BudgetItem> budgetItems;

	public String loadBudgetRequest() throws Exception {
		proPlanCategories = proPlanCategoryService.findAllInUse();
		proTecReses = proTecResService.findAllInUse();
		tecMngAreas = tecMngAreaService.findAllInUse();
		budgetItems = budgetItemService.findAllInUse();
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

}
