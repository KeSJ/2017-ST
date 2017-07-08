package expense.service;

import expense.DAO.BusinessDAO;
import expense.model.Business;

/**
 * Created by lenovo on 2017/7/7 0007.
 */
public class BusinessService {
    private BusinessDAO businessDAO;

    public BusinessDAO getBusinessDAO() {
        return businessDAO;
    }

    public void setBusinessDAO(BusinessDAO businessDAO) {
        this.businessDAO = businessDAO;
    }
    public Business findBusiness(String barcode) {
        return businessDAO.findBusiness(barcode);
    }
    public void addBusiness(Business business) {

        businessDAO.addBusiness(business);
    }
    public void modifyBusiness(Business business) {
        businessDAO.modifyBusiness(business);
    }


}
