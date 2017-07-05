package expense.model;

import java.util.Date;

//出差报销单单条费用
public class Business {
	private int id; // 单条出差费用ID
	private int businessSumId; // 出差报销单ID
	private boolean inProvince; // 出差地点是否为省内
	private Date startDate; // 出差开始日期
	private Date finishDate; // 出差结束日期
	// 城市间交通费
	private double plane; // 飞机
	private double train; // 火车
	private double travleOther; // 其他

	private double stay; // 住宿费
	// 补贴报销
	private double food; // 伙食补助费
	private double subsideOther;// 公杂费

	private double other; // 其他

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
