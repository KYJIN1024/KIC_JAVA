import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class EventEx02 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EventEx02 frame = new EventEx02();
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
	public EventEx02() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn1 = new JButton("버튼1");
		btn1.setName("button1");
		btn1.addMouseListener(new UserMouseEvent2());
		btn1.setBounds(51, 40, 91, 23);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("버튼2");
		btn2.setName("button2");
		btn2.addMouseListener(new UserMouseEvent2());
		btn2.setBounds(51, 73, 91, 23);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("버튼3");
		btn3.setName("button3");
		btn3.addMouseListener(new UserMouseEvent2());
		btn3.setBounds(51, 106, 91, 23);
		contentPane.add(btn3);
	}
	
	//내부클래스 => 외부 클래스 (MouseAdaptor)
	class UserMouseEvent1 implements MouseListener {

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
		
	}
	
	class UserMouseEvent2 extends MouseAdapter {

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			System.out.println("mouseClicked");
			
			System.out.println(( (JButton)e.getSource()).getText());
			System.out.println(( (JButton)e.getSource()).getName());
			
			String name = ((JButton)e.getSource()).getName();
			switch( name ) {
			case "button1" :
				System.out.println("btn1 mouseClicked");
				break;
			case "button2" :
				System.out.println("btn2 mouseClicked");
				break;
			case "button3" :
				System.out.println("btn3 mouseClicked");
				break;
			default:
				System.out.println("에러");
			}
			
		}
		
		
	}
	
}







