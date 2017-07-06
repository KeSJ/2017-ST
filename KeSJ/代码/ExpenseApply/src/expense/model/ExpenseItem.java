package expense.model;

/**
 * Created by lenovo on 2017/7/5 0005.
 */
// 报销汇总表条目
public class ExpenseItem {
	private int expItemId;// 报销汇总表条目ID
	private int budItemId;// 预算条目ID
	private String expItemName;// 报销汇总表条目名称
	private boolean expInuse;// 1：可用；0：不可用

	public int getExpItemId() {
		return expItemId;
	}

	public void setExpItemId(int expItemId) {
		this.expItemId = expItemId;
	}

	public int getBudItemId() {
		return budItemId;
	}

	public void setBudItemId(int budItemId) {
		this.budItemId = budItemId;
	}

	public String getExpItemName() {
		return expItemName;
	}

	public void setExpItemName(String expItemName) {
		this.expItemName = expItemName;
	}

	public boolean isExpInuse() {
		return expInuse;
	}

	public void setExpInuse(boolean expInuse) {
		this.expInuse = expInuse;
	}
	
	public ExpenseItem(){
		
	}

	public ExpenseItem(int expItemId, int budItemId, String expItemName, boolean expInuse) {

		this.expItemId = expItemId;
		this.budItemId = budItemId;
		this.expItemName = expItemName;
		this.expInuse = expInuse;
	}
}
