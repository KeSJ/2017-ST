package expense.model;

import java.util.Date;

//出差地点
public class BusinessLocation {
	private int busLocId; // 出差地点ID
	private int businessId; // 出差报销单ID
	private boolean inProvince; // 1：省内；0：省外
	private String busLocation; // 出差地点
	private Date busStartDate; // 出差开始日期
	private Date busFinishDate; // 出差结束日期

	public int getBusLocId() {
		return busLocId;
	}

	public void setBusLocId(int busLocId) {
		this.busLocId = busLocId;
	}

	public int getBusinessId() {
		return businessId;
	}

	public void setBusinessId(int businessId) {
		this.businessId = businessId;
	}

	public boolean isInProvince() {
		return inProvince;
	}

	public void setInProvince(boolean inProvince) {
		this.inProvince = inProvince;
	}

	public String getBusLocation() {
		return busLocation;
	}

	public void setBusLocation(String busLocation) {
		this.busLocation = busLocation;
	}

	public Date getBusStartDate() {
		return busStartDate;
	}

	public void setBusStartDate(Date busStartDate) {
		this.busStartDate = busStartDate;
	}

	public Date getBusFinishDate() {
		return busFinishDate;
	}

	public void setBusFinishDate(Date busFinishDate) {
		this.busFinishDate = busFinishDate;
	}

}
