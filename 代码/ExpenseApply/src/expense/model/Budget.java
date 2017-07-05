package expense.model;

import java.util.Date;

//项目预算
public class Budget {
	private int id; // 项目预算ID
	private String PPCCode; // 项目计划类别代码
	private String TMACode; // 技术管理领域代码
	private String PTRCode; // 项目技术来源代码
	private String name; // 项目名称
	private Date proStartTime; // 项目开始日期
	private Date proFinishTime; // 项目完成日期
	private double equipment; // 设备费
	private double material; // 材料费
	private double test; // 测试化验加工费
	private double cooperation; // 合作、写作研究与交流费
	private double travel; // 差旅费
	private double labor; // 劳务费
	private double fuel; // 燃料动力费
	private double publish; // 出版/文献/信息传播知识产权事务费
	private double meeting; // 会议费
	private double incentive; // 激励费
	private double management; // 管理费
	private double expert; // 专家咨询费
	private double selfRaised; // 自筹和配套
	private double apply; // 想省厅申请

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPPCCode() {
		return PPCCode;
	}

	public void setPPCCode(String pPCCode) {
		PPCCode = pPCCode;
	}

	public String getTMACode() {
		return TMACode;
	}

	public void setTMACode(String tMACode) {
		TMACode = tMACode;
	}

	public String getPTRCode() {
		return PTRCode;
	}

	public void setPTRCode(String pTRCode) {
		PTRCode = pTRCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getProStartTime() {
		return proStartTime;
	}

	public void setProStartTime(Date proStartTime) {
		this.proStartTime = proStartTime;
	}

	public Date getProFinishTime() {
		return proFinishTime;
	}

	public void setProFinishTime(Date proFinishTime) {
		this.proFinishTime = proFinishTime;
	}

	public double getEquipment() {
		return equipment;
	}

	public void setEquipment(double equipment) {
		this.equipment = equipment;
	}

	public double getMaterial() {
		return material;
	}

	public void setMaterial(double material) {
		this.material = material;
	}

	public double getTest() {
		return test;
	}

	public void setTest(double test) {
		this.test = test;
	}

	public double getCooperation() {
		return cooperation;
	}

	public void setCooperation(double cooperation) {
		this.cooperation = cooperation;
	}

	public double getTravel() {
		return travel;
	}

	public void setTravel(double travel) {
		this.travel = travel;
	}

	public double getLabor() {
		return labor;
	}

	public void setLabor(double labor) {
		this.labor = labor;
	}

	public double getFuel() {
		return fuel;
	}

	public void setFuel(double fuel) {
		this.fuel = fuel;
	}

	public double getPublish() {
		return publish;
	}

	public void setPublish(double publish) {
		this.publish = publish;
	}

	public double getMeeting() {
		return meeting;
	}

	public void setMeeting(double meeting) {
		this.meeting = meeting;
	}

	public double getIncentive() {
		return incentive;
	}

	public void setIncentive(double incentive) {
		this.incentive = incentive;
	}

	public double getManagement() {
		return management;
	}

	public void setManagement(double management) {
		this.management = management;
	}

	public double getExpert() {
		return expert;
	}

	public void setExpert(double expert) {
		this.expert = expert;
	}

	public double getSelfRaised() {
		return selfRaised;
	}

	public void setSelfRaised(double selfRaised) {
		this.selfRaised = selfRaised;
	}

	public double getApply() {
		return apply;
	}

	public void setApply(double apply) {
		this.apply = apply;
	}

}
