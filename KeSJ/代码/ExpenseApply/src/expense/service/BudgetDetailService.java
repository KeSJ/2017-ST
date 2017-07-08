package expense.service;

import expense.DAO.BudgetDAO;
import expense.DAO.BudgetDetailDAO;
import expense.DAO.FinancialStaffDAO;
import expense.model.BudgetDetail;
import expense.model.FinancialStaff;

/**
 * Created by lenovo on 2017/7/7 0007.
 */
public class BudgetDetailService {
    private BudgetDetailDAO budgetDetailDAO;

    public BudgetDetailDAO getBudgetDetailDAO() {
        return budgetDetailDAO;
    }

    public void setBudgetDetailDAO(BudgetDetailDAO budgetDetailDAO) {
        this.budgetDetailDAO = budgetDetailDAO;
    }
    public BudgetDetail findBudgetDetail(String barcode) {
        return budgetDetailDAO.findBudgetDetail(barcode);
    }
    public void addBudgetDetail(BudgetDetail budgetDetail) {

        budgetDetailDAO.addBudgetDetail(budgetDetail);
    }
    public void modifyBudgetDetail(BudgetDetail budgetDetail) {
        budgetDetailDAO.modifyBudgetDetail(budgetDetail);
    }


}
