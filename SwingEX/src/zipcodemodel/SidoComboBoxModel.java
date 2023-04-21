package zipcodemodel;

import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;

import model.ZipcodeDAO;
import model.ZipcodeTO;

public class SidoComboBoxModel extends DefaultComboBoxModel<String> {
	private ArrayList<ZipcodeTO> sidos;
	
	public SidoComboBoxModel() {
		// TODO Auto-generated constructor stub
		
		//sidos = new ArrayList<>();
		//ZipcodeTO to = new ZipcodeTO();
		//to.setSido( "시도" );
		//sidos.add(to);
		
		ZipcodeDAO dao = new ZipcodeDAO();
		sidos = dao.listSido();
	}
	
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return sidos.size();
	}
	
	@Override
	public String getElementAt(int index) {
		// TODO Auto-generated method stub
		ZipcodeTO to = sidos.get( index );
		return to.getSido();
	}
}




