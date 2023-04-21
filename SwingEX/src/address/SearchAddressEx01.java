// 우편번호 데이터 출력  
package address;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class SearchAddressEx01 extends JFrame {

    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    SearchAddressEx01 frame = new SearchAddressEx01();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public SearchAddressEx01() {
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 600);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "\uC6B0\uD3B8\uBC88\uD638 \uAC80\uC0C9\uAE30", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
        panel.setBounds(29, 30, 677, 66);
        contentPane.add(panel);
        panel.setLayout(null);

        JComboBox comboBox1 = new JComboBox();
        comboBox1.setBounds(6, 17, 167, 29);
        panel.add(comboBox1);
        comboBox1.setModel(new DefaultComboBoxModel(new String[]{"시도"}));

        JComboBox comboBox2 = new JComboBox();
        comboBox2.setBounds(231, 17, 167, 29);
        panel.add(comboBox2);
        comboBox2.setModel(new DefaultComboBoxModel(new String[]{"구군"}));

        JComboBox comboBox3 = new JComboBox();
        comboBox3.setBounds(445, 20, 167, 29);
        panel.add(comboBox3);
        comboBox3.setModel(new DefaultComboBoxModel(new String[]{"동"}));

        JTextArea textArea = new JTextArea();
        textArea.setBounds(35, 120, 706, 393);
        contentPane.add(textArea);

        DatabaseHandler dbHandler = new DatabaseHandler();
        ArrayList<String> sidoData = dbHandler.getSidoData();

        for (String sido : sidoData) {
            comboBox1.addItem(sido);
        }

        ActionListener comboBoxListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 모든 콤보 박스에서 선택된 값을 가져옵니다.
                String selectedSido = (String) comboBox1.getSelectedItem();
                String selectedGugun = (String) comboBox2.getSelectedItem();
                String selectedDong = (String) comboBox3.getSelectedItem();

                // 시도, 구군, 동이 모두 선택되었을 경우에만 데이터를 가져옵니다.
                if (!"시도".equals(selectedSido) && !"구군".equals(selectedGugun) && !"동".equals(selectedDong)) {
                    // 주소 데이터를 가져옵니다.
                    ArrayList<String> addressDataList = dbHandler.getAddressData(selectedSido, selectedGugun, selectedDong);

                    // 텍스트 영역에 데이터를 출력합니다.
                    textArea.setText("");
                    for (String addressData : addressDataList) {
                        textArea.append(addressData + "\n");
                    }
                }
            }
        };

    comboBox1.addActionListener(comboBoxListener);
    comboBox2.addActionListener(comboBoxListener);
    comboBox3.addActionListener(comboBoxListener);

    comboBox1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String selectedSido = (String) comboBox1.getSelectedItem();

            if (!"시도".equals(selectedSido)) {
                ArrayList<String> gugunData = dbHandler.getGugunData(selectedSido);
                comboBox2.removeAllItems();

                for (String gugun : gugunData) {
                    comboBox2.addItem(gugun);
                }
            }

            comboBoxListener.actionPerformed(e);
        }
    });

    comboBox2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String selectedSido = (String) comboBox1.getSelectedItem();
            String selectedGugun = (String)comboBox2.getSelectedItem();
            if (!"시도".equals(selectedSido) && !"구군".equals(selectedGugun)) {
                ArrayList<String> dongData = dbHandler.getDongData(selectedSido, selectedGugun);
                comboBox3.removeAllItems();

                for (String dong : dongData) {
                    comboBox3.addItem(dong);
                }
            }

            comboBoxListener.actionPerformed(e);
        }
    });
}
}