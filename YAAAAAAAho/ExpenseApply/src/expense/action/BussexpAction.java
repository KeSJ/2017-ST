package expense.action;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import expense.DAO.AcceptDAO;
import expense.DAO.AppendixDAO;
import expense.DAO.BudgetDetailDAO;
import expense.DAO.BusApplyTeaDetailDAO;
import expense.DAO.BusinessDAO;
import expense.DAO.BusinessDetailDAO;
import expense.DAO.BusinessItemDAO;
import expense.DAO.BusinessLocationDAO;
import expense.model.Accept;
import expense.model.Appendix;
import expense.model.BusApplyTeaDetail;
import expense.model.Business;
import expense.model.BusinessDetail;
import expense.model.BusinessItem;
import expense.model.BusinessLocation;

public class BussexpAction {
	private String teacher_name;// 转卡人信息
	private String teacher_id;

	private String fileFileName;
	private File file;// 文件上传功能
	private String fileContentType;
	private String newFileName;
	private InputStream fileInput;
	private String fileName;
	// private String fileName;
	private String bank_id;
	private double exp_money;// 转账金额
	private String location;
	private String locationType;
	private String project_name;// 公司名
	private String teacher_name1;
	private String teacher_type1;
	private String teacher_name2;
	private String teacher_type2;
	private String teacher_name3;// 做到这。应该先提交这些东西
	private String teacher_type3;
	private int option_test;// budget_id
	private String returnMsg;
	private String buss_reason;
	private int qu_bill;
	private BusinessDAO businessDAO;
	private BusinessItemDAO businessItemDAO;
	private List<BusinessItem> businessitems;
	private BusApplyTeaDetailDAO busApplyTeaDetailDAO;
	private AcceptDAO acceptDAO;
	private AppendixDAO appendixDAO;

	private BudgetDetailDAO budgetDetailDAO;
	private BusinessDetailDAO businessDetailDAO;
	private BusinessLocationDAO businessLocationDAO;

	private List<Double> itemMoney;

	public String load() throws Exception {
		businessitems = businessItemDAO.findAllBusinessItem();

		System.out.println(
				budgetDetailDAO.findBudgetDetailByBudIDandBudItemIDetail(313, 5).getBudgetDetailSum() + "差旅费预算");
		return "success";
	}

