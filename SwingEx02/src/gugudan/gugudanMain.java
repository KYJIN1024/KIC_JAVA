package gugudan;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class gugudanMain extends JFrame {

	private JPanel contentPane;
	private JTextField textField1;
	private JTextField textField2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gugudanMain frame = new gugudanMain();
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
	public gugudanMain() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "\uAD6C\uAD6C\uB2E8", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(4, 12, 518, 76);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textField1 = new JTextField();
		textField1.setBounds(66, 18, 328, 21);
		contentPane.add(textField1);
		panel.add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setBounds(66, 49, 328, 21);
		contentPane.add(textField2);
		panel.add(textField2);
		textField2.setColumns(10);
		
		JButton btn = new JButton("출력");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GugudanJdialog dialog = new GugudanJdialog(textField1.getText());
				
				dialog.setModal(true);
				dialog.setVisible(true);
				
				String data = dialog.getData();
				textField2.setText(data);
				
				
			}
		});
		btn.setBounds(404, 17, 108, 51);
		panel.add(btn);
		
		JLabel lbl1 = new JLabel("시작단");
		lbl1.setBounds(6, 21, 50, 15);
		panel.add(lbl1);
		lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lbl2 = new JLabel("끝단");
		lbl2.setBounds(6, 52, 50, 15);
		panel.add(lbl2);
		lbl2.setHorizontalAlignment(SwingConstants.CENTER);
	}
}
