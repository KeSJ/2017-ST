package expense.model;


//���������Ŀ
public class BusinessItem {
	private int busItemId; // �������ĿID
	private String busItemName; // ������Ŀ����
	private boolean busItemInUse; // 1������Ŀ���ã�0��������

	public int getBusItemId() {
		return busItemId;
	}

	public void setBusItemId(int busItemId) {
		this.busItemId = busItemId;
	}

	public String getBusItemName() {
		return busItemName;
	}

	public void setBusItemName(String busItemName) {
		this.busItemName = busItemName;
	}

	public boolean isBusItemInUse() {
		return busItemInUse;
	}

	public void setBusItemInUse(boolean busItemInUse) {
		this.busItemInUse = busItemInUse;
	}

}
