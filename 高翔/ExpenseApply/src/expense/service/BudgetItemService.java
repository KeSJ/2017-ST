package expense.service;

import java.util.List;

import expense.DAO.BudgetItemDAO;
import expense.model.BudgetItem;

/**
 * Created by lenovo on 2017/7/7 0007.
 */
public class BudgetItemService {
	private BudgetItemDAO budgetItemDAO;

	public BudgetItemDAO getBudgetItemDAO() {
		return budgetItemDAO;
	}

	public void setBudgetItemDAO(BudgetItemDAO budgetItemDAO) {
		this.budgetItemDAO = budgetItemDAO;
	}

	public BudgetItem findBudgetItem(int barcode) {
		return budgetItemDAO.findBudgetItem(barcode);
	}

	public void addBudgetItem(BudgetItem budgetItem) {
		budgetItemDAO.addBudgetItem(budgetItem);
	}

	public void modifyBudgetItem(BudgetItem budgetItem) {
		budgetItemDAO.modifyBudgetItem(budgetItem);
	}
	
	public List<BudgetItem> findByName(String name){
		return budgetItemDAO.findByName(name);
	}
	
	public List<BudgetItem> findAll(){
		return budgetItemDAO.findByName("");
	}
	
	public List<BudgetItem> findAllInUse(){
		return budgetItemDAO.findByNameInUse("");
	}

}
