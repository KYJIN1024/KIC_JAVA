package main;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.sql.DriverManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class ReservationDetailUI extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    
    private void insertReservationData( ) {
    	
    	try {
    		Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/reservations_db", "project", "1234");
			
			PreparedStatement insertStmt = conn.prepareStatement("INSERT INTO reservations (id,room_number,checkin_date,checkout_date) VALUES (?, ?, ?, ?)");
			
			insertStmt.setString(1,  textField.getText());
			insertStmt.setString(2,  textField_1.getText());
			insertStmt.setString(3,  textField_2.getText());
			insertStmt.setString(4,  textField_3.getText());
			
			insertStmt.executeUpdate();
			
			insertStmt.close();
			conn.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(this, "데이터베이스에 에러가 발생했습니다.");
		
		}
    	
    }
    
    
    /**
     * Create the frame.
     */
    public ReservationDetailUI() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("ID");
        lblNewLabel.setBounds(28, 56, 57, 15);
        contentPane.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("객실번호");
        lblNewLabel_1.setBounds(28, 92, 57, 15);
        contentPane.add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("체크인날짜");
        lblNewLabel_2.setBounds(28, 128, 78, 15);
        contentPane.add(lblNewLabel_2);

        JLabel lblNewLabel_3 = new JLabel("체크아웃날짜");
        lblNewLabel_3.setBounds(28, 164, 78, 15);
        contentPane.add(lblNewLabel_3);

        textField = new JTextField();
        textField.setBounds(124, 56, 116, 21);
        contentPane.add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setBounds(124, 92, 116, 21);
        contentPane.add(textField_1);
        textField_1.setColumns(10);

        textField_2 = new JTextField();
        textField_2.setBounds(124, 128, 116, 21);
        contentPane.add(textField_2);
        textField_2.setColumns(10);

        textField_3 = new JTextField();
        textField_3.setBounds(124, 164, 116, 21);
        contentPane.add(textField_3);
        textField_3.setColumns(10);

        JButton btnNewButton = new JButton("저장");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		insertReservationData();
        		JOptionPane.showMessageDialog(null, "저장 성공! ");
        		dispose();
        	}
        });
        btnNewButton.setBounds(28, 215, 97, 23);
        contentPane.add(btnNewButton);

        JButton btnNewButton_1 = new JButton("취소");
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		dispose();
        	}
        });
        btnNewButton_1.setBounds(160, 215, 97, 23);
        contentPane.add(btnNewButton_1);
        
        JLabel lblNewLabel_4 = new JLabel("예약 정보 신규등록");
        lblNewLabel_4.setBounds(20, 10, 132, 21);
        contentPane.add(lblNewLabel_4);
    }
}