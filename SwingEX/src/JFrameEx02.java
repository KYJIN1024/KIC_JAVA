import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;

public class JFrameEx02 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameEx02 frame = new JFrameEx02();
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
	public JFrameEx02() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl1 = new JLabel("라벨1");
		lbl1.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl1.setBounds(101, 10, 101, 15);
		contentPane.add(lbl1);
		
		String text = "<html><body>Hello Label<br/><font color='red'>Hello Label</font></body></html>";
		JLabel lbl2 = new JLabel(text);
		lbl2.setFont(new Font("D2Coding", Font.BOLD, 16));
		
		// rgb 혼합 (0~250)
		//lbl2.setForeground(new Color(255, 140, 0));
		//lbl2.setForeground(Color.green);
		
		
		lbl2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2.setVerticalAlignment(SwingConstants.TOP);
		lbl2.setBounds(12, 35, 288, 91);
		contentPane.add(lbl2);
		
		System.out.println( lbl1.getText() );
		System.out.println( lbl2.getText() );
		
		lbl1.setText( "새 라벨1"  );
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Java\\java_workspace\\KIC_JAVASTUDY_ecilpse\\SwingEx02\\windowbuilder.png"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(101, 75, 210, 204);
		contentPane.add(lblNewLabel);
		//lbl2.setText( "새 라벨 2  새 라벨 3"  );
		
		
		
	}
}
