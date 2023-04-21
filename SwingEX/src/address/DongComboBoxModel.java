package address;

import javax.swing.DefaultComboBoxModel;
import java.util.ArrayList;

public class DongComboBoxModel extends DefaultComboBoxModel<String> {
    public DongComboBoxModel(DatabaseHandler dbHandler, String sido, String gugun) {
        super();
        ArrayList<String> dongData = dbHandler.getDongData(sido, gugun);
        addElement("동");
        for (String dong : dongData) {
            addElement(dong);
        }
    }
}