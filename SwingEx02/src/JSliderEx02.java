// RGB 색상구현

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSlider;
import java.awt.Color;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class JSliderEx02 extends JFrame {

	private JPanel contentPane;
	private JSlider slider1;
	private JSlider slider2;
	private JSlider slider3;
	private JPanel panel;
	private JLabel lbl;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JSliderEx02 frame = new JSliderEx02();
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
	public JSliderEx02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 644, 499);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		slider1 = new JSlider();
		slider1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				if(panel!=null) {
					panel.setBackground(new Color(slider1.getValue(), slider2.getValue(), slider3.getValue()));
					lbl.setText("Color ("+slider1.getValue()+", "+slider2.getValue()+", "+slider3.getValue()+")");
				}
			}
		});
		slider1.setValue(0);
		slider1.setPaintLabels(true);
		slider1.setPaintTicks(true);
		slider1.setMajorTickSpacing(20);
		slider1.setMaximum(255);
		slider1.setBounds(34, 26, 580, 62);
		contentPane.add(slider1);
		
		slider2 = new JSlider();
		slider2.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(panel!=null) {
					panel.setBackground(new Color(slider1.getValue(), slider2.getValue(), slider3.getValue()));
					lbl.setText("Color ("+slider1.getValue()+", "+slider2.getValue()+", "+slider3.getValue()+")");
				}
			}
		});
		slider2.setValue(0);
		slider2.setMaximum(255);
		slider2.setPaintLabels(true);
		slider2.setPaintTicks(true);
		slider2.setMajorTickSpacing(20);
		slider2.setBounds(34, 113, 580, 62);
		contentPane.add(slider2);
		
		slider3 = new JSlider();
		slider3.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(panel!=null) {
					panel.setBackground(new Color(slider1.getValue(), slider2.getValue(), slider3.getValue()));
					lbl.setText("Color ("+slider1.getValue()+", "+slider2.getValue()+", "+slider3.getValue()+")");
				}
			}
		});
		slider3.setValue(0);
		slider3.setPaintTicks(true);
		slider3.setPaintLabels(true);
		slider3.setMaximum(255);
		slider3.setMajorTickSpacing(20);
		slider3.setBounds(34, 190, 580, 62);
		contentPane.add(slider3);
		
		panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(28, 287, 577, 124);
		contentPane.add(panel);
		
		lbl = new JLabel("Color (0, 0, 0)");
		lbl.setBounds(34, 262, 131, 21);
		contentPane.add(lbl);
	}
}