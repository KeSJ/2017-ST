package expense.model;

import java.util.Date;

public class User {
	private String userId;
	private String userType;
	private String userPwd;
	private String userName;
	private String userPhone;
	private Date userCreateDate;
	private Date userStopDate;
	
	private String userState;//用户状态，数据库中无此项（正常/停用）

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public Date getUserCreateDate() {
		return userCreateDate;
	}

	public void setUserCreateDate(Date userCreateDate) {
		this.userCreateDate = userCreateDate;
	}

	public Date getUserStopDate() {
		return userStopDate;
	}

	public void setUserStopDate(Date userStopDate) {
		this.userStopDate = userStopDate;
	}

	public String getUserState() {
		return userState;
	}

	public void setUserState(String userState) {
		this.userState = userState;
	}

	
}
