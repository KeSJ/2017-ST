package expense.model;

//Ô¤ËãÏêÏ¸
public class BudgetDetail {
	private int budgetDetailId; // Ô¤ËãÏêÏ¸ID
	private int budgetItemId; // Ô¤ËãÌõÄ¿ID
	private int budgetId; // Ô¤ËãID
	private double budgetDetailSum; // Ô¤ËãÏêÏ¸½ğ¶î

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
