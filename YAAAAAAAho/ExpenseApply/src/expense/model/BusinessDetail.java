package expense.model;

//出差报销单详细
public class BusinessDetail {
	private int busDetId; // 出差报销单详细ID
	private int busLocId; // 出差地点ID
	private int busItemId; // 出差报销单条目ID
	private double busDetSum; // 详细金额

	public int getBusDetId() {
		return busDetId;
	}

	public void setBusDetId(int busDetId) {
		this.busDetId = busDetId;
	}

	public int getBusLocId() {
		return busLocId;
	}

	public void setBusLocId(int busLocId) {
		this.busLocId = busLocId;
	}

	public int getBusItemId() {
		return busItemId;
	}

	public void setBusItemId(int busItemId) {
		this.busItemId = busItemId;
	}

	public double getBusDetSum() {
		return busDetSum;
	}

	public void setBusDetSum(double busDetSum) {
		this.busDetSum = busDetSum;
	}

}
