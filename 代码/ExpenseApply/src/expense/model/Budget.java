package expense.model;

import java.util.Date;

//��ĿԤ��
public class Budget {
	private int id; // ��ĿԤ��ID
	private String PPCCode; // ��Ŀ�ƻ�������
	private String TMACode; // ���������������
	private String PTRCode; // ��Ŀ������Դ����
	private String name; // ��Ŀ����
	private Date proStartTime; // ��Ŀ��ʼ����
	private Date proFinishTime; // ��Ŀ�������
	private double equipment; // �豸��
	private double material; // ���Ϸ�
	private double test; // ���Ի���ӹ���
	private double cooperation; // ������д���о��뽻����
	private double travel; // ���÷�
	private double labor; // �����
	private double fuel; // ȼ�϶�����
	private double publish; // ����/����/��Ϣ����֪ʶ��Ȩ�����
	private double meeting; // �����
	private double incentive; // ������
	private double management; // �����
	private double expert; // ר����ѯ��
	private double selfRaised; // �Գ������
	private double apply; // ��ʡ������

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
