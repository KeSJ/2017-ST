package expense.action;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.apache.commons.io.FileUtils;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import expense.model.Accept;
import expense.model.Appendix;
import expense.model.Expense;
import expense.model.ExpenseDetail;
import expense.model.ExpenseItem;
import expense.service.AcceptService;
import expense.service.AppendixService;
import expense.service.ExpenseDetailService;
import expense.service.ExpenseItemService;
import expense.service.ExpenseService;

public class ExpenseAction extends ActionSupport {
	private ExpenseService expenseService;
	private ExpenseItemService expenseItemService;
	private ExpenseDetailService expenseDetailService;
	private AcceptService acceptService;
	private AppendixService appendixService;

	private List<ExpenseItem> expenseItemsInUse;

	private String unit_name;
	private int budget_id;
	private int qu_bill;
	private File file;
	private String fileFileName;
	private String fileContentType;
	private String newFileName;
	private double itemMoney[];
	private String teacher_id[];
	private String teacher_name[];
	private String bank_id[];
	private double exp_money[];

	private String returnMsg;

	public String loadExpenseRequest() {
		expenseItemsInUse = expenseItemService.findAllInUse();
		return SUCCESS;
	}

	public String expenseRequest(){
		System.out.println(teacher_id.length);
		//��Ԥ���ܱ�
		System.out.println("��Ԥ���ܱ�");
		Expense expense = new Expense();
		expense.setBudId(budget_id);
		expense.seteUnit(unit_name);
		expense.seteAppDate(new Date(System.currentTimeMillis()));
		expense.seteAppend(qu_bill);
		expense.seteAppTea(ActionContext.getContext().getSession().get("currentUserId").toString());
		expenseService.addExpense(expense);
		//��Ԥ����ϸ
		expenseItemsInUse = expenseItemService.findAllInUse();
		for(int i = 0; i < itemMoney.length; i++){
			if(itemMoney[i] > 0){
				ExpenseDetail expenseDetail = new ExpenseDetail();
				expenseDetail.seteId(expense.geteId());
				expenseDetail.setExpDetSum(itemMoney[i]);
				expenseDetail.setExpItemId(expenseItemsInUse.get(i).getExpItemId());
				expenseDetailService.addExpendDetail(expenseDetail);
			}
		}
		//��ת����Ϣ
		if(teacher_id.length == 0){
			returnMsg = "û��ת����Ϣ";
			return INPUT;
		}
		for(int i = 0; i < teacher_id.length; i++){
			Accept accept = new Accept();
			accept.setAcceptCardId(bank_id[i]);
			accept.setAcceptSum(exp_money[i]);
			accept.setApplyId(expense.geteId());
			accept.setApplyType("�������ܵ�");
			accept.setTeacherId(teacher_id[i]);
			acceptService.addAccept(accept);
		}
		//�渽������
		System.out.println("�ļ�����" + fileFileName);
		System.out.println("�ļ����ͣ�" + fileContentType);
		if (file != null) {
			String realPath = "F:/������/��ѧ��/file";
			System.out.println("�ļ��ı���·����" + realPath);
			
			String suffix = fileFileName.substring(fileFileName.lastIndexOf("."));
			if(fileFileName.lastIndexOf(".") == -1){
				return INPUT;
			}
			
			newFileName = UUID.randomUUID() + suffix;
			File savefile = new File(new File(realPath), newFileName);
			if (!savefile.getParentFile().exists())
				savefile.getParentFile().mkdirs();
			try {
				// �����ļ�
				
				FileUtils.copyFile(file, savefile);
				System.out.println("�ļ��ϴ��ɹ�");
				
				Appendix appendix = new Appendix();
				appendix.setApplyId(expense.geteId());
				appendix.setApplyType("�������ܵ�");
				appendix.setFilePath(realPath);
				appendix.setRealName(fileFileName);
				appendix.setUuidName(newFileName);
				
				appendixService.addAppendix(appendix);
				
				System.out.println("�ļ���Ϣ�Ѵ������ݿ�");
			} catch (IOException e) {
				e.printStackTrace();
				returnMsg = "�ļ��ϴ�ʧ��";
				System.out.println("�ļ��ϴ�ʧ��");
				return INPUT;
			}
		}
		return SUCCESS;
	}

	public ExpenseService getExpenseService() {
		return expenseService;
	}

	public void setExpenseService(ExpenseService expenseService) {
		this.expenseService = expenseService;
	}

	public ExpenseItemService getExpenseItemService() {
		return expenseItemService;
	}

	public void setExpenseItemService(ExpenseItemService expenseItemService) {
		this.expenseItemService = expenseItemService;
	}

	public ExpenseDetailService getExpenseDetailService() {
		return expenseDetailService;
	}

	public void setExpenseDetailService(ExpenseDetailService expenseDetailService) {
		this.expenseDetailService = expenseDetailService;
	}

	public AcceptService getAcceptService() {
		return acceptService;
	}

	public void setAcceptService(AcceptService acceptService) {
		this.acceptService = acceptService;
	}

	public AppendixService getAppendixService() {
		return appendixService;
	}

	public void setAppendixService(AppendixService appendixService) {
		this.appendixService = appendixService;
	}

	public List<ExpenseItem> getExpenseItemsInUse() {
		return expenseItemsInUse;
	}

	public void setUnit_name(String unit_name) {
		this.unit_name = unit_name;
	}

	public void setBudget_id(int budget_id) {
		this.budget_id = budget_id;
	}

	public void setQu_bill(int qu_bill) {
		this.qu_bill = qu_bill;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public void setFileFileName(String fileFileName) {
		this.fileFileName = fileFileName;
	}

	public void setFileContentType(String fileContentType) {
		this.fileContentType = fileContentType;
	}

	public void setNewFileName(String newFileName) {
		this.newFileName = newFileName;
	}

	public void setItemMoney(double[] itemMoney) {
		this.itemMoney = itemMoney;
	}

	public void setTeacher_id(String[] teacher_id) {
		this.teacher_id = teacher_id;
	}

	public void setTeacher_name(String[] teacher_name) {
		this.teacher_name = teacher_name;
	}

	public void setBank_id(String[] bank_id) {
		this.bank_id = bank_id;
	}

	public void setExp_money(double[] exp_money) {
		this.exp_money = exp_money;
	}

	public String getReturnMsg() {
		return returnMsg;
	}

}
