package expense.model;

//��Ŀ������Դ
public class ProTecRes {
	private String ptrCode; // ����
	private String ptrName; // ����
	private  boolean ptrInUse;

	public String getPtrCode() {
		return ptrCode;
	}

	public void setPtrCode(String ptrCode) {
		this.ptrCode = ptrCode;
	}

	public String getPtrName() {
		return ptrName;
	}

	public void setPtrName(String ptrName) {
		this.ptrName = ptrName;
	}

	public boolean isPtrInUse() {
		return ptrInUse;
	}

	public void setPtrInUse(boolean ptrInUse) {
		this.ptrInUse = ptrInUse;
	}
	
	public ProTecRes(){
		
	}

	public ProTecRes(String ptrCode, String ptrName, boolean ptrInUse) {

		this.ptrCode = ptrCode;
		this.ptrName = ptrName;
		this.ptrInUse = ptrInUse;
	}
}
