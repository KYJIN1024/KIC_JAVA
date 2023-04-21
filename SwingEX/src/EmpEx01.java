import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;

public class EmpEx01 extends JFrame {

    private JPanel contentPane;
    private JTextField textField;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    EmpEx01 frame = new EmpEx01();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public EmpEx01() {
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 600);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "\uBD80\uC11C\uC774\uB984 \uAC80\uC0C9", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
        panel.setBounds(14, 14, 447, 51);
        contentPane.add(panel);
        panel.setLayout(null);

        textField = new JTextField();
        textField.setBounds(6, 18, 301, 21);
        panel.add(textField);
        textField.setColumns(10);

        JButton btn = new JButton("부서이름 검색");
        btn.setBounds(318, 17, 115, 22);
        panel.add(btn);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(20, 75, 440, 234);
        contentPane.add(textArea);

        // Add ActionListener to the search button
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the department name from the textField
                String departmentName = textField.getText();

                // Search and display the results
                String results = searchDepartment(departmentName);
                textArea.setText(results);
            }
        });
    }
    private String searchDepartment(String departmentName) {
        // JDBC driver name and database URL
        String JDBC_DRIVER = "org.mariadb.jdbc.Driver";
        String DB_URL = "jdbc:mariadb://localhost:3306/root";

        // Database credentials
        String USER = "root";
        String PASS = "123456";

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        StringBuilder results = new StringBuilder();

        try {
            // Register JDBC driver
            Class.forName(JDBC_DRIVER);

            // Open a connection
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // SQL query
            String sql = "SELECT * FROM your_table_name WHERE department_name = ?";

            // Create a prepared statement
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, departmentName);

            // Execute the query and get the result set
            rs = pstmt.executeQuery();

            // Process the result set
            while (rs.next()) {
                results.append("부서번호: ").append(rs.getInt("department_id")).append("\n");
                results.append("부서위치: ").append(rs.getString("department_location")).append("\n");
                results.append("사원번호: ").append(rs.getInt("employee_id")).append("\n");
                results.append("사원이름: ").append(rs.getString("employee_name")).append("\n");
                results.append("직책: ").append(rs.getString("position")).append("\n");
                results.append("급여: ").append(rs.getInt("salary")).append("\n\n");
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            // Close all resources
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }

        return results.toString();
    }
}
    