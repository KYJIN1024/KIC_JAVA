package zipcodemodel;

import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;

import model.ZipcodeDAO;
import model.ZipcodeTO;

public class GugunComboBoxModel extends DefaultComboBoxModel<String> {
	private ArrayList<ZipcodeTO> guguns;
	
	public GugunComboBoxModel() {
		// TODO Auto-generated constructor stub
		guguns = new ArrayList<>();
		
		ZipcodeTO to = new ZipcodeTO();
		to.setGugun( "구군" );
		
		guguns.add(to);
	}
	
	public GugunComboBoxModel(String strSido) {
		ZipcodeDAO dao = new ZipcodeDAO();
		guguns = dao.listGugun(strSido);
	}
	
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return guguns.size();
	}
	
	@Override
	public String getElementAt(int index) {
		// TODO Auto-generated method stub
		ZipcodeTO to = guguns.get( index );
		return to.getGugun();
	}
}
