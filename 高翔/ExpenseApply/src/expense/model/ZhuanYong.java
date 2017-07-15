package expense.model;

public class ZhuanYong {
	//因为他一定要在一个iterator里面添加两个来自不同entity的字段，于是有了这个实体。。。
	private String projectName;
	private String teacherName;
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

}
