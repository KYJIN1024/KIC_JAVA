import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JDialogMainEx02 extends JFrame {

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
					JDialogMainEx02 frame = new JDialogMainEx02();
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
	public JDialogMainEx02() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField1 = new JTextField();
		textField1.setBounds(26, 26, 258, 30);
		contentPane.add(textField1);
		textField1.setColumns(10);
		
		JButton btn = new JButton("New button");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JDialogEx02 dialog = new JDialogEx02(textField1.getText());
				System.out.println( "1" );
				
				dialog.setModal(true);
				System.out.println( "2" );
				
				dialog.setVisible(true);
				System.out.println( "3" );
				
				String data = dialog.getData();
				System.out.println("결과:"+ data);
				textField2.setText(data);
				
				// JFrame => JDialog
				// JDialog => JFrame
				
				
			}
		});
		btn.setBounds(294, 29, 93, 23);
		contentPane.add(btn);
		
		textField2 = new JTextField();
		textField2.setBounds(26, 66, 258, 30);
		contentPane.add(textField2);
		textField2.setColumns(10);
	}
}
