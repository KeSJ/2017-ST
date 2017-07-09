package expense.service;

import expense.DAO.ExpendDetailDAO;
import expense.model.ExpendDetail;

/**
 * Created by lenovo on 2017/7/7 0007.
 */
public class ExpendDetailService {
    private ExpendDetailDAO expendDetailDAO;

    public ExpendDetailDAO getExpendDetailDAO() {
        return expendDetailDAO;
    }

    public void setExpendDetailDAO(ExpendDetailDAO expendDetailDAO) {
        this.expendDetailDAO = expendDetailDAO;
    }
    public ExpendDetail findExpendDetail(String barcode) {
     return   expendDetailDAO.findExpendDetail(barcode);
    }
    public void addExpendDetail(ExpendDetail expendDetail) {

        expendDetailDAO.addExpendDetail(expendDetail);
    }
    public void modifyExpendDetail(ExpendDetail expendDetail) {
        expendDetailDAO.modifyExpendDetail(expendDetail);
    }


}
