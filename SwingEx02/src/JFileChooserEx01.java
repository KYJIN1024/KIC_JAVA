import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class JFileChooserEx01 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFileChooserEx01 frame = new JFileChooserEx01();
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
	public JFileChooserEx01() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn = new JButton("New button");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				//JFileChooser fileChooser = new JFileChooser();
				JFileChooser fileChooser = new JFileChooser("c:\\");
				//fileChooser.showOpenDialog(JFileChooserEx01.this);
				int result = fileChooser.showOpenDialog(JFileChooserEx01.this);
				if( result == JFileChooser.APPROVE_OPTION) {
					System.out.println("확인");
					
					File file = fileChooser.getSelectedFile();
					System.out.println(file.getName());
					System.out.println(file.getAbsolutePath());
					
				}else if ( result == JFileChooser.CANCEL_OPTION) {
					System.out.println("취소");
				}
				
				
			}

			private Object getAbsolutePath() {
				// TODO Auto-generated method stub
				return null;
			}
		});
		btn.setBounds(25, 26, 106, 43);
		contentPane.add(btn);
	}

}
