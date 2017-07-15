package expense.service;

import expense.DAO.BusinessLocationDAO;
import expense.model.BusinessLocation;

/**
 * Created by lenovo on 2017/7/7 0007.
 */
public class BusinessLocationService {
    private BusinessLocationDAO businessLocationDAO;

    public BusinessLocationDAO getBusinessLocationDAO() {
        return businessLocationDAO;
    }

    public void setBusinessLocationDAO(BusinessLocationDAO businessLocationDAO) {
        this.businessLocationDAO = businessLocationDAO;
    }
    public BusinessLocation findBusinessLocation(String barcode) {
        return businessLocationDAO.findBusinessLocation(barcode);
    }
    public void addBusinessLocation(BusinessLocation businessLocation) {

        businessLocationDAO.addBusinessLocation(businessLocation);
    }
    public void modifyBusinessLocation(BusinessLocation businessLocation) {
        businessLocationDAO.modifyBusinessLocation(businessLocation);
    }


}
