package expense.model;

import java.util.Date;

//���������������
public class Business {
	private int id; // �����������ID
	private int businessSumId; // �������ID
	private boolean inProvince; // ����ص��Ƿ�Ϊʡ��
	private Date startDate; // ���ʼ����
	private Date finishDate; // �����������
	// ���м佻ͨ��
	private double plane; // �ɻ�
	private double train; // ��
	private double travleOther; // ����

	private double stay; // ס�޷�
	// ��������
	private double food; // ��ʳ������
	private double subsideOther;// ���ӷ�

	private double other; // ����

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBusinessSumId() {
		return businessSumId;
	}

	public void setBusinessSumId(int businessSumId) {
		this.businessSumId = businessSumId;
	}

	public boolean isInProvince() {
		return inProvince;
	}

	public void setInProvince(boolean inProvince) {
		this.inProvince = inProvince;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getFinishDate() {
		return finishDate;
	}

	public void setFinishDate(Date finishDate) {
		this.finishDate = finishDate;
	}

	public double getPlane() {
		return plane;
	}

	public void setPlane(double plane) {
		this.plane = plane;
	}

	public double getTrain() {
		return train;
	}

	public void setTrain(double train) {
		this.train = train;
	}

	public double getTravleOther() {
		return travleOther;
	}

	public void setTravleOther(double travleOther) {
		this.travleOther = travleOther;
	}

	public double getStay() {
		return stay;
	}

	public void setStay(double stay) {
		this.stay = stay;
	}

	public double getFood() {
		return food;
	}

	public void setFood(double food) {
		this.food = food;
	}

	public double getSubsideOther() {
		return subsideOther;
	}

	public void setSubsideOther(double subsideOther) {
		this.subsideOther = subsideOther;
	}

	public double getOther() {
		return other;
	}

	public void setOther(double other) {
		this.other = other;
	}

}
