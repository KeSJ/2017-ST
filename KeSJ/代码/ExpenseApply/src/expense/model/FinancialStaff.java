package expense.model;

import java.util.Date;

//财务人员
public class FinancialStaff {
	private String fsId;// 财务人员ID
	private String fsName;// 财务人员姓名
	private String fsPwd;// 密码
	private Date fsCreateDate;// ID创建时间
	private Date fsStopDate;// ID停用时间

	public String getFsId() {
		return fsId;
	}

	public void setFsId(String fsId) {
		this.fsId = fsId;
	}

	public String getFsName() {
		return fsName;
	}

	public void setFsName(String fsName) {
		this.fsName = fsName;
	}

	public String getFsPwd() {
		return fsPwd;
	}

	public void setFsPwd(String fsPwd) {
		this.fsPwd = fsPwd;
	}

	public Date getFsCreateDate() {
		return fsCreateDate;
	}

	public void setFsCreateDate(Date fsCreateDate) {
		this.fsCreateDate = fsCreateDate;
	}

	public Date getFsStopDate() {
		return fsStopDate;
	}

	public void setFsStopDate(Date fsStopDate) {
		this.fsStopDate = fsStopDate;
	}

	public FinancialStaff() {

	}

	public FinancialStaff(String fsId, String fsName, String fsPwd, Date fsCreateDate, Date fsStopDate) {

		this.fsId = fsId;
		this.fsName = fsName;
		this.fsPwd = fsPwd;
		this.fsCreateDate = fsCreateDate;
		this.fsStopDate = fsStopDate;
	}
}
