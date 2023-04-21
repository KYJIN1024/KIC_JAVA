import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;

public class EventEx01 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EventEx01 frame = new EventEx01();
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
	public EventEx01() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn1 = new JButton("New button");
		// 1. 이벤트를 연결하는 메서드
		// 2. 이벤트가 발생하면 처리될 이벤트 클래스
		//			interface/ adapter class
		// 3. 이벤트 핸들러(이벤트 처리용 메서드)
		
		
		// 이벤트 핸들러
		btn1.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("mouseClicked");
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("mousePressed");
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("mouseReleased");
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("mouseEntered");
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("mouseExited");
			}
			
			
		});
		
		
		btn1.setBounds(47, 43, 91, 23);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("New button");
		btn2.setBounds(47, 83, 91, 23);
		btn2.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("mouseClicked");
			}
		
		});
		contentPane.add(btn2);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("mouseClicked");
			}
		});
		btnNewButton.setBounds(47, 125, 91, 23);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
		/*	
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				System.out.println(textField.getText());
				
			}
*/
			// windowbuilder
			private char[] textField() {
				// TODO Auto-generated method stub
				return null;
			}
			public void actionPerformed(ActionEvent e) {
				System.out.println(textField.getText());
				
			}
		});
		
		
		textField.setBounds(47, 168, 189, 33);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btn5 = new JButton("New button");
		btn5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println( textField.getText() );
				System.out.println( e.getX() );
				System.out.println( e.getY() );
				System.out.println(e.getClickCount());
				
				System.out.println(e.getSource());
				JButton btn = (JButton)e.getSource();
				btn.setText("클릭됨");
			}
		});
		btn5.setBounds(265, 178, 235, 211);
		contentPane.add(btn5);
	}
}
