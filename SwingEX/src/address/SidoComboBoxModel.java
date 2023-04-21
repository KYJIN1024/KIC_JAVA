package address;

import javax.swing.DefaultComboBoxModel;
import java.util.ArrayList;

public class SidoComboBoxModel extends DefaultComboBoxModel<String> {
    public SidoComboBoxModel(DatabaseHandler dbHandler) {
        super();
        ArrayList<String> sidoData = dbHandler.getSidoData();
        addElement("시도");
        for (String sido : sidoData) {
            addElement(sido);
        }
    }
}