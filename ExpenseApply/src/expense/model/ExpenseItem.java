package expense.model;

/**
 * Created by lenovo on 2017/7/5 0005.
 */
public class ExpenseItem {
    private  int expItemId;
    private  int budItemId;
    private  String expItemName;
    private  boolean expInuse;

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

    public ExpenseItem(int expItemId, int budItemId, String expItemName, boolean expInuse) {

        this.expItemId = expItemId;
        this.budItemId = budItemId;
        this.expItemName = expItemName;
        this.expInuse = expInuse;
    }
}
