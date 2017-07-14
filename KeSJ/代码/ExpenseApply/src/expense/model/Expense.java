package expense.model;

import java.util.Date;

/**
 * Created by lenovo on 2017/7/5 0005.
 */
// 报销汇总表
public class Expense {
	private int eId;// 报销汇总表ID
	private String eUnit;//部门名称
	private int budId;// 预算ID
	private int eAppend;// 附件数
	private String eAppTea;// 报销申请教师
	private Date eAppDate;// 报销申请时间
	private String eAgent;// 经办人
	private String eCheckStaff;// 报销审核财务人员ID
	private Date eCheckDate;// 报销审核时间
	private boolean eResult;// 1：审核通过；0：不通过
	private String eRejectReason;// 审核不通过原因
	
	private String proName;//项目名称，数据库中无此项
	private String eState;//预算状态，数据库中无此项

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteUnit() {
		return eUnit;
	}

	public void seteUnit(String eUnit) {
		this.eUnit = eUnit;
	}

	public int getBudId() {
		return budId;
	}

	public void setBudId(int budId) {
		this.budId = budId;
	}

	public int geteAppend() {
		return eAppend;
	}

	public void seteAppend(int eAppend) {
		this.eAppend = eAppend;
	}

	public String geteAppTea() {
		return eAppTea;
	}

	public void seteAppTea(String eAppTea) {
		this.eAppTea = eAppTea;
	}

	public Date geteAppDate() {
		return eAppDate;
	}

	public void seteAppDate(Date eAppDate) {
		this.eAppDate = eAppDate;
	}

	public String geteAgent() {
		return eAgent;
	}

	public void seteAgent(String eAgent) {
		this.eAgent = eAgent;
	}

	public String geteCheckStaff() {
		return eCheckStaff;
	}

	public void seteCheckStaff(String eCheckStaff) {
		this.eCheckStaff = eCheckStaff;
	}

	public Date geteCheckDate() {
		return eCheckDate;
	}

	public void seteCheckDate(Date eCheckDate) {
		this.eCheckDate = eCheckDate;
	}

	public boolean iseResult() {
		return eResult;
	}

	public void seteResult(boolean eResult) {
		this.eResult = eResult;
	}

	public String geteRejectReason() {
		return eRejectReason;
	}

	public void seteRejectReason(String eRejectReason) {
		this.eRejectReason = eRejectReason;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public String geteState() {
		return eState;
	}

	public void seteState(String eState) {
		this.eState = eState;
	}

	public Expense(){
		
	}
	
	public Expense(int eId, int budId, int eAppend, String eAppTea, Date eAppDate, String eAgent, String eCheckStaff,
			Date eCheckDate, boolean eResult, String eRejectReason) {

		this.eId = eId;
		this.budId = budId;
		this.eAppend = eAppend;
		this.eAppTea = eAppTea;
		this.eAppDate = eAppDate;
		this.eAgent = eAgent;
		this.eCheckStaff = eCheckStaff;
		this.eCheckDate = eCheckDate;
		this.eResult = eResult;
		this.eRejectReason = eRejectReason;
	}

}
