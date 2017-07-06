package expense.model;

/**
 * Created by lenovo on 2017/7/5 0005.
 */
public class ExpendDetail {
    private  int expDetId;
    private  int expItemId;
    private  int eId;
    private  double expDetSum;

    public ExpendDetail(int expDetId, int expItemId, int eId, double expDetSum) {
        this.expDetId = expDetId;
        this.expItemId = expItemId;
        this.eId = eId;
        this.expDetSum = expDetSum;
    }

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