	public String submit() throws Exception {
		System.out.println(project_name);
		double sumJsp = 0;
		System.out.println(itemMoney.get(0) + "进去了");
		if (budgetDetailDAO.findBudgetDetailByBudIDandBudItemIDetail(option_test, 5) == null) {
			returnMsg = "找不到该项目代码";
		} else {

			double sum = budgetDetailDAO.findBudgetDetailByBudIDandBudItemIDetail(option_test, 5).getBudgetDetailSum();
			System.out.println(sum);
			System.out.println("进去了");
			// 找他的差旅费的额度是多少
			for (int i = 0; i < itemMoney.size(); i++) {
				if (itemMoney.get(i) == null) {
				} else {
					sumJsp = itemMoney.get(i) + sumJsp;
				}
			}
			System.out.println("用户想要报销的总金额为" + sumJsp);
			System.out.println(locationType + "省内省外");
			if (sumJsp > sum) {
				returnMsg = "申报失败，当前请求的金额已经超出预算";
			} else {
				Business business = new Business();
				business.setBudgetId(option_test);
				System.out.println(project_name + "公司名");
				business.setbUnit(project_name);
				business.setBusReason(buss_reason);
				business.setBusAppendNum(qu_bill);
				// business.setBusApplyTea(busApplyTea);
				business.setBusApplyDate(new Date());
				business.setBusSum(sumJsp);
				businessDAO.addBusiness(business);
				// System.out.println(business.getBusinessId());
				System.out.println("开始插入BusinessDetail表");
				for (int i = 0; i < itemMoney.size(); i++) {
					if (itemMoney.get(i) != null) {
						BusinessLocation businessLocation = new BusinessLocation();
						businessLocation.setBusinessId(business.getBusinessId());
						// 乱码是因为传送给数据库数据的时候的格式有问题，在application里面改了已经
						System.out.println(location);
						businessLocation.setBusLocation(location);
						businessLocation.setBusStartDate(new Date());
						System.out.println(locationType + "出差地点的类型是");
						if (locationType.equals("2") == true) {
							businessLocation.setInProvince(false);

						} else {
							businessLocation.setInProvince(true);// 2省外1省内

						}
						businessLocationDAO.addBusinessLocation(businessLocation);
						BusinessDetail businessDetail = new BusinessDetail();
						businessDetail.setBusDetSum(itemMoney.get(i));
						businessDetail.setBusLocId(businessLocation.getBusLocId());
						businessDetail.setBusItemId(businessItemDAO.findAllBusinessItem().get(i).getBusItemId());
						businessDetailDAO.addBusinessDetail(businessDetail);
					}

				}
				if (teacher_name1 != null) {
					BusApplyTeaDetail busApplyTeaDetail = new BusApplyTeaDetail();
					// busApplyTeaDetail.setTeacherName(teacher_name1);
					// System.out.println(teacher_name1);
					// System.out.println(teacher_type1);
					// System.out.println(business.getBusinessId());
					busApplyTeaDetail.setTeacherName(teacher_name1);
					busApplyTeaDetail.setTeacherPosition(teacher_type1);
					busApplyTeaDetail.setBusinessId(business.getBusinessId());
					busApplyTeaDetailDAO.addBusApplyTeaDetail(busApplyTeaDetail);

				}
				if (teacher_name2 != null) {
					BusApplyTeaDetail busApplyTeaDetail = new BusApplyTeaDetail();
					// busApplyTeaDetail.setTeacherName(teacher_name1);
					System.out.println(teacher_name2);
					System.out.println(teacher_type2);
					System.out.println(business.getBusinessId());
					busApplyTeaDetail.setTeacherName(teacher_name2);
					busApplyTeaDetail.setTeacherPosition(teacher_type2);
					busApplyTeaDetail.setBusinessId(business.getBusinessId());
					busApplyTeaDetailDAO.addBusApplyTeaDetail(busApplyTeaDetail);
				}
				if (teacher_name3 != null) {
					BusApplyTeaDetail busApplyTeaDetail = new BusApplyTeaDetail();
					// busApplyTeaDetail.setTeacherName(teacher_name1);
					System.out.println(teacher_name3);
					System.out.println(teacher_type3);
					System.out.println(business.getBusinessId());
					busApplyTeaDetail.setTeacherName(teacher_name3);
					busApplyTeaDetail.setTeacherPosition(teacher_type3);
					busApplyTeaDetail.setBusinessId(business.getBusinessId());
					busApplyTeaDetailDAO.addBusApplyTeaDetail(busApplyTeaDetail);
				}

				System.out.println(teacher_name + "教师名");
				System.out.println(bank_id + "卡号");
				System.out.println(exp_money + "汇款金额");
				if (teacher_name != null && bank_id != null & exp_money != 0) {
					System.out.println("进入accept");
					Accept accept = new Accept();
					accept.setAcceptCardId(bank_id);
					accept.setAcceptSum(exp_money);
					accept.setApplyType("出差报销单");
					accept.setTeacherId(teacher_id);
					accept.setApplyId(business.getBusinessId());
					acceptDAO.addAccept(accept);
				}
				System.out.println("文件名：" + fileFileName);
				System.out.println("文件类型：" + fileContentType);
				if (file == null) {
					System.out.println("文件读不出来");
				}
				if (file != null) {
					String realPath = "F:/大三下/短学期/file";
					System.out.println("文件的保存路径：" + realPath);

					String suffix = fileFileName.substring(fileFileName.lastIndexOf("."));
					if (fileFileName.lastIndexOf(".") == -1) {
						returnMsg = "上传失败";

					}

					newFileName = UUID.randomUUID() + suffix;
					File savefile = new File(new File(realPath), newFileName);
					if (!savefile.getParentFile().exists())
						savefile.getParentFile().mkdirs();
					try {
						// 复制文件

						FileUtils.copyFile(file, savefile);
						System.out.println("文件上传成功");

						Appendix appendix = new Appendix();
						appendix.setApplyId(business.getBusinessId());
						appendix.setApplyType("出差报销单");
						appendix.setFilePath(realPath);
						appendix.setRealName(fileFileName);
						appendix.setUuidName(newFileName);

						appendixDAO.addAppedendix(appendix);

						System.out.println("文件信息已存入数据库");
					} catch (IOException e) {
						e.printStackTrace();
						returnMsg = "文件上传失败";
						System.out.println("文件上传失败");
						return "success";
					}
				}

			}

		}
		return "success";
	}

	public String getTeacher_name() {
		return teacher_name;
	}

	public void setTeacher_name(String teacher_name) {
		this.teacher_name = teacher_name;
	}

	public String getTeacher_id() {
		return teacher_id;
	}

	public void setTeacher_id(String teacher_id) {
		this.teacher_id = teacher_id;
	}

	public String getFileFileName() {
		return fileFileName;
	}

