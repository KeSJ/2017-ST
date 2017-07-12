package expense.model;

//������������
public class TecMngArea {
	private String tmaCode; // ���������������
	private String tmaName; // ����������������
   	private boolean tmaInUse;

   	public TecMngArea(){
   		
   	}
   	
	public TecMngArea(String tmaCode, String tmaName, boolean tmaInUse) {
		this.tmaCode = tmaCode;
		this.tmaName = tmaName;
		this.tmaInUse = tmaInUse;
	}

	public String getTmaCode() {
		return tmaCode;
	}

	public void setTmaCode(String tmaCode) {
		this.tmaCode = tmaCode;
	}

	public String getTmaName() {
		return tmaName;
	}

	public void setTmaName(String tmaName) {
		this.tmaName = tmaName;
	}

	public boolean isTmaInUse() {
		return tmaInUse;
	}

	public void setTmaInUse(boolean tmaInUse) {
		this.tmaInUse = tmaInUse;
	}
}
