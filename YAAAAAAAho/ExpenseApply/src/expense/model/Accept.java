package expense.model;

//�տ���Ϣ
public class Accept {
	private int acceptId; // �տ���ϢID
	private String teacherId; // �տ��ʦID
	private double acceptSum; // �տ���
	private String acceptCardId; // �տ����п���
	private int applyId; // ������ID
	private String applyType; // ���������ͣ��������/�������ܵ���
	
	private String teacherName;//��ʦ���������ݿ����޴���

	public int getAcceptId() {
		return acceptId;
	}

	public void setAcceptId(int acceptId) {
		this.acceptId = acceptId;
	}

	public String getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}

	public double getAcceptSum() {
		return acceptSum;
	}

	public void setAcceptSum(double acceptSum) {
		this.acceptSum = acceptSum;
	}

	public String getAcceptCardId() {
		return acceptCardId;
	}

	public void setAcceptCardId(String acceptCardId) {
		this.acceptCardId = acceptCardId;
	}

	public int getApplyId() {
		return applyId;
	}

	public void setApplyId(int applyId) {
		this.applyId = applyId;
	}

	public String getApplyType() {
		return applyType;
	}

	public void setApplyType(String applyType) {
		this.applyType = applyType;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

}
