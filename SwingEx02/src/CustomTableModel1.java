import javax.swing.table.AbstractTableModel;

public class CustomTableModel1 extends AbstractTableModel {
	private String[][] items = new String[][] {
		// ArrayList<ArrayList<String>>>
		// ArrayList<XXXTo>
			{ "11" , "12" , "13", "14", "15" },
			{ "21" , "22" , "23", "24", "25" },
			{ "31" , "32" , "33", "34", "35" },
			{ null , null , null , null , null}
		};
		
		private String[] columnNames = {
				"col1", "col2", "col3", "col4", "col5", 
		};
		
		public String getColumnName(int column) {
			return columnNames[column];
		}
		
	

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return items.length;
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return items[0].length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return items[rowIndex][columnIndex];
	}

}
