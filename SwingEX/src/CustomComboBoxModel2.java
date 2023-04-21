import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;

public class CustomComboBoxModel2 extends DefaultComboBoxModel<String> {
	private ArrayList<String> items;

	public CustomComboBoxModel2() {
		
		items.add( "사과" );
		items.add( "참외" );
		items.add( "수박" );
		items.add( "딸기" );
		
	}
	
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return items.size();
	}
	
	private void getElementat(int index) {
		// TODO Auto-generated method stub

	}
	
	
	
	
	
	
}
