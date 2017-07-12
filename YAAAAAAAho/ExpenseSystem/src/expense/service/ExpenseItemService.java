package expense.service;

import expense.DAO.ExpenseItemDAO;
import expense.model.ExpenseItem;

/**
 * Created by lenovo on 2017/7/7 0007.
 */
public class ExpenseItemService {
    private ExpenseItemDAO  expenseItemDAO;

    public ExpenseItemDAO getExpenseItemDAO() {
        return expenseItemDAO;
    }

    public void setExpenseItemDAO(ExpenseItemDAO expenseItemDAO) {
        this.expenseItemDAO =expenseItemDAO;
    }
    public ExpenseItem findExpenseItem(String barcode) {
        return expenseItemDAO.findExpenseItem(barcode);
    }
    public void addExpenseItem(ExpenseItem expenseItem) {

        expenseItemDAO.addExpenseItem(expenseItem);
    }
    public void modifyExpenseItem(ExpenseItem expenseItem) {
        expenseItemDAO.modifyExpenseItem(expenseItem);
    }





}
