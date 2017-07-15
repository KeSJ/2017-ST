package expense.model;

/**
 * Created by lenovo on 2017/7/9 0009.
 */
public class BusApplyTeaDetail {
	private int busApplyTeaDetailId;// 主键
	private int businessId;// 出差报销单ID
	private String teacherName;// 教师名称
	private String teacherPosition;// 教师职务

	public int getBusApplyTeaDetailId() {
		return busApplyTeaDetailId;
	}

	public void setBusApplyTeaDetailId(int busApplyTeaDetailId) {
		this.busApplyTeaDetailId = busApplyTeaDetailId;
	}

	public int getBusinessId() {
		return businessId;
	}

	public void setBusinessId(int businessId) {
		this.businessId = businessId;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getTeacherPosition() {
		return teacherPosition;
	}

	public void setTeacherPosition(String teacherPosition) {
		this.teacherPosition = teacherPosition;
	}

}
