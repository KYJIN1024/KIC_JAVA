import javax.swing.DefaultComboBoxModel;

public class CustomComboBoxModel1 extends DefaultComboBoxModel<String> {
	private String[] items = new String[] { "사과", "참외", "수박", "딸기" };

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		System.out.println("getSize 호출");
		return items.length;
	}

	@Override
	public String getElementAt(int index) {
		// TODO Auto-generated method stub
		System.out.println("getElementAt 호출");
		return items[index];
	}
}
