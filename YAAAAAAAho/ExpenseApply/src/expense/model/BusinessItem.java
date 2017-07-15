package expense.model;


//出差报销单条目
public class BusinessItem {
	private int busItemId; // 出差报销条目ID
	private String busItemName; // 报销条目名称
	private boolean busItemInUse; // 1：该条目可用；0：不可用

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
