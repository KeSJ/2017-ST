package expense.model;

import java.util.Date;

//出差报销单汇总
public class BusinessSum {
	private int id; // 出差报销单ID
	private int budgetId; // 经费项目ID
	private String unit; // 单位
	private String teacherName; // 出差教师姓名
	private String reason; // 出差事由
	private int appendNum; // 附单据张数
	private double sum; // 合计报销金额
	// 转卡信息（只能转入单张银行卡）
	private String acceptTeacherId; // 工号
	private double acceptSum; // 转卡金额
	private String finStaffId; // 报销审批人ID
	private String agent; // 经办人姓名
	private Date date; // 报销日期

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
