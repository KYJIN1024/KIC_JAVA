import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JProgressBarEx01 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JProgressBarEx01 frame = new JProgressBarEx01();
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
	public JProgressBarEx01() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setStringPainted(true);
		progressBar.setValue(30);
		progressBar.setMaximum(200);
		progressBar.setBounds(26, 32, 618, 38);
		contentPane.add(progressBar);
		
		JButton btn1 = new JButton("감소(-10)");
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println( progressBar.getValue() -10 );
				if( progressBar.getMinimum() == progressBar.getValue() ) {
					JOptionPane.showMessageDialog(JProgressBarEx01.this, "최소값에 도달");
				}else {
					progressBar.setValue(progressBar.getValue()-10 );
				}				
			}
		});
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn1.setBounds(26, 92, 97, 23);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("증가(+10)");
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println( progressBar.getValue() +10 );
				if( progressBar.getMaximum() == progressBar.getValue() ) {
					JOptionPane.showMessageDialog(JProgressBarEx01.this, "최대값에 도달");
				}else {
					progressBar.setValue(progressBar.getValue()+10 );
				}		
				
			}
		});
		btn2.setBounds(26, 133, 97, 23);
		contentPane.add(btn2);
	}
}
