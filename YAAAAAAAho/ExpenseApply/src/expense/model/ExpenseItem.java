package expense.model;

/**
 * Created by lenovo on 2017/7/5 0005.
 */
// �������ܱ���Ŀ
public class ExpenseItem {
	private int expItemId;// �������ܱ���ĿID
	private int budItemId;// Ԥ����ĿID
	private String expItemName;// �������ܱ���Ŀ����
	private boolean expInuse;// 1�����ã�0��������
	
	private double expMoney;//Ԥ������ݿ����޴���

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

	public ExpenseItem() {

	}

	public double getExpMoney() {
		return expMoney;
	}

	public void setExpMoney(double expMoney) {
		this.expMoney = expMoney;
	}

	public ExpenseItem(int expItemId, int budItemId, String expItemName, boolean expInuse) {

		this.expItemId = expItemId;
		this.budItemId = budItemId;
		this.expItemName = expItemName;
		this.expInuse = expInuse;
	}
}
