package expense.service;

import java.util.List;

import com.sun.org.apache.bcel.internal.generic.DRETURN;

import expense.DAO.TecMngAreaDAO;
import expense.model.TecMngArea;

/**
 * Created by lenovo on 2017/7/7 0007.
 */
public class TecMngAreaService {
	private TecMngAreaDAO tecMngAreaDAO;

	public TecMngAreaDAO getTecMngAreaDAO() {
		return tecMngAreaDAO;
	}

	public void setTecMngAreaDAO(TecMngAreaDAO tecMngAreaDAO) {
		this.tecMngAreaDAO = tecMngAreaDAO;
	}

	public TecMngArea findTecMngArea(String barcode) {
		return tecMngAreaDAO.findTecMngArea(barcode);
	}

	public void addTecMngArea(TecMngArea tecMngArea) {

		tecMngAreaDAO.addTecMngArea(tecMngArea);
	}

	public void modifyTecMngArea(TecMngArea tecMngArea) {
		tecMngAreaDAO.modifyTecMngArea(tecMngArea);
	}
	
	public List<TecMngArea> findByName(String name){
		return tecMngAreaDAO.findByName(name);
	}
	
	public List<TecMngArea> findAll(){
		return tecMngAreaDAO.findByName("");
	}
	
	public List<TecMngArea> findAllInUse(){
		return tecMngAreaDAO.findByNameInUse("");
	}

}
