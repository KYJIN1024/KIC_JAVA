import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;

public class JTextAreaEx02 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JTextAreaEx02 frame = new JTextAreaEx02();
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
	public JTextAreaEx02() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "\uAD6C\uAD6C\uB2E8", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(16, 25, 383, 88);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lbl1 = new JLabel("시작단");
		lbl1.setBounds(6, 17, 127, 31);
		panel.add(lbl1);
		
		textField = new JTextField();
		textField.setBounds(54, 22, 171, 21);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lbl2 = new JLabel("끝단");
		lbl2.setBounds(6, 58, 45, 21);
		panel.add(lbl2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(54, 58, 171, 21);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("구구단출력");
		btnNewButton.setBounds(250, 22, 127, 60);
		panel.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 125, 377, 215);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int start = Integer.parseInt(textField.getText());
				int end = Integer.parseInt(textField_1.getText());
				textArea.setText(""); 

				for (int i = start; i <= end; i++) {
					for (int j = 1; j <= 9; j++) {
						textArea.append(i + " * " + j + " = " + (i * j) + "\n");
		}
						textArea.append("\n"); 
			}
				}
				});
				}
				}
		
		
		
		
		
	

