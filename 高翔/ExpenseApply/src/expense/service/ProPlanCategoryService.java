package expense.service;

import expense.DAO.ProPlanCategoryDAO;
import expense.model.ProPlanCategory;

/**
 * Created by lenovo on 2017/7/7 0007.
 */
public class ProPlanCategoryService {
    private ProPlanCategoryDAO proPlanCategoryDAO;

    public ProPlanCategoryDAO getProPlanCategoryDAO() {
        return proPlanCategoryDAO;
    }

    public void setProPlanCategoryDAO(ProPlanCategoryDAO proPlanCategoryDAO) {
        this.proPlanCategoryDAO = proPlanCategoryDAO;
    }
    public ProPlanCategory findProPlanCategory(String barcode) {
        return proPlanCategoryDAO.findProPlanCategory(barcode);
    }
    public void addProPlanCategory(ProPlanCategory proPlanCategory) {

        proPlanCategoryDAO.addProPlanCategory(proPlanCategory);
    }
    public void modifyProPlanCategory(ProPlanCategory proPlanCategory) {
        proPlanCategoryDAO.modifyProPlanCategory(proPlanCategory);
    }


}
