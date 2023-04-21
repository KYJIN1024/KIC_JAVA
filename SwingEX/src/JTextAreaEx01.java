import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JButton;

public class JTextAreaEx01 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JTextAreaEx01 frame = new JTextAreaEx01();
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
	public JTextAreaEx01() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane textarea = new JScrollPane();
		textarea.setBounds(32, 28, 133, 136);
		contentPane.add(textarea);
		
		JTextArea textArea = new JTextArea();
		textarea.setViewportView(textArea);
		textArea.setEditable(false);
		textArea.setText("가나다\r\n마바사\r\n기타");
		
		JScrollPane scrollPane = new JScrollPane();
		textarea.setRowHeaderView(scrollPane);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(185, 30, 93, 23);
		contentPane.add(btnNewButton);
	}
}
