import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class CustomTableModel3 extends AbstractTableModel {
    private ArrayList<DataTo> items;
    private String[] columnNames = {"Num1", "Num2", "Num3", "Num4", "Num5"};

    public CustomTableModel3() {
        DataTo to1 = new DataTo();
        to1.setNum1("11");
        to1.setNum2("12");
        to1.setNum3("13");
        to1.setNum4("14");
        to1.setNum5("15");

        DataTo to2 = new DataTo();
        to2.setNum1("21");
        to2.setNum2("22");
        to2.setNum3("23");
        to2.setNum4("24");
        to2.setNum5("25");

        DataTo to3 = new DataTo();
        to3.setNum1("31");
        to3.setNum2("32");
        to3.setNum3("33");
        to3.setNum4("34");
        to3.setNum5("35");

        items = new ArrayList<>();
        items.add(to1);
        items.add(to2);
        items.add(to3);
    }

    @Override
    public int getRowCount() {
        return items.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        DataTo currentItem = items.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return currentItem.getNum1();
            case 1:
                return currentItem.getNum2();
            case 2:
                return currentItem.getNum3();
            case 3:
                return currentItem.getNum4();
            case 4:
                return currentItem.getNum5();
            default:
                return null;
        }
    }
}