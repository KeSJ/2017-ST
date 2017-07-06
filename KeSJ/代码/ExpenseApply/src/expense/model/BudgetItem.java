package expense.model;

//预算条目
public class BudgetItem {
	private int budgetItemId; // 预算条目ID
	private String budgetItemName; // 预算条目名称
	private boolean budgetInUse; // 1：该预算条目可用；0：不可用

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

}
