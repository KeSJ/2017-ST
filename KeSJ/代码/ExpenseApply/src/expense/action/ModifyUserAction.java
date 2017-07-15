package expense.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import expense.model.User;
import expense.service.UserService;

public class ModifyUserAction extends ActionSupport {
	private UserService userService;
	private String password1;
	private String password2;
	private String password3;

	private String returnMsg;

	public String getReturnMsg() {
		return returnMsg;
	}

	public String execute() throws Exception {
		String userId = (String) ActionContext.getContext().getSession().get("currentUserId");
		if (password1 == null || password1.equals("")) {
			System.out.println("password1:" + password1);
			returnMsg = "原密码不能为空！";
		} else if (password2 == null || password2.equals("") || password2.length() > 32) {
			System.out.println("password2:" + password2);
			returnMsg = "密码长度为1-32！";
		} else if (!password2.equals(password3)) {
			System.out.println("password3:" + password3);
			returnMsg = "确认密码与新密码不相同！";
		} else {
			User systemUser = userService.findUser(userId);
			if (!password1.equals(systemUser.getUserPwd())) {
				returnMsg = "原密码错误！";
			} else {
				systemUser.setUserPwd(password2);
				userService.modifyUser(systemUser);
				returnMsg = "密码修改成功！";
				return SUCCESS;
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


	public String getPassword1() {
		return password1;
	}

	public void setPassword1(String password1) {
		this.password1 = password1;
	}

	public String getPassword2() {
		return password2;
	}

	public void setPassword2(String password2) {
		this.password2 = password2;
	}

	public String getPassword3() {
		return password3;
	}

	public void setPassword3(String password3) {
		this.password3 = password3;
	}
}
