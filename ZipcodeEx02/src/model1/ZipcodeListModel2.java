package model1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.AbstractListModel;

public class ZipcodeListModel2 extends AbstractListModel<String> {
	private ArrayList<ZipcodeTO> items;
	
	public ZipcodeListModel2(String strDong) {
		
		ZipcodeDAO dao = new ZipcodeDAO();
		this.items = dao.searchZipcode(strDong);

		
		
	}
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return items.size();
	}

	@Override
	public String getElementAt(int index) {
		ZipcodeTO to = items.get(index);
		// return items.get(index);
		return String.format("[%s] %s %s %s %s %s", 
				to.getZipcode(), to.getSido(), to.getGugun(),
				to.getDong(), to.getRi(), to.getBunji());
				
	}

}
