package main;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.DefaultCellEditor;
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

public class ReservationPanel extends JPanel {

    private JTable table;
    private JScrollPane scrollPane;

    public ReservationPanel() {
        setLayout(null);

        JLabel lbl1 = new JLabel("2. Reservation Management System");
        lbl1.setFont(new Font("Yu Gothic", Font.BOLD, 13));
        lbl1.setBounds(28, 10, 239, 37);
        add(lbl1);

      
        DefaultTableModel model = new DefaultTableModel(
                new Object[][]{},
                new String[]{"선택", "ID", "객실번호", "체크인날짜", "체크아웃날짜"}
        ) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return true;
            }

            @Override
            public Class<?> getColumnClass(int columnIndex) {
                if (columnIndex == 0) {
                    return Boolean.class;
                }
                return super.getColumnClass(columnIndex);
            }
        };

        table = new JTable(model);
        table.getColumnModel().getColumn(0).setPreferredWidth(70);
        table.getColumnModel().getColumn(1).setPreferredWidth(70);
        table.getColumnModel().getColumn(2).setPreferredWidth(70);
        table.getColumnModel().getColumn(3).setPreferredWidth(70);
        table.getColumnModel().getColumn(4).setPreferredWidth(70);

        scrollPane = new JScrollPane(table);
        scrollPane.setBounds(28, 78, 475, 129);
        add(scrollPane);

 // : btn11을 누르면 데이터베이스에서 예약정보를 받아와서 출력
        JButton btn11 = new JButton("불러오기");
        btn11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                loadReservationData();
            }
        });
        btn11.setBounds(265, 14, 93, 23);
        add(btn11);

        

        JButton btn13 = new JButton("신규입력");
        btn13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // 고객 상세 정보 창 출력
                ReservationDetailUI ReservationDetails = new ReservationDetailUI();
                ReservationDetails.setVisible(true);
            }
        });
        btn13.setBounds(368, 14, 93, 23);
        add(btn13);

        JButton btn14 = new JButton("삭제");
        btn14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                for (int i = table.getRowCount() - 1; i >= 0; i--) {
                    Boolean isChecked = (Boolean) table.getValueAt(i, 0);
                    if (isChecked) {
                        try {
                            Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/reservations_db", "project", "1234");
                            PreparedStatement deleteStmt = conn.prepareStatement("DELETE FROM reservations WHERE id=?");
                            String id = (String) table.getValueAt(i, 1);
                            deleteStmt.setString(1, id);
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
	    btn14.setBounds(542, 141, 93, 23);
	    add(btn14);

	    JButton btn15 = new JButton("저장");
	    btn15.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            saveReservationData();
	        }
	    });
	    btn15.setBounds(542, 174, 93, 23);
	    add(btn15);
	}

		private void loadReservationData() {
		    try {
		      
		        Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/reservations_db", "project", "1234");
		        Statement stmt = conn.createStatement();
		        ResultSet rs = stmt.executeQuery("SELECT id, room_number, checkin_date, checkout_date FROM reservations");
		
		        // 기존 테이블 데이터 삭제
		        DefaultTableModel model = (DefaultTableModel) table.getModel();
		        int rowCount = model.getRowCount();
		        for (int i = rowCount - 1; i >= 0; i--) {
		            model.removeRow(i);
		        }
		
		        // 새로운 데이터 삽입
		        while (rs.next()) {
		            String id = rs.getString("id");
		            String roomNm = rs.getString("room_number");
		            String checkin_date = rs.getString("checkin_date");
		            String checkout_date = rs.getString("checkout_date");
		            model.addRow(new Object[]{false, id, roomNm, checkin_date, checkout_date});
		        }
		
		       
		        rs.close();
		        stmt.close();
		        conn.close();
		    } catch (SQLException e) {
		        e.printStackTrace();
		        JOptionPane.showMessageDialog(this, "데이터베이스에 문제가 발생했습니다.", "에러", JOptionPane.ERROR_MESSAGE);
		    }
		}
		
		private void saveReservationData() {
		    try {
		        // 데이터베이스에 연결
		        Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/reservations_db", "project", "1234");
		        PreparedStatement updateStmt = conn.prepareStatement("UPDATE reservations SET id=?, room_number=?, checkin_date=?,  checkout_date=? WHERE id=?");
		
		        DefaultTableModel model = (DefaultTableModel) table.getModel();
		        int rowCount = model.getRowCount();
		        for (int i = 0; i < rowCount; i++) {
		            String id = (String) table.getValueAt(i, 1);
		            String roomNm = (String) table.getValueAt(i, 2);
		            String checkInDate = (String) table.getValueAt(i, 3);
		            String checkOutDate = (String) table.getValueAt(i, 4);
		
		            updateStmt.setString(1, id);
		            updateStmt.setString(2, roomNm);
		            updateStmt.setString(3, checkInDate);
		            updateStmt.setString(4, checkOutDate);
		            updateStmt.setString(5, id);
		
		            updateStmt.executeUpdate();
		        }
		
		       
		        updateStmt.close();
		        conn.close();
		    } catch (SQLException e) {
		        e.printStackTrace();
		        JOptionPane.showMessageDialog(this, "데이터베이스에 문제가 발생했습니다.", "에러", JOptionPane.ERROR_MESSAGE);
		    }
		}
		}
      

      
