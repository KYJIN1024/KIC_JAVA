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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import address.ZipcodeSearchUI01;
import address.ZipcodeSearchUI01.ZipcodeSelectedListener;


public class CustomerDetailUI extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    
    private void insertCustomerData() {
    	
    	try {
    		Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/customer_db", "project", "1234");
			PreparedStatement insertStmt = conn.prepareStatement("INSERT INTO customers (name, phone, email, address) VALUES (?, ?, ?, ?)");
			
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
    public CustomerDetailUI() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("이름");
        lblNewLabel.setBounds(28, 59, 57, 15);
        contentPane.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("전화번호");
        lblNewLabel_1.setBounds(28, 95, 57, 15);
        contentPane.add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("이메일");
        lblNewLabel_2.setBounds(28, 131, 57, 15);
        contentPane.add(lblNewLabel_2);

        JLabel lblNewLabel_3 = new JLabel("주소");
        lblNewLabel_3.setBounds(28, 167, 57, 15);
        contentPane.add(lblNewLabel_3);

        textField = new JTextField();
        textField.setBounds(113, 56, 272, 23);
        contentPane.add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setBounds(113, 92, 272, 21);
        contentPane.add(textField_1);
        textField_1.setColumns(10);

        textField_2 = new JTextField();
        textField_2.setBounds(113, 128, 273, 24);
        contentPane.add(textField_2);
        textField_2.setColumns(10);

        textField_3 = new JTextField();
        textField_3.setBounds(113, 199, 272, 22);
        contentPane.add(textField_3);
        textField_3.setColumns(10);
        
        textField_4 = new JTextField();
        textField_4.setColumns(10);
   textField_4.setBounds(113, 165, 93, 22);
        contentPane.add(textField_4);

        textField_5 = new JTextField();
        textField_5.setColumns(10);
        textField_5.setBounds(210, 165, 93, 22);
        contentPane.add(textField_5);

        //저장버튼
        JButton btnNewButton = new JButton("저장");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                insertCustomerData();
                JOptionPane.showMessageDialog(null, "저장 성공!");
                dispose();
            }
        });
        btnNewButton.setBounds(28, 232, 97, 23);
        contentPane.add(btnNewButton);
        //취소버튼
        JButton btnNewButton_1 = new JButton("취소");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        btnNewButton_1.setBounds(161, 231, 97, 23);
        contentPane.add(btnNewButton_1);

        JLabel lblNewLabel_4 = new JLabel("고객정보 신규등록");
        lblNewLabel_4.setBounds(28, 10, 128, 21);
        contentPane.add(lblNewLabel_4);

        JButton btnNewButton_2 = new JButton("우편번호");
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ZipcodeSearchUI01 zipcodeSearchUI = new ZipcodeSearchUI01(new ZipcodeSelectedListener() {
                    @Override
                    public void onZipcodeSelected(String zipcode, String address) {
                        textField_4.setText(zipcode);
                        textField_5.setText(address);
                        textField_5.requestFocus();
                        dispose();
                    }
                });

                zipcodeSearchUI.setVisible(true);
            }
        });
        btnNewButton_2.setBounds(313, 163, 93, 22);
        contentPane.add(btnNewButton_2);
    }
}