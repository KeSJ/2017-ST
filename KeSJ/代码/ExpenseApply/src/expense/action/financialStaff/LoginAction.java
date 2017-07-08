package expense.action.financialStaff;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import expense.DAO.FinancialStaffDAO;
import expense.model.FinancialStaff;
import expense.model.Teacher;
import expense.service.FinancialStaffService;
import expense.service.TeacherService;

public class LoginAction extends ActionSupport {
	private FinancialStaffService financialStaffService;
	private TeacherService teacherService;
	private String user_email;
	private String user_password;
	private String user_type;
	private String returnMsg;

	public String getReturnMsg() {
		return returnMsg;
	}

	public String execute() throws Exception {
		ActionContext.getContext().getSession().put("currentUserId", user_email);
		ActionContext.getContext().getSession().put("currentUserType", user_type);
		
		if (user_type.equals("财务人员")) {
			FinancialStaff financialStaff = financialStaffService.findFinancialStaff(user_email);
			if (financialStaff == null || !user_password.equals(financialStaff.getFsPwd()) || financialStaff.getFsStopDate() != null)
				returnMsg = "用户名或密码错误";
			else{
				ActionContext.getContext().getSession().put("currentUserName", financialStaff.getFsName());
				return "staff";
			}
		}else if (user_type.equals("教师")) {
			Teacher teacher = 
		}else {
			
		}
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

	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}

	public FinancialStaffService getFinancialStaffService() {
		return financialStaffService;
	}

	public void setFinancialStaffService(FinancialStaffService financialStaffService) {
		this.financialStaffService = financialStaffService;
	}

}
