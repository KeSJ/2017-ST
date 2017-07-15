package expense.action;

import java.io.FileOutputStream;
import java.util.List;

import expense.DAO.BudgetDAO;
import expense.DAO.BusinessDAO;
import expense.DAO.ExpenseDetailDAO;
import expense.DAO.UserDAO;
import expense.model.Budget;
import expense.model.Business;
import expense.model.User;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.CellRangeAddress;

public class CountAction {

	private double csum;// ��������ܽ��

	public double getCsum() {
		return csum;
	}

	public void setCsum(double csum) {
		this.csum = csum;
	}

	public BusinessDAO getBusinessDAO() {
		return businessDAO;
	}

	public void setBusinessDAO(BusinessDAO businessDAO) {
		this.businessDAO = businessDAO;
	}

	private String teacher_id;//
	private static String teacher_id2;
	private int project_id;
	private double selfRaised; // �Գ������
	private static double selfRaised2;
	private double apply; // ��ʡ������
	private static double apply2;
	private double sum;
	private static double sum2;
	private String returnMsg;
	private String project_name;
	private static String project_name2;
	private double rest;
	private static double rest2;
	private static double csum2;

	public String getProject_name() {
		return project_name;
	}

	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}

	private UserDAO userDAO;
	private BudgetDAO budgetDAO;
	private BusinessDAO businessDAO;
	private ExpenseDetailDAO expenseDetailDAO;

	public ExpenseDetailDAO getExpenseDetailDAO() {
		return expenseDetailDAO;
	}

	public void setExpenseDetailDAO(ExpenseDetailDAO expenseDetailDAO) {
		this.expenseDetailDAO = expenseDetailDAO;
	}

	public String load() throws Exception {
		if (teacher_id != null) {
			teacher_id2 = teacher_id;
			System.out.println("����action");
			Budget budget = budgetDAO.findBudet(project_id);
			User user = userDAO.findUser(teacher_id);
			if (budget == null) {
				returnMsg = "�Ҳ�����Ӧ����Ŀ";
				return "success";
			}

			if (user == null) {
				returnMsg = "�Ҳ�����Ӧ���û�";
				return "success";
			}
			selfRaised = budget.getSelfRaised();
			selfRaised2 = selfRaised;
			apply = budget.getApply();
			apply2 = apply;
			sum = selfRaised + apply;
			sum2 = sum;

			project_name = budget.getProjectName();
			project_name2 = project_name;
			List<Business> businesses = businessDAO.findBusinessByBudgetId(project_id);
			for (int i = 0; i < businesses.size(); i++) {
				csum = csum + businesses.get(i).getBusSum();

			}
			csum2 = csum;

			rest = sum - apply;
			rest2 = rest;
		}
		return "success";

	}

	public String export() throws Exception {

		System.out.println("csum2" + csum2);
		// ����HSSFWorkbook����(excel���ĵ�����)
		HSSFWorkbook wb = new HSSFWorkbook();
		// �����µ�sheet����excel�ı���
		HSSFSheet sheet = wb.createSheet(teacher_id2 + "ͳ�Ʊ�");
		// ��sheet�ﴴ����һ�У�����Ϊ������(excel����)��������0��65535֮����κ�һ��
		HSSFRow row1 = sheet.createRow(0);
		// ������Ԫ��excel�ĵ�Ԫ�񣬲���Ϊ��������������0��255֮����κ�һ��
		HSSFCell cell = row1.createCell(0);
		// ���õ�Ԫ������
		cell.setCellValue(teacher_id + "ͳ�Ʊ�");
		// �ϲ���Ԫ��CellRangeAddress����������α�ʾ��ʼ�У������У���ʼ�У� ������
		sheet.addMergedRegion(new CellRangeAddress(0, 0, 0, 3));
		// ��sheet�ﴴ���ڶ���
		HSSFRow row2 = sheet.createRow(1);
		// ������Ԫ�����õ�Ԫ������
		row2.createCell(0).setCellValue("����");
		row2.createCell(1).setCellValue("��Ŀ����");
		row2.createCell(2).setCellValue("����ˣ��ܼ�");
		row2.createCell(3).setCellValue("����ˣ��Գ������");
		row2.createCell(4).setCellValue("����ˣ���ʡ������");
		row2.createCell(5).setCellValue("����ˣ�ʣ��");
		row2.createCell(6).setCellValue("��������ܼ�");
		HSSFRow row3 = sheet.createRow(2);
		row3.createCell(0).setCellValue(teacher_id2);
		row3.createCell(1).setCellValue(project_name2);
		row3.createCell(2).setCellValue(sum2);
		row3.createCell(3).setCellValue(selfRaised2);
		row3.createCell(4).setCellValue(apply2);
		row3.createCell(5).setCellValue(rest2);
		row3.createCell(6).setCellValue(csum2);
		try {
			FileOutputStream fout = new FileOutputStream("F:/" + teacher_id2 + ".xls");
			wb.write(fout);
			fout.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "success";
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

	public double getSum() {
		return sum;
	}

	public void setSum(double sum) {
		this.sum = sum;
	}

	public String getReturnMsg() {
		return returnMsg;
	}

	public void setReturnMsg(String returnMsg) {
		this.returnMsg = returnMsg;
	}

	public BudgetDAO getBudgetDAO() {
		return budgetDAO;
	}

	public void setBudgetDAO(BudgetDAO budgetDAO) {
		this.budgetDAO = budgetDAO;
	}

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public String getTeacher_id() {
		return teacher_id;
	}

	public void setTeacher_id(String teacher_id) {
		this.teacher_id = teacher_id;
	}

	public int getProject_id() {
		return project_id;
	}

	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}

	public double getRest() {
		return rest;
	}

	public void setRest(double rest) {
		this.rest = rest;
	}

}
