package expense.service;

import java.util.List;

import expense.DAO.ExpenseDetailDAO;
import expense.model.ExpenseDetail;

/**
 * Created by lenovo on 2017/7/7 0007.
 */
public class ExpenseDetailService {
	private ExpenseDetailDAO expenseDetailDAO;

	public ExpenseDetailDAO getExpenseDetailDAO() {
		return expenseDetailDAO;
	}

	public void setExpenseDetailDAO(ExpenseDetailDAO expenseDetailDAO) {
		this.expenseDetailDAO = expenseDetailDAO;
	}

	public ExpenseDetail findExpendDetail(String barcode) {
		return expenseDetailDAO.findExpendDetail(barcode);
	}

	public void addExpendDetail(ExpenseDetail expendDetail) {

		expenseDetailDAO.addExpendDetail(expendDetail);
	}

	public void modifyExpendDetail(ExpenseDetail expendDetail) {
		expenseDetailDAO.modifyExpendDetail(expendDetail);
	}
	
	public List<ExpenseDetail> findByEId(int eId){
		return expenseDetailDAO.findByEId(eId);
	}

}
