package login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JPasswordField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import main.MainUI;

public class LoginMain extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    private JButton btnLogin;
    private JPasswordField passwordField;
    private JLabel lblUserId;
    private JLabel lblPassword;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    LoginMain frame = new LoginMain();
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
    public LoginMain() {
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 600);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        lblUserId = new JLabel("아이디 입력");
        lblUserId.setForeground(Color.LIGHT_GRAY);
        lblUserId.setBounds(221, 224, 92, 22);
        contentPane.add(lblUserId);
        
        lblPassword = new JLabel("비밀번호 입력");
        lblPassword.setForeground(Color.LIGHT_GRAY);
        lblPassword.setBounds(221, 301, 92, 22);
        contentPane.add(lblPassword);
        
        JLabel lblNewLabel = new JLabel("KIC HOTEL ADMIN CENTER");
        lblNewLabel.setFont(new Font("Bahnschrift", Font.BOLD, 20));
        lblNewLabel.setBounds(28, 21, 313, 44);
        contentPane.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("KIC호텔 관리자\r\n로그인");
        lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 30));
        lblNewLabel_1.setBounds(248, 96, 325, 97);
        contentPane.add(lblNewLabel_1);
        
        textField = new JTextField();
        textField.setForeground(Color.BLACK);
        textField.setBounds(200, 208, 403, 54);
        contentPane.add(textField);
        textField.setColumns(10);
        
        //로그인버튼
        btnLogin = new JButton("로그인");
        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = textField.getText();
                char[] passwordChars = passwordField.getPassword();
                String password = new String(passwordChars);

                // 로그인 확인 코드 
                UserDAO userDAO = new UserDAO();
                try {
                    boolean loggedIn = userDAO.login(username, password);
                    if (loggedIn) {
                        JOptionPane.showMessageDialog(null, "로그인 성공! ");
                        
                        // 로그인 성공 시 MainUI로 이동
                        MainUI mainUI = new MainUI();
                        mainUI.setVisible(true);
                        // 로그인 창 종료
                        dispose();
                       
                    } else {
                        JOptionPane.showMessageDialog(null, "로그인 실패! 아이디 또는 비밀번호를 확인해 주세요.");
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "오류가 발생했습니다: " + ex.getMessage());
                }
            }
        });
        btnLogin.setBounds(200, 364, 403, 54);
        contentPane.add(btnLogin);
        
        //패스워드
        passwordField = new JPasswordField();
        passwordField.setHorizontalAlignment(SwingConstants.LEFT); // 왼쪽정렬
        passwordField.setName("비밀번호");
        passwordField.setBounds(200, 286, 403, 54);
        contentPane.add(passwordField);
        
        JPanel panel = new JPanel();
        panel.setBackground(SystemColor.inactiveCaption);
        panel.setBounds(139, 96, 523, 395);
        contentPane.add(panel);
        
    }
}