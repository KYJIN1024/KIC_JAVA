package main;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.util.Arrays;
import java.util.Vector;

public class CustomerPanel extends JPanel {
	
	 private JTable table;
	 private JScrollPane scrollPane;
	 

	public CustomerPanel() {
		setLayout(null);
		
        JLabel lbl1 = new JLabel("1. Customer Management System");
        lbl1.setFont(new Font("Yu Gothic", Font.BOLD, 13));
        lbl1.setBounds(28, 77, 239, 37);
        add(lbl1);
        
//테이블
        DefaultTableModel model = new DefaultTableModel(
        	    new Object[][] { },
        	    new String[] {"선택", "이름", "전화번호", "이메일", "주소" }
        	) {
        	    @Override
        	    public boolean isCellEditable(int row, int column) {  //
        	        return true;
        	    }
        	    @Override
        	    public Class<?> getColumnClass(int columnIndex) {
        	        if (columnIndex == 0) {
        	            return Boolean.class;    //첫번째 컬럼에서 체크박스사용
        	        }
        	        return super.getColumnClass(columnIndex);
        	    }
        	};
        	
        	  table = new JTable(model);
              table.getColumnModel().getColumn(0).setPreferredWidth(40);
              table.getColumnModel().getColumn(1).setPreferredWidth(70);
              table.getColumnModel().getColumn(2).setPreferredWidth(100);
              table.getColumnModel().getColumn(3).setPreferredWidth(150);
              table.getColumnModel().getColumn(4).setPreferredWidth(300);	
              
              scrollPane = new JScrollPane(table);
              scrollPane.setBounds(28, 145, 475, 129);
              add(scrollPane);
        

  // 불러오기
              JButton btn11 = new JButton("불러오기");
              btn11.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
                      loadCustomerData();
                  }
              });
              btn11.setBounds(265, 81, 93, 23);
              add(btn11);
              
              
              

 //입력
              JButton btn13 = new JButton("신규입력");
              btn13.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
                      
                      CustomerDetailUI customerDetails = new CustomerDetailUI(); // 고객 상세 정보 창 출력
                      customerDetails.setVisible(true);
                  }
              });
              btn13.setBounds(368, 81, 93, 23);
              add(btn13);
              
//삭제  
              JButton btn14 = new JButton("삭제");
              btn14.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
                      for (int i = table.getRowCount() - 1; i >= 0; i--) {
                          Boolean isChecked = (Boolean) table.getValueAt(i, 0);
                          if (isChecked) {
                          	try {
      							Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/customer_db", "project", "1234");
      							// 쿼리 실행
      							PreparedStatement deleteStmt = conn.prepareStatement("DELETE FROM customers WHERE phone=?");// customers 테이블에서 phone컬럼이 일치하는 행을 삭제
      							String phone = (String) table.getValueAt(i, 2); 
      							deleteStmt.setString(1,phone); 
      							deleteStmt.executeUpdate();
      							deleteStmt.close();
      							conn.close();
      							model.removeRow(i);
      						} catch (SQLException e1) {
      							// TODO Auto-generated catch block
      							e1.printStackTrace();
      						}
                          }
                      }
                  }
              });
              btn14.setBounds(542, 208, 93, 23);
              add(btn14);
        
// 저장
              JButton btn15 = new JButton("저장");
              btn15.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
                      saveCustomerData();
                      JOptionPane.showMessageDialog(null, "저장 성공! ");
                  }
              });
              btn15.setBounds(542, 241, 93, 23);
              add(btn15);
				}
//불러오기 기능				
        	private void loadCustomerData() {
            try {
                // 데이터베이스에 연결
                Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/customer_db", "project", "1234");
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT name, phone, email, address FROM customers"); //curtomerdb에서 전체값 불러오기

               
                DefaultTableModel model = (DefaultTableModel) table.getModel();  // 기존 테이블 데이터 삭제
                int rowCount = model.getRowCount(); //테이블모델 행의 수를 카운트함
                for (int i = rowCount - 1; i >= 1; i--) {  //테이블의 마지막행부터 첫번째행까지 역순으로 순회하는 반복문, 첫번째행은 제외
                    model.removeRow(i);
                }

               
                while (rs.next()) {   // 새로운 데이터 삽입
                    String name = rs.getString("name");
                    String phone = rs.getString("phone");
                    String email = rs.getString("email");
                    String address = rs.getString("address");
                    model.addRow(new Object[]{false, name, phone, email, address});
                }

            
                rs.close();
                stmt.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "데이터베이스에 문제가 발생했습니다.", "에러", JOptionPane.ERROR_MESSAGE);
            }
        }

//저장 기능
        	private void saveCustomerData() {
            try {
                
                Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/customer_db", "project", "1234");

                PreparedStatement updateStmt = conn.prepareStatement("UPDATE customers SET name=?, phone=?, email=?, address=? WHERE phone=?");// ? 은 값을 저장할 위치 
                PreparedStatement deleteStmt = conn.prepareStatement("DELETE FROM customers WHERE phone=?");   // phone을 기준으로 데이터 삭제

                DefaultTableModel model = (DefaultTableModel) table.getModel();
                int rowCount = model.getRowCount();
                for (int i = 0; i < rowCount; i++) {
                    Boolean isChecked = (Boolean) table.getValueAt(i, 0);
                    if (isChecked) {
                        String name = (String) table.getValueAt(i, 1);
                        String phone = (String) table.getValueAt(i, 2);
                        String email = (String) table.getValueAt(i, 3);
                        String address = (String) table.getValueAt(i, 4);

                        updateStmt.setString(1, name);
                        updateStmt.setString(2, phone);
                        updateStmt.setString(3, email);
                        updateStmt.setString(4, address);
                        updateStmt.setString(5, phone);
                        updateStmt.executeUpdate();
                    }
                }

           
                updateStmt.close();
                deleteStmt.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "데이터베이스에 문제가 발생했습니다.", "에러", JOptionPane.ERROR_MESSAGE);
            }
        }
     
        }
        	
        	
        	
      

      
