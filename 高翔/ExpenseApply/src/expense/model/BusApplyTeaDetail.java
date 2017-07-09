package expense.model;

/**
 * Created by lenovo on 2017/7/9 0009.
 */
public class BusApplyTeaDetail {
    private  int  busApplyTeaDetailId;
    private  int  businessId;
    private  String teacherName;
    private  String  teachePosition;

    public int getBusApplyTeaDetailId() {
        return busApplyTeaDetailId;
    }

    public void setBusApplyTeaDetailId(int busApplyTeaDetailId) {
        this.busApplyTeaDetailId = busApplyTeaDetailId;
    }

    public int getBusinessId() {
        return businessId;
    }

    public void setBusinessId(int businessId) {
        this.businessId = businessId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeachePosition() {
        return teachePosition;
    }

    public void setTeachePosition(String teachePosition) {
        this.teachePosition = teachePosition;
    }
}
