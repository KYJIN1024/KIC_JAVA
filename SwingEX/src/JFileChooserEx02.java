import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JFileChooserEx02 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFileChooserEx02 frame = new JFileChooserEx02();
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
	public JFileChooserEx02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn = new JButton("이미지보이기");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			lbl.setIcon(new ImageIcon("D:\\JAVA_LAB\\KIC_JAVASTUDY_ecilpse\\마리아db설치1.png"));
			}
		});
		btn.setBounds(12, 10, 122, 40);
		contentPane.add(btn);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(22, 60, 658, 438);
		contentPane.add(scrollPane);
		
		JLabel lbl = new JLabel("New label");
		lbl.setIcon(new ImageIcon("D:\\JAVA_LAB\\KIC_JAVASTUDY_ecilpse\\마리아db설치1.png"));
		scrollPane.setViewportView(lbl);
	}

}





