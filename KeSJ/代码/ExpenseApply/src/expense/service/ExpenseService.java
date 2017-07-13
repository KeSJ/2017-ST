package expense.service;

import expense.DAO.ExpenseDAO;
import expense.model.Expense;

/**
 * Created by lenovo on 2017/7/7 0007.
 */
public class ExpenseService {
    private ExpenseDAO expenseDAO;

    public ExpenseDAO getExpenseDAO() {
        return expenseDAO;
    }

    public void setExpenseDAO(ExpenseDAO expenseDAO) {
        this.expenseDAO = expenseDAO;
    }
    public Expense findExpense(int barcode) {
        return expenseDAO.findExpense(barcode);
    }
    public void addExpense(Expense expense) {

        expenseDAO.addExpense(expense);
    }
    public void modifyExpense(Expense expense) {
        expenseDAO.modifyExpense(expense);
    }


}
