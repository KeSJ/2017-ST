package expense.action;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import expense.model.Accept;
import expense.model.Appendix;
import expense.model.Budget;
import expense.model.BudgetDetail;
import expense.model.BudgetItem;
import expense.model.Expense;
import expense.model.ExpenseDetail;
import expense.model.ExpenseItem;
import expense.service.AcceptService;
import expense.service.AppendixService;
import expense.service.BudgetDetailService;
import expense.service.BudgetItemService;
import expense.service.BudgetService;
import expense.service.ExpenseDetailService;
import expense.service.ExpenseItemService;
import expense.service.ExpenseService;
import expense.service.UserService;

public class ExpenseAction extends ActionSupport {
	private ExpenseService expenseService;
	private ExpenseItemService expenseItemService;
	private ExpenseDetailService expenseDetailService;
	private AcceptService acceptService;
	private AppendixService appendixService;
	private BudgetService budgetService;
	private BudgetDetailService budgetDetailService;
	private BudgetItemService budgetItemService;
	private UserService userService;

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

	private int expense_id;
	private List<Expense> expenses;
	private List<ExpenseItem> expenseItemsAll;
	private double total_money_budget;
	private Budget budget;
	private List<BudgetItem> budgetItems;
	private List<BudgetItem> budgetItemsAll;
	private Expense expense;
	private List<ExpenseItem> expenseItems;
	private double total_money_expense;
	private List<Accept> accepts;
	private String file_path;

	private int itemId;

	private String exp_item_name;
	private int budget_item_id;
	private int id;

	private String defuse_reason;

	private String returnMsg;

	public String loadExpenseRequest() {
		expenseItemsInUse = expenseItemService.findAllInUse();
		return SUCCESS;
	}

