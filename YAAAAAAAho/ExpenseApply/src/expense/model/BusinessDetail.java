package expense.model;

//���������ϸ
public class BusinessDetail {
	private int busDetId; // ���������ϸID
	private int busLocId; // ����ص�ID
	private int busItemId; // ���������ĿID
	private double busDetSum; // ��ϸ���

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