	public void setFileFileName(String fileFileName) {
		this.fileFileName = fileFileName;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public String getFileContentType() {
		return fileContentType;
	}

	public void setFileContentType(String fileContentType) {
		this.fileContentType = fileContentType;
	}

	public String getNewFileName() {
		return newFileName;
	}

	public void setNewFileName(String newFileName) {
		this.newFileName = newFileName;
	}

	public InputStream getFileInput() {
		return fileInput;
	}

	public void setFileInput(InputStream fileInput) {
		this.fileInput = fileInput;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getBank_id() {
		return bank_id;
	}

	public void setBank_id(String bank_id) {
		this.bank_id = bank_id;
	}

	public double getExp_money() {
		return exp_money;
	}

	public void setExp_money(double exp_money) {
		this.exp_money = exp_money;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getLocationType() {
		return locationType;
	}

	public void setLocationType(String locationType) {
		this.locationType = locationType;
	}

	public String getProject_name() {
		return project_name;
	}

	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}

	public String getTeacher_name1() {
		return teacher_name1;
	}

	public void setTeacher_name1(String teacher_name1) {
		this.teacher_name1 = teacher_name1;
	}

	public String getTeacher_type1() {
		return teacher_type1;
	}

	public void setTeacher_type1(String teacher_type1) {
		this.teacher_type1 = teacher_type1;
	}

	public String getTeacher_name2() {
		return teacher_name2;
	}

	public void setTeacher_name2(String teacher_name2) {
		this.teacher_name2 = teacher_name2;
	}

	public String getTeacher_type2() {
		return teacher_type2;
	}

	public void setTeacher_type2(String teacher_type2) {
		this.teacher_type2 = teacher_type2;
	}

	public String getTeacher_name3() {
		return teacher_name3;
	}

	public void setTeacher_name3(String teacher_name3) {
		this.teacher_name3 = teacher_name3;
	}

	public String getTeacher_type3() {
		return teacher_type3;
	}

	public void setTeacher_type3(String teacher_type3) {
		this.teacher_type3 = teacher_type3;
	}

	public int getOption_test() {
		return option_test;
	}

	public void setOption_test(int option_test) {
		this.option_test = option_test;
	}

	public String getReturnMsg() {
		return returnMsg;
	}

	public void setReturnMsg(String returnMsg) {
		this.returnMsg = returnMsg;
	}

	public String getBuss_reason() {
		return buss_reason;
	}

	public void setBuss_reason(String buss_reason) {
		this.buss_reason = buss_reason;
	}

	public int getQu_bill() {
		return qu_bill;
	}

	public void setQu_bill(int qu_bill) {
		this.qu_bill = qu_bill;
	}

	public BusinessDAO getBusinessDAO() {
		return businessDAO;
	}

	public void setBusinessDAO(BusinessDAO businessDAO) {
		this.businessDAO = businessDAO;
	}

	public BusinessItemDAO getBusinessItemDAO() {
		return businessItemDAO;
	}

	public void setBusinessItemDAO(BusinessItemDAO businessItemDAO) {
		this.businessItemDAO = businessItemDAO;
	}

	public List<BusinessItem> getBusinessitems() {
		return businessitems;
	}

	public void setBusinessitems(List<BusinessItem> businessitems) {
		this.businessitems = businessitems;
	}

	public BusApplyTeaDetailDAO getBusApplyTeaDetailDAO() {
		return busApplyTeaDetailDAO;
	}

	public void setBusApplyTeaDetailDAO(BusApplyTeaDetailDAO busApplyTeaDetailDAO) {
		this.busApplyTeaDetailDAO = busApplyTeaDetailDAO;
	}

	public AcceptDAO getAcceptDAO() {
		return acceptDAO;
	}

	public void setAcceptDAO(AcceptDAO acceptDAO) {
		this.acceptDAO = acceptDAO;
	}

	public AppendixDAO getAppendixDAO() {
		return appendixDAO;
	}

	public void setAppendixDAO(AppendixDAO appendixDAO) {
		this.appendixDAO = appendixDAO;
	}

	public BudgetDetailDAO getBudgetDetailDAO() {
		return budgetDetailDAO;
	}

	public void setBudgetDetailDAO(BudgetDetailDAO budgetDetailDAO) {
		this.budgetDetailDAO = budgetDetailDAO;
	}

	public BusinessDetailDAO getBusinessDetailDAO() {
		return businessDetailDAO;
	}

	public void setBusinessDetailDAO(BusinessDetailDAO businessDetailDAO) {
		this.businessDetailDAO = businessDetailDAO;
	}

	public BusinessLocationDAO getBusinessLocationDAO() {
		return businessLocationDAO;
	}

	public void setBusinessLocationDAO(BusinessLocationDAO businessLocationDAO) {
		this.businessLocationDAO = businessLocationDAO;
	}

	public List<Double> getItemMoney() {
		return itemMoney;
	}

	public void setItemMoney(List<Double> itemMoney) {
		this.itemMoney = itemMoney;
	}

}
