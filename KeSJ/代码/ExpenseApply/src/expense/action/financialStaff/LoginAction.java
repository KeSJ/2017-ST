package expense.action.financialStaff;

import com.opensymphony.xwork2.ActionSupport;

import expense.DAO.FinancialStaffDAO;
import expense.model.FinancialStaff;

public class LoginAction extends ActionSupport {
	private FinancialStaffDAO financialStaffDAO;
	private String user_email;
	private String user_password;
	private String returnMsg;

	public String getReturnMsg() {
		return returnMsg;
	}
	
	public String execute() throws Exception {
		FinancialStaff financialStaff = financialStaffDAO.findFinancialStaff(user_email);
		if(user_password.equals(financialStaff.getFsPwd())){
			return SUCCESS;
		}
		else
			return INPUT;
	}
	
	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public FinancialStaffDAO getFinancialStaffDAO() {
		return financialStaffDAO;
	}

	public void setFinancialStaffDAO(FinancialStaffDAO financialStaffDAO) {
		this.financialStaffDAO = financialStaffDAO;
	}

}
