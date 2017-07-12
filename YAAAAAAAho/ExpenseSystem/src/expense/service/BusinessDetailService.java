package expense.service;

import expense.DAO.BusinessDetailDAO;
import expense.model.BusinessDetail;

/**
 * Created by lenovo on 2017/7/7 0007.
 */
public class BusinessDetailService {
    private BusinessDetailDAO businessDetailDAO;

    public BusinessDetailDAO getBusinessDetailDAO() {
        return businessDetailDAO;
    }

    public void setBusinessDetailDAO(BusinessDetailDAO businessDetailDAO) {
        this.businessDetailDAO = businessDetailDAO;
    }
    public BusinessDetail findBusinessDetail(String barcode) {
        return businessDetailDAO.findBusinessDetail(barcode);
    }
    public void addBusinessDetail(BusinessDetail businessDetail) {

        businessDetailDAO.addBusinessDetail(businessDetail);
    }
    public void modifyBusinessDetail(BusinessDetail businessDetail) {
        businessDetailDAO.modifyBusinessDetail(businessDetail);
    }


}
