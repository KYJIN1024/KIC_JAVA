package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.SystemColor;

public class MainUI extends JFrame {

	private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MainUI frame = new MainUI();
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
    public MainUI() {
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 600);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        CustomerPanel customerPanel = new CustomerPanel();
        customerPanel.setBounds(0, 0, 800, 300);
        contentPane.add(customerPanel);
        
                JLabel lbl = new JLabel("KIC Hotel Management System  ");
                lbl.setBounds(29, 10, 368, 37);
                customerPanel.add(lbl);
                lbl.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
                
                JPanel panel = new JPanel();
                panel.setBackground(SystemColor.textHighlightText);
                panel.setBounds(10, 67, 638, 223);
                customerPanel.add(panel);
        
        ReservationPanel reservationPanel = new ReservationPanel();
        reservationPanel.setBounds(0, 305, 774, 234);
        contentPane.add(reservationPanel);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBackground(SystemColor.textHighlightText);
        panel_1.setBounds(10, 10, 640, 214);
        reservationPanel.add(panel_1);


        
        
    
    }
}