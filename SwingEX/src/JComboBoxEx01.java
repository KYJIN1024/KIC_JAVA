import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class JComboBoxEx01 extends JFrame {

	private JPanel contentPane;
	private JComboBox<String> comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JComboBoxEx01 frame = new JComboBoxEx01();
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
	public JComboBoxEx01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 613, 586);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		comboBox = new JComboBox<String>();
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {	// 선택/선택되지않음 두번 호출
				if(e.getStateChange()==ItemEvent.SELECTED) {
					System.out.println("선택 호출"); 
				}
				if(e.getStateChange()==ItemEvent.DESELECTED) {
					System.out.println("선택x 호출"); 
				}
			}
		});
		comboBox.setFont(new Font("굴림", Font.PLAIN, 19));
		// 1.
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"사과", "딸기", "수박", "참외"}));
		
		// 2.
		//comboBox.setModel(new CustomComboBoxModel());
		
		comboBox.setSelectedIndex(1);
		comboBox.setBounds(17, 15, 393, 34);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println(comboBox.getSelectedIndex());
				System.out.println((String)comboBox.getSelectedItem());
			}
		});
		btnNewButton.setBounds(445, 18, 129, 29);
		contentPane.add(btnNewButton);
	}
}