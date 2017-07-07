package expense.service;

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
    public BudgetItem findBudgetItem(String barcode) {
        return budgetItemDAO.findBudgetItem(barcode);
    }
    public void addBudgetItem(BudgetItem budgetItem) {
        budgetItemDAO.addBudgetItem(budgetItem);
    }
    public void modifyBudgetItem(BudgetItem budgetItem) {
        budgetItemDAO.modifyBudgetItem(budgetItem);
    }


}
