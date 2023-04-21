import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import java.awt.Font;
import javax.swing.SpinnerListModel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.SpinnerNumberModel;

public class JSpinnerEx01 extends JFrame {

	private JPanel contentPane;
	private JSpinner spinner;
	private JSpinner spinner_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JSpinnerEx01 frame = new JSpinnerEx01();
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
	public JSpinnerEx01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 671, 374);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		spinner = new JSpinner();
		spinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				String value = (String)spinner.getValue();
				System.out.println(value);
			}
		});

		// 3.
		spinner.setModel(new UserSpinnerListModel());
		
		spinner.setFont(new Font("굴림", Font.PLAIN, 19));
		spinner.setBounds(17, 15, 406, 39);
		contentPane.add(spinner);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String value = (String)spinner.getValue();
				System.out.println(value);
			}
		});
		btnNewButton.setBounds(497, 20, 129, 29);
		contentPane.add(btnNewButton);
		
		spinner_1 = new JSpinner();
		spinner_1.setFont(new Font("굴림", Font.PLAIN, 19));
		spinner_1.setModel(new SpinnerNumberModel(10, 0, 20, 4));
		spinner_1.setBounds(17, 79, 406, 39);
		contentPane.add(spinner_1);
	}
}

class UserSpinnerListModel extends SpinnerListModel {
    public UserSpinnerListModel() {
        super(new String[]{"사과", "딸기", "수박", "참외"});
    }
}