package expense.model;

import java.util.Date;

//�����������
public class BusinessSum {
	private int id; // �������ID
	private int budgetId; // ������ĿID
	private String unit; // ��λ
	private String teacherName; // �����ʦ����
	private String reason; // ��������
	private int appendNum; // ����������
	private double sum; // �ϼƱ������
	// ת����Ϣ��ֻ��ת�뵥�����п���
	private String acceptTeacherId; // ����
	private double acceptSum; // ת�����
	private String finStaffId; // ����������ID
	private String agent; // ����������
	private Date date; // ��������

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBudgetId() {
		return budgetId;
	}

	public void setBudgetId(int budgetId) {
		this.budgetId = budgetId;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public int getAppendNum() {
		return appendNum;
	}

	public void setAppendNum(int appendNum) {
		this.appendNum = appendNum;
	}

	public double getSum() {
		return sum;
	}

	public void setSum(double sum) {
		this.sum = sum;
	}

	public String getAcceptTeacherId() {
		return acceptTeacherId;
	}

	public void setAcceptTeacherId(String acceptTeacherId) {
		this.acceptTeacherId = acceptTeacherId;
	}

	public double getAcceptSum() {
		return acceptSum;
	}

	public void setAcceptSum(double acceptSum) {
		this.acceptSum = acceptSum;
	}

	public String getFinStaffId() {
		return finStaffId;
	}

	public void setFinStaffId(String finStaffId) {
		this.finStaffId = finStaffId;
	}

	public String getAgent() {
		return agent;
	}

	public void setAgent(String agent) {
		this.agent = agent;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
