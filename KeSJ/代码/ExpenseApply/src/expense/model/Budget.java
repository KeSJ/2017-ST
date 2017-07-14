package expense.model;

import java.util.Date;

//项目预算
public class Budget {
	private int budId; // 项目预算ID
	private String ppcCode; // 项目计划类别代码
	private String tmaCode; // 技术管理领域代码
	private String ptrCode; // 项目技术来源代码
	private String projectName; // 项目名称
	private Date proStartTime; // 项目开始日期
	private Date proFinishTime; // 项目完成日期
	private double selfRaised; // 自筹和配套
	private double apply; // 向省厅申请
	private String budAppTea; // 预算申请教师
	private Date budAppDate; // 预算申请时间
	private String budCheckStaff; // 预算审核财务人员
	private Date budCheckDate; // 预算审核时间
	private boolean budResult; // 预算审核结果
	private String budRejectReason; // 预算拒绝原因
	
	private String budState;//预算状态，数据库中无此条

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
