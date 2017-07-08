package expense.service;

import expense.DAO.TecMngAreaDAO;
import expense.model.TecMngArea;

/**
 * Created by lenovo on 2017/7/7 0007.
 */
public class TecMngAreaService {
        private TecMngAreaDAO tecMngAreaDAO;

        public TecMngAreaDAO getTecMngAreaDAO() {
            return tecMngAreaDAO;
        }

        public void setTecMngAreaDAO(TecMngAreaDAO tecMngAreaDAO) {
            this.tecMngAreaDAO = tecMngAreaDAO;
        }
        public TecMngArea findTecMngArea(String barcode) {
            return tecMngAreaDAO.findTecMngArea(barcode);
        }
        public void addTecMngArea(TecMngArea tecMngArea) {

            tecMngAreaDAO.addTecMngArea(tecMngArea);
        }
        public void modifyTecMngArea(TecMngArea tecMngArea) {
            tecMngAreaDAO.modifyTecMngArea(tecMngArea);
        }


    }


