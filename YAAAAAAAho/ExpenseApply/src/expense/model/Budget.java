package expense.model;

import java.util.Date;

//��ĿԤ��
public class Budget {
	private int budId; // ��ĿԤ��ID
	private String ppcCode; // ��Ŀ�ƻ�������
	private String tmaCode; // ���������������
	private String ptrCode; // ��Ŀ������Դ����
	private String projectName; // ��Ŀ����
	private Date proStartTime; // ��Ŀ��ʼ����
	private Date proFinishTime; // ��Ŀ�������
	private double selfRaised; // �Գ������
	private double apply; // ��ʡ������
	private String budAppTea; // Ԥ�������ʦ
	private Date budAppDate; // Ԥ������ʱ��
	private String budCheckStaff; // Ԥ����˲�����Ա
	private Date budCheckDate; // Ԥ�����ʱ��
	private boolean budResult; // Ԥ����˽��
	private String budRejectReason; // Ԥ��ܾ�ԭ��
	
	private String budState;//Ԥ��״̬�����ݿ����޴���

	public int getBudId() {
		return budId;
	}

	public void setBudId(int budId) {
		this.budId = budId;
	}

	public String getPpcCode() {
		return ppcCode;
	}

	public void setPpcCode(String ppcCode) {
		this.ppcCode = ppcCode;
	}

	public String getTmaCode() {
		return tmaCode;
	}

	public void setTmaCode(String tmaCode) {
		this.tmaCode = tmaCode;
	}

	public String getPtrCode() {
		return ptrCode;
	}

	public void setPtrCode(String ptrCode) {
		this.ptrCode = ptrCode;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public Date getProStartTime() {
		return proStartTime;
	}

	public void setProStartTime(Date proStartTime) {
		this.proStartTime = proStartTime;
	}

	public Date getProFinishTime() {
		return proFinishTime;
	}

	public void setProFinishTime(Date proFinishTime) {
		this.proFinishTime = proFinishTime;
	}

	public double getSelfRaised() {
		return selfRaised;
	}

	public void setSelfRaised(double selfRaised) {
		this.selfRaised = selfRaised;
	}

	public double getApply() {
		return apply;
	}

	public void setApply(double apply) {
		this.apply = apply;
	}

	public String getBudAppTea() {
		return budAppTea;
	}

	public void setBudAppTea(String budAppTea) {
		this.budAppTea = budAppTea;
	}

	public Date getBudAppDate() {
		return budAppDate;
	}

	public void setBudAppDate(Date budAppDate) {
		this.budAppDate = budAppDate;
	}

	public String getBudCheckStaff() {
		return budCheckStaff;
	}

	public void setBudCheckStaff(String budCheckStaff) {
		this.budCheckStaff = budCheckStaff;
	}

	public Date getBudCheckDate() {
		return budCheckDate;
	}

	public void setBudCheckDate(Date budCheckDate) {
		this.budCheckDate = budCheckDate;
	}

	public boolean isBudResult() {
		return budResult;
	}

	public void setBudResult(boolean budResult) {
		this.budResult = budResult;
	}

	public String getBudRejectReason() {
		return budRejectReason;
	}

	public void setBudRejectReason(String budRejectReason) {
		this.budRejectReason = budRejectReason;
	}

	public String getBudState() {
		return budState;
	}

	public void setBudState(String budState) {
		this.budState = budState;
	}

}
