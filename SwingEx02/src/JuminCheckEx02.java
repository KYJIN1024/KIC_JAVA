import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JuminCheckEx02 extends JFrame {

	private JPanel contentPane;
	private JTextField text1;
	private JTextField text2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JuminCheckEx02 frame = new JuminCheckEx02();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public JuminCheckEx02() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		text1 = new JTextField();
		text1.setBounds(43, 20, 198, 30);
		contentPane.add(text1);
		text1.setColumns(10);
		
		text2 = new JTextField();
		text2.setBounds(270, 20, 198, 30);
		contentPane.add(text2);
		text2.setColumns(10);
		
		JButton btnNewButton = new JButton("주민번호검사");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String front = text1.getText();
				String back = text2.getText();
				if(isValidJumin(front,back)) {
					lblNewLabel.setText("올바른 주민번호입니다.");
				}
				
			}
		});
		btnNewButton.setBounds(496, 23, 105, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("결과");
		lblNewLabel.setBounds(43, 68, 425, 30);
		contentPane.add(lblNewLabel);
	}
}
