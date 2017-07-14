package expense.model;

//附件
public class Appendix 
{
	private int appendixId; // 附件ID
	private int applyId; // 报销表ID
	private String applyType; // 报销表类型
	private String uuidName; // uuid名
	private String realName; // 文件名
	private String filePath; // 附件存储路径
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
	public String getApplyType() {
		return applyType;
	}
	public void setApplyType(String applyType) {
		this.applyType = applyType;
	}
	public String getUuidName() {
		return uuidName;
	}
	public void setUuidName(String uuidName) {
		this.uuidName = uuidName;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	
}
