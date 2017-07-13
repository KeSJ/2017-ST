package expense.model;

//收款信息
public class Accept {
	private int acceptId; // 收款信息ID
	private String teacherId; // 收款教师ID
	private double acceptSum; // 收款金额
	private String acceptCardId; // 收款银行卡号
	private int applyId; // 报销单ID
	private String applyType; // 报销单类型（出差报销单/报销汇总单）

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

}
