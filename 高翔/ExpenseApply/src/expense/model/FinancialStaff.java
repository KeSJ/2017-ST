package expense.model;

import java.util.Date;

public class FinancialStaff {
	private String fsId;
	private String fsName;
	private String fsPwd;
	private Date fsCreateDate;
	private Date fsStopDate;

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

	public FinancialStaff(String fsId, String fsName, String fsPwd, Date fsCreateDate, Date fsStopDate) {

		this.fsId = fsId;
		this.fsName = fsName;
		this.fsPwd = fsPwd;
		this.fsCreateDate = fsCreateDate;
		this.fsStopDate = fsStopDate;
	}
}
