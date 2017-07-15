package expense.model;

import java.util.Date;

//����ص�
public class BusinessLocation {
	private int busLocId; // ����ص�ID
	private int businessId; // �������ID
	private boolean inProvince; // 1��ʡ�ڣ�0��ʡ��
	private String busLocation; // ����ص�
	private Date busStartDate; // ���ʼ����
	private Date busFinishDate; // �����������

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
