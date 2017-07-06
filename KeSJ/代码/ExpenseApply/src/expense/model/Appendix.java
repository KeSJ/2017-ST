package expense.model;

//附件
public class Appendix {
	private int appendixId; // 附件ID
	private int applyId; // 报销表ID
	private int applyType; // 报销表类型
	private String filePath;// 附件存储路径

	public int getAppendixId() {
		return appendixId;
	}

	public void setAppendixId(int appendixId) {
		this.appendixId = appendixId;
	}

	public int getApplyId() {
		return applyId;
	}

	public void setApplyId(int applyId) {
		this.applyId = applyId;
	}

	public int getApplyType() {
		return applyType;
	}

	public void setApplyType(int applyType) {
		this.applyType = applyType;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

}
