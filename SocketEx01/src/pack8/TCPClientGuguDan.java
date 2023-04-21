package pack8;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class TCPClientGuguDan extends JFrame {

	private JPanel contentPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TCPClientGuguDan frame = new TCPClientGuguDan();
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
	public TCPClientGuguDan() {
	
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "\uAD6C\uAD6C\uB2E8", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(47, 63, 712, 122);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("시작단");
		lblNewLabel.setBounds(17, 18, 77, 35);
		panel_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 18));
		
		JLabel lblNewLabel_1 = new JLabel("끝단");
		lblNewLabel_1.setBounds(17, 79, 77, 35);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 18));
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(106, 22, 347, 30);
		panel_1.add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(106, 83, 347, 30);
		panel_1.add(spinner_1);
		
		JButton btnNewButton = new JButton("구구단 출력");
		btnNewButton.setBounds(490, 17, 210, 91);
		panel_1.add(btnNewButton);
		
		 textArea = new JTextArea();
	     textArea.setEditable(false);
	     JScrollPane scrollPane = new JScrollPane(textArea);
	     scrollPane.setBounds(47, 227, 712, 315);
	     contentPane.add(scrollPane);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int start = (int) spinner.getValue();
				int end = (int) spinner_1.getValue();
				displayGuguDan(start, end);
			}
		 });
	}
	// 구구단 함수
			private void displayGuguDan(int start, int end) {
				StringBuilder sb = new StringBuilder();
				for(int i = start; i <= end; i++) {
					for(int j = 1;  j<= 9; j++) {
						sb.append(i).append("*").append(j).append("=").append( i * j).append("\n");
					}
					sb.append("\n");
					
				} 
			textArea.setText(sb.toString());

		
	}
}
