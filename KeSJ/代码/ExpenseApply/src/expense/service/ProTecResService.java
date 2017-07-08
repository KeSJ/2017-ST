package expense.service;

import expense.DAO.ProTecResDAO;
import expense.model.ProTecRes;

/**
 * Created by lenovo on 2017/7/7 0007.
 */
public class ProTecResService {

        private ProTecResDAO proTecResDAO;

        public ProTecResDAO getProTecResDAO() {
            return proTecResDAO;
        }

        public void setProTecResDAO(ProTecResDAO proTecResDAO) {
            this.proTecResDAO = proTecResDAO;
        }
        public ProTecRes findProTecRes(String barcode) {
            return proTecResDAO.findProTecRes(barcode);
        }
        public void addProTecRes(ProTecRes proTecRes) {

            proTecResDAO.addProTecRes(proTecRes);
        }
        public void modifyProTecRes(ProTecRes proTecRes) {
            proTecResDAO.addProTecRes(proTecRes);
        }


    }


