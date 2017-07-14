package expense.model;

import java.util.Date;

//出差报销单
public class Business {
	private int businessId; // 出差报销单ID
	private int budgetId; // 预算ID
	private String bUnit;//公司名称
	private String busReason; // 出差原因
	private int busAppendNum; // 附件数
	private double busSum; // 报销总金额
//	private String busApplyTea; // 报销单申请教师ID
	private Date busApplyDate; // 报销申请时间
	private String busAgent; // 经办人
	private String busCheckStaff; // 审核财务人员
	private Date busCheckDate; // 审核时间
	private boolean busResult; // 审核结果
	private String busRejectReason; // 报销拒绝原因
	

	public int getBusinessId() {
		return businessId;
	}

	public void setBusinessId(int businessId) {
		this.businessId = businessId;
	}

	public int getBudgetId() {
		return budgetId;
	}

	public void setBudgetId(int budgetId) {
		this.budgetId = budgetId;
	}

	public String getBusReason() {
		return busReason;
	}

	public void setBusReason(String busReason) {
		this.busReason = busReason;
	}

	public int getBusAppendNum() {
		return busAppendNum;
	}

	public void setBusAppendNum(int busAppendNum) {
		this.busAppendNum = busAppendNum;
	}

	public double getBusSum() {
		return busSum;
	}

	public void setBusSum(double busSum) {
		this.busSum = busSum;
	}


	public Date getBusApplyDate() {
		return busApplyDate;
	}

	public void setBusApplyDate(Date busApplyDate) {
		this.busApplyDate = busApplyDate;
	}

	public String getBusAgent() {
		return busAgent;
	}

	public void setBusAgent(String busAgent) {
		this.busAgent = busAgent;
	}

	public String getBusCheckStaff() {
		return busCheckStaff;
	}

	public void setBusCheckStaff(String busCheckStaff) {
		this.busCheckStaff = busCheckStaff;
	}

	public Date getBusCheckDate() {
		return busCheckDate;
	}

	public void setBusCheckDate(Date busCheckDate) {
		this.busCheckDate = busCheckDate;
	}

	public boolean isBusResult() {
		return busResult;
	}

	public void setBusResult(boolean busResult) {
		this.busResult = busResult;
	}

	public String getBusRejectReason() {
		return busRejectReason;
	}

	public void setBusRejectReason(String busRejectReason) {
		this.busRejectReason = busRejectReason;
	}
	public String getbUnit() {
		return bUnit;
	}

	public void setbUnit(String bUnit) 
	{
		this.bUnit = bUnit;
	}

}
