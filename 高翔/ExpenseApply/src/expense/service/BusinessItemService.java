package expense.service;

import expense.DAO.BusinessItemDAO;
import expense.model.BusinessItem;

/**
 * Created by lenovo on 2017/7/7 0007.
 */
public class BusinessItemService {
    private BusinessItemDAO businessItemDAO;

    public BusinessItemDAO getBusinessItemDAO() {
        return businessItemDAO;
    }

    public void setBusinessItemDAO(BusinessItemDAO businessItemDAO) {
        this.businessItemDAO = businessItemDAO;
    }
    public BusinessItem findBusinessItem(int barcode) {
        return businessItemDAO.findBusinessItem(barcode);
    }
    public void addBusinessItem(BusinessItem businessItem) {
        businessItemDAO.addBusinessItem(businessItem);

    }
    public void modifyBusinessItem(BusinessItem businessItem) {
        businessItemDAO.modifyBusinessItem(businessItem);
    }



}
