package expense.model;

//Ԥ����Ŀ
public class BudgetItem {
	private int budgetItemId; // Ԥ����ĿID
	private String budgetItemName; // Ԥ����Ŀ����
	private boolean budgetInUse; // 1����Ԥ����Ŀ���ã�0��������

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
