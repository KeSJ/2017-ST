package expense.model;

//Ԥ����ϸ
public class BudgetDetail {
	private int budgetDetailId; // Ԥ����ϸID
	private int budgetItemId; // Ԥ����ĿID
	private int budgetId; // Ԥ��ID
	private double budgetDetailSum; // Ԥ����ϸ���

	public int getBudgetDetailId() {
		return budgetDetailId;
	}

	public void setBudgetDetailId(int budgetDetailId) {
		this.budgetDetailId = budgetDetailId;
	}

	public int getBudgetItemId() {
		return budgetItemId;
	}

	public void setBudgetItemId(int budgetItemId) {
		this.budgetItemId = budgetItemId;
	}

	public int getBudgetId() {
		return budgetId;
	}

	public void setBudgetId(int budgetId) {
		this.budgetId = budgetId;
	}

	public double getBudgetDetailSum() {
		return budgetDetailSum;
	}

	public void setBudgetDetailSum(double budgetDetailSum) {
		this.budgetDetailSum = budgetDetailSum;
	}

}
