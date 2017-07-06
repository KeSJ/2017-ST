package expense.model;

import java.util.Date;

/**
 * Created by lenovo on 2017/7/5 0005.
 */
public class Expense {
    private int  eId;
    private  int budId;
    private  int eAppend;
    private  String eAppTea;
    private  Date eAppDate;
    private  String eAgent;
    private  String eCheckStaff;
    private  Date   eCheckDate;
    private  boolean eResult;

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public int getBudId() {
        return budId;
    }

    public void setBudId(int budId) {
        this.budId = budId;
    }

    public int geteAppend() {
        return eAppend;
    }

    public void seteAppend(int eAppend) {
        this.eAppend = eAppend;
    }

    public String geteAppTea() {
        return eAppTea;
    }

    public void seteAppTea(String eAppTea) {
        this.eAppTea = eAppTea;
    }

    public Date geteAppDate() {
        return eAppDate;
    }

    public void seteAppDate(Date eAppDate) {
        this.eAppDate = eAppDate;
    }

    public String geteAgent() {
        return eAgent;
    }

    public void seteAgent(String eAgent) {
        this.eAgent = eAgent;
    }

    public String geteCheckStaff() {
        return eCheckStaff;
    }

    public void seteCheckStaff(String eCheckStaff) {
        this.eCheckStaff = eCheckStaff;
    }

    public Date geteCheckDate() {
        return eCheckDate;
    }

    public void seteCheckDate(Date eCheckDate) {
        this.eCheckDate = eCheckDate;
    }

    public boolean iseResult() {
        return eResult;
    }

    public void seteResult(boolean eResult) {
        this.eResult = eResult;
    }

    public String geteRejectReason() {
        return eRejectReason;
    }

    public void seteRejectReason(String eRejectReason) {
        this.eRejectReason = eRejectReason;
    }

    public Expense(int eId, int budId, int eAppend, String eAppTea, Date eAppDate, String eAgent, String eCheckStaff, Date eCheckDate, boolean eResult, String eRejectReason) {

        this.eId = eId;
        this.budId = budId;
        this.eAppend = eAppend;
        this.eAppTea = eAppTea;
        this.eAppDate = eAppDate;
        this.eAgent = eAgent;
        this.eCheckStaff = eCheckStaff;
        this.eCheckDate = eCheckDate;
        this.eResult = eResult;
        this.eRejectReason = eRejectReason;
    }

    private  String eRejectReason;



}
