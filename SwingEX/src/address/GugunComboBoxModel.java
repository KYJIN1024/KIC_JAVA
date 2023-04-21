package address;

import javax.swing.DefaultComboBoxModel;
import java.util.ArrayList;

public class GugunComboBoxModel extends DefaultComboBoxModel<String> {
    public GugunComboBoxModel(DatabaseHandler dbHandler, String sido) {
        super();
        ArrayList<String> gugunData = dbHandler.getGugunData(sido);
        addElement("구군");
        for (String gugun : gugunData) {
            addElement(gugun);
        }
    }
}
