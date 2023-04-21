import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class LayoutEx01 extends JFrame {

	private JPanel contentPane;
	private JPanel panel2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LayoutEx01 frame = new LayoutEx01();
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
	public LayoutEx01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel1 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel1.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel1, BorderLayout.NORTH);
		
		JButton btn1 = new JButton("Panel1");
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// name_1337936517721600
				((CardLayout)panel2.getLayout()).show(panel2, "name_1337936517721600");
			}
		});
		panel1.add(btn1);
		
		JButton btn2 = new JButton("Panel2");
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// name_1337945949465800
				((CardLayout)panel2.getLayout()).show(panel2, "name_1337945949465800");
			}
		});
		panel1.add(btn2);
		
		JButton btn3 = new JButton("Panel3");
		btn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// name_1337966812500200
				((CardLayout)panel2.getLayout()).show(panel2, "name_1337966812500200");
			}
		});
		panel1.add(btn3);
		
		panel2 = new JPanel();
		contentPane.add(panel2, BorderLayout.CENTER);
		panel2.setLayout(new CardLayout(0, 0));
		
		JPanel panel21 = new JPanel();
		panel21.setBackground(Color.BLUE);
		panel2.add(panel21, "name_1337936517721600");
		panel21.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(12, 10, 97, 23);
		panel21.add(btnNewButton);
		
		JPanel panel22 = new JPanel();
		panel22.setBackground(Color.GREEN);
		panel2.add(panel22, "name_1337945949465800");
		panel22.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(49, 129, 97, 23);
		panel22.add(btnNewButton_1);
		
		JPanel panel23 = new JPanel();
		panel23.setBackground(Color.RED);
		panel2.add(panel23, "name_1337966812500200");
		panel23.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(157, 23, 97, 23);
		panel23.add(btnNewButton_2);
	}
}
