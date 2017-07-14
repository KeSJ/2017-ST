package expense.model;

/**
 * Created by lenovo on 2017/7/5 0005.
 */
// 报销汇总表详细
public class ExpenseDetail {
	private int expDetId; // 报销汇总表详细ID
	private int expItemId; // 报销汇总表条目ID
	private int eId; // 报销汇总表ID
	private double expDetSum; // 报销金额

	

	public int getExpDetId() {

		return expDetId;
	}

	public void setExpDetId(int expDetId) {
		this.expDetId = expDetId;
	}

	public int getExpItemId() {
		return expItemId;
	}

	public void setExpItemId(int expItemId) {
		this.expItemId = expItemId;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public double getExpDetSum() {
		return expDetSum;
	}

	public void setExpDetSum(double expDetSum) {
		this.expDetSum = expDetSum;
	}

}
