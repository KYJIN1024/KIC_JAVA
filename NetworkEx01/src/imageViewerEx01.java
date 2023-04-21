//gpt코드 참고해서 연습하기
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.awt.event.ActionEvent;

public class imageViewerEx01 extends JFrame {

	private JPanel contentPane;
	private JTextField textField1;
	private JTextField textField2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		HttpURLConnection conn = 
				(HttpURLConnection)new URL(textField1.setText).openConnection();
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					imageViewerEx01 frame = new imageViewerEx01();
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
	public imageViewerEx01() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField1 = new JTextField();
		textField1.setText("https://");
		textField1.setBounds(31, 48, 402, 33);
		contentPane.add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setText("D:\\JAVA_LAB");
		textField2.setColumns(10);
		textField2.setBounds(31, 91, 402, 33);
		contentPane.add(textField2);
		
		JButton btn = new JButton("Image");
		btn.setBounds(462, 48, 99, 76);
		contentPane.add(btn);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(31, 144, 527, 320);
		contentPane.add(scrollPane);
		
		JLabel lbl = new JLabel("");
		scrollPane.setViewportView(lbl);
		
		
			
	}
}
	