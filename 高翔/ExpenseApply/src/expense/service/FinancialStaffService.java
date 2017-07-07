package expense.service;

import expense.DAO.FinancialStaffDAO;
import expense.model.FinancialStaff;

/**
 * Created by lenovo on 2017/7/7 0007.
 */
public class FinancialStaffService {
    private FinancialStaffDAO financialStaffDAO;

    public FinancialStaffDAO getFinancialStaffDAO() {
        return financialStaffDAO;
    }

    public void setFinancialStaffDAO(FinancialStaffDAO financialStaffDAO) {
        this.financialStaffDAO = financialStaffDAO;
    }
    public FinancialStaff findFinancialStaff(String barcode) {
        return financialStaffDAO.findFinancialStaff(barcode);
    }
    public void addFinancialStaff(FinancialStaff financialStaff) {

        financialStaffDAO.addFinancialStaff(financialStaff);
    }
    public void modifyFinancialStaff(FinancialStaff financialStaff) {
        financialStaffDAO.modifyFinancialStaff(financialStaff);
    }


}
