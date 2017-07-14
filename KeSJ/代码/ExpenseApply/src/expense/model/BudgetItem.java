package expense.model;

//预算条目
public class BudgetItem {
	private int budgetItemId; // 预算条目ID
	private String budgetItemName; // 预算条目名称
	private boolean budgetInUse; // 1：该预算条目可用；0：不可用
	
	private double budgetItemMoney;	//申请预算时用于记录预算金额，数据库中无此条

	public int getBudgetItemId() {
		return budgetItemId;
	}

	public void setBudgetItemId(int budgetItemId) {
		this.budgetItemId = budgetItemId;
	}

	public String getBudgetItemName() {
		return budgetItemName;
	}

	public void setBudgetItemName(String budgetItemName) {
		this.budgetItemName = budgetItemName;
	}

	public boolean isBudgetInUse() {
		return budgetInUse;
	}

	public void setBudgetInUse(boolean budgetInUse) {
		this.budgetInUse = budgetInUse;
	}

	public double getBudgetItemMoney() {
		return budgetItemMoney;
	}

	public void setBudgetItemMoney(double budgetItemMoney) {
		this.budgetItemMoney = budgetItemMoney;
	}

}
