package expense.model;

import java.util.Date;

public class Teacher {
	private String tId;
	private String tName;
	private String tPosition; // 教师职务
	private String tPhone;
	private String tCardId;
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

	public String gettCardId() {
		return tCardId;
	}

	public void settCardId(String tCardId) {
		this.tCardId = tCardId;
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

	public Teacher(String tId, String tName, String tPosition, String tPhone, String tCardId, Date tCreateDate, Date tStopDate) {

		this.tId = tId;
		this.tName = tName;
		this.tPosition = tPosition;
		this.tPhone = tPhone;
		this.tCardId = tCardId;
		this.tCreateDate = tCreateDate;
		this.tStopDate = tStopDate;
	}





}
