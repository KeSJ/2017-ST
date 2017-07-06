package expense.model;

//项目计划类别
public class ProPlanCategory
{
	private String ppcCode; // 项目计划类别代码
	private String ppcName; // 项目计划类别名称
	private  boolean ppcInUse;

	public String getPpcCode() {
		return ppcCode;
	}

	public void setPpcCode(String ppcCode) {
		this.ppcCode = ppcCode;
	}

	public String getPpcName() {
		return ppcName;
	}

	public void setPpcName(String ppcName) {
		this.ppcName = ppcName;
	}

	public boolean isPpcInUse() {
		return ppcInUse;
	}

	public void setPpcInUse(boolean ppcInUse) {
		this.ppcInUse = ppcInUse;
	}

	public ProPlanCategory(String ppcCode, String ppcName, boolean ppcInUse) {

		this.ppcCode = ppcCode;
		this.ppcName = ppcName;
		this.ppcInUse = ppcInUse;
	}
}