	public String expenseRequest() {
		System.out.println(teacher_id.length);
		// ��Ԥ���ܱ�
		System.out.println("��Ԥ���ܱ�");
		Expense expense = new Expense();
		expense.setBudId(budget_id);
		expense.seteUnit(unit_name);
		expense.seteAppDate(new Date(System.currentTimeMillis()));
		expense.seteAppend(qu_bill);
		expense.seteAppTea(ActionContext.getContext().getSession().get("currentUserId").toString());
		expenseService.addExpense(expense);
		// ��Ԥ����ϸ
		expenseItemsInUse = expenseItemService.findAllInUse();
		for (int i = 0; i < itemMoney.length; i++) {
			if (itemMoney[i] > 0) {
				ExpenseDetail expenseDetail = new ExpenseDetail();
				expenseDetail.seteId(expense.geteId());
				expenseDetail.setExpDetSum(itemMoney[i]);
				expenseDetail.setExpItemId(expenseItemsInUse.get(i).getExpItemId());
				expenseDetailService.addExpendDetail(expenseDetail);
			}
		}
		// ��ת����Ϣ
		if (teacher_id.length == 0) {
			returnMsg = "û��ת����Ϣ";
			return INPUT;
		}
		for (int i = 0; i < teacher_id.length; i++) {
			Accept accept = new Accept();
			accept.setAcceptCardId(bank_id[i]);
			accept.setAcceptSum(exp_money[i]);
			accept.setApplyId(expense.geteId());
			accept.setApplyType("�������ܵ�");
			accept.setTeacherId(teacher_id[i]);
			acceptService.addAccept(accept);
		}
		// �渽������
		System.out.println("�ļ�����" + fileFileName);
		System.out.println("�ļ����ͣ�" + fileContentType);
		if (file != null) {
			String realPath = "F:/������/��ѧ��/2017-ST/KeSJ/����/ExpenseApply/WebContent/download";
			System.out.println("�ļ��ı���·����" + realPath);

			String suffix = fileFileName.substring(fileFileName.lastIndexOf("."));
			if (fileFileName.lastIndexOf(".") == -1) {
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

	public String loadExpensePend() {
		System.out.println("������Ŀ�������ҳ�濪ʼ");
		expenses = expenseService.findAllUnpend();
		//��Ŀ����������Ŀ
		expenseItemsAll = expenseItemService.findAll();
		if (expense_id != 0) {
			expense = expenseService.findExpense(expense_id);
			budget = budgetService.findBudget(expense.getBudId());
			total_money_budget = budget.getApply() + budget.getSelfRaised();

			//Ԥ����Ŀ�ͽ��
			List<BudgetDetail> budgetDetail = budgetDetailService.findByBudId(budget.getBudId());
			System.out.println("budget detail number:" + budgetDetail.size());
			budgetItems = new ArrayList<BudgetItem>();
			for (int i = 0; i < budgetDetail.size(); i++) {
				BudgetItem budgetItem = budgetItemService.findBudgetItem(budgetDetail.get(i).getBudgetItemId());
				budgetItem.setBudgetItemMoney(budgetDetail.get(i).getBudgetDetailSum());
				budgetItems.add(budgetItem);
			}
			
			//������Ŀ�ͽ��
			List<ExpenseDetail> expenseDetails = expenseDetailService.findByEId(expense_id);
			System.out.println("expense detail number:" + expenseDetails.size());
			total_money_expense = 0;
			expenseItems = new ArrayList<ExpenseItem>();
			for (int i = 0; i < expenseDetails.size(); i++) {
				ExpenseItem expenseItem = expenseItemService.findExpenseItem(expenseDetails.get(i).getExpItemId());
				System.out.println("expense item id:" + expenseItem.getBudItemId());
				expenseItem.setExpMoney(expenseDetails.get(i).getExpDetSum());
				expenseItems.add(expenseItem);
				total_money_expense += expenseItem.getExpMoney();
			}
			
			//ת����Ϣ
			accepts = acceptService.findByApplyIdType(expense_id, "�������ܵ�");
			for (int i = 0; i < accepts.size(); i++) {
				String name = userService.findUser(accepts.get(i).getTeacherId()).getUserName();
				accepts.get(i).setTeacherName(name);
			}
		}
		
		budgetItemsAll = budgetItemService.findAllInUse();
		List<Appendix> appendix = appendixService.findByApply(expense_id, "�������ܵ�");
		System.out.println("��������" + appendix.size());
		if (appendix.isEmpty()){
			file_path = "0";
		}else{
/*			file_path = appendix.get(0).getFilePath() + "/" + appendix.get(0).getUuidName();*/
			file_path =  appendix.get(0).getUuidName();
			System.out.println("����·����" + file_path);
		}
		System.out.println("������Ŀ�������ҳ�����");
		return SUCCESS;
	}

	public String stopExpenseItem() {
		ExpenseItem expenseItem = expenseItemService.findExpenseItem(itemId);
		expenseItem.setExpInuse(false);
		expenseItemService.modifyExpenseItem(expenseItem);
		loadExpensePend();
		return SUCCESS;
	}

	public String startExpenseItem() {
		ExpenseItem expenseItem = expenseItemService.findExpenseItem(itemId);
		expenseItem.setExpInuse(true);
		expenseItemService.modifyExpenseItem(expenseItem);
		return loadExpensePend();
	}

	public String passExpense() {
		Expense expense = expenseService.findExpense(expense_id);
		expense.seteCheckDate(new Date(System.currentTimeMillis()));
		expense.seteCheckStaff(ActionContext.getContext().getSession().get("currentUserId").toString());
		expense.seteResult(true);
		expenseService.modifyExpense(expense);
		return loadExpensePend();
	}

	public String rejectExpense() {
		Expense expense = expenseService.findExpense(expense_id);
		expense.seteCheckDate(new Date(System.currentTimeMillis()));
		expense.seteCheckStaff(ActionContext.getContext().getSession().get("currentUserId").toString());
		expense.seteResult(false);
		expense.seteRejectReason(defuse_reason);
		expenseService.modifyExpense(expense);
		return loadExpensePend();
	}

	public String addExpenseItem() {
		ExpenseItem expenseItem = new ExpenseItem();
		expenseItem.setBudItemId(budget_item_id);
		expenseItem.setExpItemName(exp_item_name);
		expenseItem.setExpInuse(true);
		expenseItemService.addExpenseItem(expenseItem);
		return loadExpensePend();
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

	public BudgetService getBudgetService() {
		return budgetService;
	}

	public void setBudgetService(BudgetService budgetService) {
		this.budgetService = budgetService;
	}

	public BudgetDetailService getBudgetDetailService() {
		return budgetDetailService;
	}

	public void setBudgetDetailService(BudgetDetailService budgetDetailService) {
		this.budgetDetailService = budgetDetailService;
	}

	public BudgetItemService getBudgetItemService() {
		return budgetItemService;
	}

	public void setBudgetItemService(BudgetItemService budgetItemService) {
		this.budgetItemService = budgetItemService;
	}

	public List<ExpenseItem> getExpenseItemsInUse() {
		return expenseItemsInUse;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public void setUnit_name(String unit_name) {
		this.unit_name = unit_name;
	}

	public void setBudget_id(int budget_id) {
		this.budget_id = budget_id;
	}

	public void setId(int id) {
		this.id = id;
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

	public void setExpense_id(int expense_id) {
		this.expense_id = expense_id;
	}

	public List<Expense> getExpenses() {
		return expenses;
	}

	public List<ExpenseItem> getExpenseItemsAll() {
		return expenseItemsAll;
	}

	public double getTotal_money_budget() {
		return total_money_budget;
	}

	public Budget getBudget() {
		return budget;
	}

	public List<BudgetItem> getBudgetItems() {
		return budgetItems;
	}

	public Expense getExpense() {
		return expense;
	}

	public List<ExpenseItem> getExpenseItems() {
		return expenseItems;
	}

	public double getTotal_money_expense() {
		return total_money_expense;
	}

	public List<Accept> getAccepts() {
		return accepts;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public void setExp_item_name(String exp_item_name) {
		this.exp_item_name = exp_item_name;
	}

	public List<BudgetItem> getBudgetItemsAll() {
		return budgetItemsAll;
	}

	public void setBudget_item_id(int budget_item_id) {
		this.budget_item_id = budget_item_id;
	}

	public void setDefuse_reason(String defuse_reason) {
		this.defuse_reason = defuse_reason;
	}

	public String getFile_path() {
		return file_path;
	}

	public String getReturnMsg() {
		return returnMsg;
	}
}
