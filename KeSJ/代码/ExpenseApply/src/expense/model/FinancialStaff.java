package expense.model;

import java.util.Date;

//������Ա
public class FinancialStaff {
	private String fsId;// ������ԱID
	private String fsName;// ������Ա����
	private String fsPwd;// ����
	private Date fsCreateDate;// ID����ʱ��
	private Date fsStopDate;// IDͣ��ʱ��

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
