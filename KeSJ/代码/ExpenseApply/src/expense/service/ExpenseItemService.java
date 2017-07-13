package expense.service;

import java.util.ArrayList;
import java.util.List;

import expense.DAO.BudgetItemDAO;
import expense.DAO.ExpenseItemDAO;
import expense.model.BudgetItem;
import expense.model.ExpenseItem;

/**
 * Created by lenovo on 2017/7/7 0007.
 */
public class ExpenseItemService {
	private ExpenseItemDAO expenseItemDAO;
	private BudgetItemDAO budgetItemDAO;

	public ExpenseItemDAO getExpenseItemDAO() {
		return expenseItemDAO;
	}

	public void setExpenseItemDAO(ExpenseItemDAO expenseItemDAO) {
		this.expenseItemDAO = expenseItemDAO;
	}

	public BudgetItemDAO getBudgetItemDAO() {
		return budgetItemDAO;
	}

	public void setBudgetItemDAO(BudgetItemDAO budgetItemDAO) {
		this.budgetItemDAO = budgetItemDAO;
	}

	public ExpenseItem findExpenseItem(int barcode) {
		return expenseItemDAO.findExpenseItem(barcode);
	}

	public void addExpenseItem(ExpenseItem expenseItem) {

		expenseItemDAO.addExpenseItem(expenseItem);
	}

	public void modifyExpenseItem(ExpenseItem expenseItem) {
		expenseItemDAO.modifyExpenseItem(expenseItem);
	}
	
	public List<ExpenseItem> findAll(){
		return expenseItemDAO.findExpenseItemsByName("");
	}
	
	public List<ExpenseItem> findAllInUse(){
		List<ExpenseItem> expenseItems = expenseItemDAO.findExpenseItemByNameInUse("");
		List<ExpenseItem> result = new ArrayList<ExpenseItem>();
		for(int i = 0; i < expenseItems.size(); i++){
			BudgetItem budgetItem = budgetItemDAO.findBudgetItem(expenseItems.get(i).getBudItemId());
			if(budgetItem.isBudgetInUse()){
				result.add(expenseItems.get(i));
			}
		}
		return result;
	}

}
