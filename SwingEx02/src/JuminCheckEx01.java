import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class JuminCheckEx01 extends JFrame {

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
					JuminCheckEx01 frame = new JuminCheckEx01();
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
	public JuminCheckEx01() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		text1 = new JTextField();
		text1.setBounds(30, 21, 116, 21);
		contentPane.add(text1);
		text1.setColumns(10);
		
		text2 = new JTextField();
		text2.setBounds(158, 21, 116, 21);
		contentPane.add(text2);
		text2.setColumns(10);
		
		JButton btn1 = new JButton("주민번호검사");
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String front = text1.getText();
				String back = text2.getText();
				if(isValidJumin(front, back)) {
				lbl.setText("올바른 주민등록번호입니다.");
				
				}else{ 
				lbl.setText("잘못된 주민등록번호입니다.");
				};
			}
		});
		btn1.setBounds(286, 20, 133, 21);
		contentPane.add(btn1);
		
		JLabel lbl = new JLabel("결과");
		lbl.setBounds(30, 74, 353, 21);
		contentPane.add(lbl);
	}
	
	public boolean isValidJumin(String front, String back) {
		if(front.length() != 6 || back.length() != 7) {
			
			return false;
		}
	
		int[] weights = {2,3,4,5,6,7,8,9,2,3,4,5};
		int sum = 0;
		
		for(int i=0; i<6; i++) {
			sum += (front.charAt(i)- '0') * weights[i];
		}
		
		for(int i=0; i<6; i++) {
			sum += (back.charAt(i)- '0') * weights[i+6];
		}
		
		int lastNumber = (11- (sum % 11))% 10;
		
		return lastNumber == (back.charAt(6)- '0');
		}

	
}
