package expense.service;

import java.util.List;

import expense.DAO.BudgetDAO;
import expense.model.Budget;

/**
 * Created by lenovo on 2017/7/7 0007.
 */
public class BudgetService {
	private BudgetDAO budgetDAO;

	public BudgetDAO getBudgetDAO() {
		return budgetDAO;
	}

	public void setBudgetDAO(BudgetDAO budgetDAO) {
		this.budgetDAO = budgetDAO;
	}

	public Budget findBudget(int barcode) {
		return budgetDAO.findBudet(barcode);
	}

	public void addBudget(Budget budget) {

		budgetDAO.addBudget(budget);
	}

	public void modifyBudget(Budget budget) {
		budgetDAO.modifyBudget(budget);
	}
	
	public List<Budget> findAllBudgets(){
		return budgetDAO.findByName("");
	}
	
	public List<Budget> findAllBudgetsUnpend(){
		return budgetDAO.findByNameUnpend("");
	}

}
