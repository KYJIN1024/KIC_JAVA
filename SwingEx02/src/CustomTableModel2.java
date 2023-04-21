import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class CustomTableModel2 extends AbstractTableModel {
	private ArrayList<ArrayList<String>> items;
	
	private String[] columnNames = {
			"col1", "col2", "col3", "col4", "col5", 
	};
	
	public String getColumnName(int column) {
		return columnNames[column];
	}
	
	
	
	public CustomTableModel2() {
		// TODO Auto-generated constructor stub
		ArrayList<String> item1 = new ArrayList<>();
		item1.add("11");
		item1.add("12");
		item1.add("13");
		item1.add("14");
		item1.add("15");
		ArrayList<String> item2 = new ArrayList<>();
		item2.add("21");
		item2.add("22");
		item2.add("23");
		item2.add("24");
		item2.add("25");
		ArrayList<String> item3 = new ArrayList<>();
		item3.add("31");
		item3.add("32");
		item3.add("33");
		item3.add("34");
		item3.add("35");
		
		items = new ArrayList<>();
		items.add( item1 );
		items.add( item2 );
		items.add( item3 );
		
	}
	

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return items.size();
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return items.get(0).size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return items.get(rowIndex).get(columnIndex);
	}

}
