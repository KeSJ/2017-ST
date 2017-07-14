package expense.service;

import java.util.List;

import expense.DAO.AppendixDAO;
import expense.model.Appendix;

/**
 * Created by lenovo on 2017/7/7 0007.
 */
public class AppendixService {
	private AppendixDAO appendixDAO;

	public AppendixDAO getAppendixDAODAO() {
		return appendixDAO;
	}

	public void setAppendixDAO(AppendixDAO appendixDAO) {
		this.appendixDAO = appendixDAO;
	}

	public Appendix findAppendix(String barcode) {
		return appendixDAO.findAppendix(barcode);
	}

	public void addAppendix(Appendix appendix) {

		appendixDAO.addAppedendix(appendix);
	}

	public void modifyAppendix(Appendix appendix) {
		appendixDAO.modifyAppendix(appendix);
	}

	public List<Appendix> findByApply(int applyId, String applyType){
		return appendixDAO.findAppexdixByApply(applyId, applyType);
	}
}
