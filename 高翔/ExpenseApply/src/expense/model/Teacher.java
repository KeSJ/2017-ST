package expense.model;

import java.util.Date;

public class Teacher {
	private String tId;
	private String tName;
	private String tUnit; // 教师单位
	private String tPosition; // 教师职务
	private String tPhone;
	private Date tCreateDate;
	private Date tStopDate;

	public String gettId() {
		return tId;
	}

	public void settId(String tId) {
		this.tId = tId;
	}

	public String gettName() {
		return tName;
	}

	public void settName(String tName) {
		this.tName = tName;
	}

	public String gettUnit() {
		return tUnit;
	}

	public void settUnit(String tUnit) {
		this.tUnit = tUnit;
	}

	public String gettPosition() {
		return tPosition;
	}

	public void settPosition(String tPosition) {
		this.tPosition = tPosition;
	}

	public String gettPhone() {
		return tPhone;
	}

	public void settPhone(String tPhone) {
		this.tPhone = tPhone;
	}

	public Date gettCreateDate() {
		return tCreateDate;
	}

	public void settCreateDate(Date tCreateDate) {
		this.tCreateDate = tCreateDate;
	}

	public Date gettStopDate() {
		return tStopDate;
	}

	public void settStopDate(Date tStopDate) {
		this.tStopDate = tStopDate;
	}

	public Teacher(String tId, String tName, String tUnit, String tPosition, String tPhone, Date tCreateDate, Date tStopDate) {

		this.tId = tId;
		this.tName = tName;
		this.tUnit = tUnit;
		this.tPosition = tPosition;
		this.tPhone = tPhone;
		this.tCreateDate = tCreateDate;
		this.tStopDate = tStopDate;
	}
}
