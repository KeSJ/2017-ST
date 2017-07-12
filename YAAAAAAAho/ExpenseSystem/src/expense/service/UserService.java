package expense.service;

import expense.DAO.UserDAO;
import expense.model.User;

/**
 * Created by lenovo on 2017/7/7 0007.
 */
public class UserService {

	private UserDAO userDAO;

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public User findUser(String barcode) {
		return userDAO.findUser(barcode);
	}

	public void addUser(User user) {
		userDAO.addUser(user);
	}

	public void modifyUser(User user) {
		userDAO.modifyUser(user);
	}

}
