package expense.service;

import expense.DAO.BudgetDAO;
import expense.DAO.FinancialStaffDAO;
import expense.model.Budget;
import expense.model.FinancialStaff;

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
    public Budget findBudget(String barcode) {
        return budgetDAO.findBudet(barcode);
    }
    public void addBudget(Budget budget) {

        budgetDAO.addBudget(budget);
    }
    public void modifyBudget(Budget budget) {
        budgetDAO.modifyBudget(budget);
    }


}
