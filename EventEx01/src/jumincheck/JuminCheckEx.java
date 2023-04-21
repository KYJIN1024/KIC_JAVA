package jumincheck;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.border.BevelBorder;

public class JuminCheckEx extends JFrame {

	private JPanel contentPane;
	private boolean isFirstLabel = true;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JuminCheckEx frame = new JuminCheckEx();
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
	public JuminCheckEx() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(25, 115, 399, 321);
		contentPane.add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		
		
		
		
		JButton btn1 = new JButton("7");
		btn1.setEnabled(false);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btn1.setSize(new Dimension(123, 100));
		btn1.setPreferredSize(new Dimension(120, 70));
		btn1.setMaximumSize(new Dimension(108, 23));
		btn1.setMinimumSize(new Dimension(109, 30));
		btn1.setFont(new Font("굴림", Font.PLAIN, 12));
		panel.add(btn1);
		
		JButton btn2 = new JButton("8");
		btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(label.getText() + "8");
            }
        });
		btn2.setPreferredSize(new Dimension(120, 70));
		panel.add(btn2);
		
		
		JButton btn3 = new JButton("9");
		btn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btn3.setPreferredSize(new Dimension(120, 70));
		panel.add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btn4.setPreferredSize(new Dimension(120, 70));
		panel.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btn5.setPreferredSize(new Dimension(120, 70));
		panel.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btn6.setPreferredSize(new Dimension(120, 70));
		panel.add(btn6);
		
		JButton btn7 = new JButton("1");
		btn7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btn7.setPreferredSize(new Dimension(120, 70));
		panel.add(btn7);
		
		JButton btn8 = new JButton("2");
		btn8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btn8.setPreferredSize(new Dimension(120, 70));
		panel.add(btn8);
		
		JButton btn9 = new JButton("3");
		btn9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btn9.setPreferredSize(new Dimension(120, 70));
		panel.add(btn9);
		
		JButton btn10 = new JButton("0");
		btn10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btn10.setPreferredSize(new Dimension(120, 70));
		panel.add(btn10);
		
		JButton btn11 = new JButton("DEL");
		btn11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btn11.setPreferredSize(new Dimension(120, 70));
		panel.add(btn11);
		
		JButton btn12 = new JButton("검사");
		btn12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btn12.setPreferredSize(new Dimension(120, 70));
		panel.add(btn12);
		
		JLabel lblNewLabel = new JLabel("결과 : ");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel.setBounds(31, 465, 393, 38);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("~");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(192, 35, 50, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lbl1 = new JLabel();
		lbl1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lbl1.setBackground(Color.WHITE);
		lbl1.setBounds(25, 27, 155, 34);
		contentPane.add(lbl1);
		
		JLabel lbl2 = new JLabel();
		lbl2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lbl2.setBackground(Color.WHITE);
		lbl2.setBounds(227, 27, 155, 34);
		contentPane.add(lbl2);
	}
}
