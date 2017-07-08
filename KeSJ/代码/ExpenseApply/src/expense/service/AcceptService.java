package expense.service;

import expense.DAO.AcceptDAO;
import expense.model.Accept;

/**
 * Created by lenovo on 2017/7/7 0007.
 */
public class AcceptService {
    private AcceptDAO acceptDAO;

    public AcceptDAO getAcceptDAO() {
        return acceptDAO;
    }

    public void setAcceptDAO(AcceptDAO acceptDAO) {
        this.acceptDAO = acceptDAO;
    }
    public Accept findAccept(String barcode) {
        return acceptDAO.findAccept(barcode);
    }
    public void addAccept(Accept accept) {

        acceptDAO.addAccept(accept);
    }
    public void modifyAccept(Accept accept) {
        acceptDAO.modifyAccept(accept);
    }


}
