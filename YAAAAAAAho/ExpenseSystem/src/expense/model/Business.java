package expense.model;

import java.util.Date;

//�������
public class Business {
	private int businessId; // �������ID
	private int budgetId; // Ԥ��ID
	private String busReason; // ����ԭ��
	private int busAppendNum; // ������
	private double busSum; // �����ܽ��
	private String busApplyTea; // �����������ʦID
	private Date busApplyDate; // ��������ʱ��
	private String busAgent; // ������
	private String busCheckStaff; // ��˲�����Ա
	private Date busCheckDate; // ���ʱ��
	private boolean busResult; // ��˽��
	private String busRejectReason; // �����ܾ�ԭ��

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

	public String getBusApplyTea() {
		return busApplyTea;
	}

	public void setBusApplyTea(String busApplyTea) {
		this.busApplyTea = busApplyTea;
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

}
