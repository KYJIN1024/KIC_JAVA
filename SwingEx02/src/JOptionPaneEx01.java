import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JOptionPaneEx01 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JOptionPaneEx01 frame = new JOptionPaneEx01();
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
	public JOptionPaneEx01() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn1 = new JButton("New button");
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// 에러 / 경고
				
				JOptionPane.showMessageDialog(JOptionPaneEx01.this, "메세지","새 타이틀", JOptionPane.INFORMATION_MESSAGE);
				
				
			}
		});
		btn1.setBounds(37, 23, 112, 23);
		contentPane.add(btn1);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				//JOptionPane.showConfirmDialog(JOptionPaneEx01.this, "메세지");
				
				//확인 취소 x버튼 클릭시 해당되는 문구출력
				int result = JOptionPane.showConfirmDialog(JOptionPaneEx01.this, "메세지", "새타이틀", JOptionPane.OK_CANCEL_OPTION);
				if( result == JOptionPane.OK_OPTION) {
					System.out.println("ok클릭");
				}else if (result == JOptionPane.CANCEL_OPTION) {
					System.out.println("CANCEL 클릭");
				}else {
					System.out.println("기타");
					}
					
				}
		});
		btnNewButton.setBounds(37, 64, 112, 23);
		contentPane.add(btnNewButton);
		
		JButton btn3 = new JButton("New button");
		btn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String result = JOptionPane.showInputDialog("메세지", "초기값");
				System.out.println("결과: " + result );
				if( result != null ) {
					System.out.println("결과 : " + result );
				}else {
					System.out.println("입력취소");
				}
			}
		});
		btn3.setBounds(37, 104, 112, 23);
		contentPane.add(btn3);
	}
}
