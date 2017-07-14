package expense.action;

import java.util.Date;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import expense.model.User;
import expense.service.UserService;

public class UserInfoAction extends ActionSupport {
	private UserService userService;

	private List<User> users;
	private static String userTypes[] = { "��ʦ", "������Ա", "����Ա" };
	private String userType;
	private String id;
	private String teacher_id;
	private String teacher_name;
	private String password1;
	private String password2;

	private String returnMsg;

	public String loadUserInfo() {
		users = userService.findAllUsers();
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getUserStopDate() == null) {
				users.get(i).setUserState("����");
			} else {
				users.get(i).setUserState("ͣ��");
			}
		}
		return SUCCESS;
	}

	public String modifyUser() {
		User user = userService.findUser(id);
		user.setUserType(userType);
		userService.modifyUser(user);
		returnMsg = "�޸ĳɹ�";
		return loadUserInfo();
	}

	public String stopUser() {
		User user = userService.findUser(id);
		user.setUserStopDate(new Date(System.currentTimeMillis()));
		userService.modifyUser(user);
		returnMsg = "�û� " + user.getUserId() + " �ѱ�ͣ��";
		return loadUserInfo();
	}

	public String userAdd() {
		if (!password1.equals(password2)) {
			returnMsg = "�����������벻ͬ";
		} else {
			User user = new User();
			user.setUserId(teacher_id);
			user.setUserName(teacher_name);
			user.setUserPwd(password1);
			user.setUserCreateDate(new Date(System.currentTimeMillis()));
			user.setUserType(userType);
			userService.addUser(user);
		}
		returnMsg = "�����ɹ�";
		return loadUserInfo();
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public List<User> getUsers() {
		return users;
	}

	public String[] getUserTypes() {
		return userTypes;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setTeacher_id(String teacher_id) {
		this.teacher_id = teacher_id;
	}

	public void setTeacher_name(String teacher_name) {
		this.teacher_name = teacher_name;
	}

	public void setPassword1(String password1) {
		this.password1 = password1;
	}

	public void setPassword2(String password2) {
		this.password2 = password2;
	}

	public String getReturnMsg() {
		return returnMsg;
	}

}
