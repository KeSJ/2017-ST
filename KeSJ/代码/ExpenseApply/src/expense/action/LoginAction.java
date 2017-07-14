package expense.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import expense.model.User;
import expense.service.UserService;

public class LoginAction extends ActionSupport {
	private UserService userService;
	private String user_email;
	private String user_password;

	private String returnMsg;

	public String getReturnMsg() {
		return returnMsg;
	}

	public String execute() throws Exception {
		if (user_email == null) {
			returnMsg = "�������û���";
		} else if (user_password == null) {
			returnMsg = "����������";
		} else if (user_email.length() > 10 || user_password.length() > 20) {
			returnMsg = "�û������������";
		} else {

			ActionContext.getContext().getSession().put("currentUserId", user_email);

			User user = userService.findUser(user_email);

			if (user == null || !user_password.equals(user.getUserPwd())){
				returnMsg = "�û������������";
			}else if ( user.getUserStopDate() != null) {
				returnMsg = "���˻���ͣ��";
			}else {
				ActionContext.getContext().getSession().put("currentUserName", user.getUserName());
				String user_type = user.getUserType();
				ActionContext.getContext().getSession().put("currentUserType", user_type);
				returnMsg = "��¼�ɹ�";
				if (user_type.equals("������Ա"))
					return "staff";
				else if (user_type.equals("��ʦ"))
					return "teacher";
				else
					return "admin";
			}
		}
		return INPUT;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
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

}
