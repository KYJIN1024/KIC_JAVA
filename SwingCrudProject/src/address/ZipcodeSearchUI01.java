package address;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.AbstractListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ZipcodeSearchUI01 extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    private JList list;
    private JTextField textField1;
    private JTextField textField2;
    private JButton btnNewButton;
    private JButton btnNewButton_1;

    public interface ZipcodeSelectedListener {
        void onZipcodeSelected(String zipcode, String address);
    }

    private ZipcodeSelectedListener zipcodeSelectedListener;
	private ZipcodeSelectedListener listener;

    public ZipcodeSearchUI01() {
        this(null);
    }

    public ZipcodeSearchUI01(ZipcodeSelectedListener listener) {
        this.zipcodeSelectedListener = listener;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 650, 540);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), 
                "\uC6B0\uD3B8\uBC88\uD638\uAC80\uC0C9\uAE30", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
        panel.setBounds(6, 21, 616, 73);
        contentPane.add(panel);
        panel.setLayout(null);

        JLabel lbl = new JLabel("동이름");
        lbl.setBounds(12, 41, 57, 15);
        panel.add(lbl);

        textField = new JTextField();
        textField.setBounds(67, 38, 428, 21);
        panel.add(textField);
        textField.setColumns(10);

        JButton btn = new JButton("검색");
        btn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // 데이터베이스 
                // model
                // List
                String strDong = textField.getText().trim();
                if(strDong.length() < 2 ) {
                    JOptionPane.showMessageDialog(ZipcodeSearchUI01.this ,"동이름을 2자이상 입력", "입력 경고",JOptionPane.WARNING_MESSAGE );
                }else {
                    list.setModel( new ZipcodeListModel(strDong) );
                }

            }
        });
        btn.setBounds(507, 37, 97, 23);
        panel.add(btn);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setBounds(10, 111, 618, 292);
        contentPane.add(scrollPane);

        list = new JList();
        list.setModel(new AbstractListModel() {
            String[] values = new String[] {"[우편번호] 시도 구군 동 리 번지"};
            public int getSize() {
                return values.length;
            }
            public Object getElementAt(int index) {
                return values[index];
            }
        });
        list.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                textField1.setText( (String)list.getSelectedValue() );
            }
            });
        
        scrollPane.setViewportView(list);

        textField1 = new JTextField();
        textField1.setEditable(false);
        textField1.setText("기본주소");
        textField1.setBounds(6, 413, 616, 21);
        contentPane.add(textField1);
        textField1.setColumns(10);

        textField2 = new JTextField();
        textField2.setText("상세주소");
        textField2.setBounds(6, 444, 616, 21);
        contentPane.add(textField2);
        textField2.setColumns(10);

        btnNewButton = new JButton("입력");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (list.getSelectedValue() != null) {
                    String selectedValue = (String) list.getSelectedValue();
                    String[] parts = selectedValue.split(" ");
                    String zipcode = parts[0];
                    String address = parts[1] + " " + parts[2] + " " + parts[3] + " " + parts[4] + " " + parts[5];
                    if (zipcodeSelectedListener != null) {
                        zipcodeSelectedListener.onZipcodeSelected(zipcode, address);
                    }
                }
            }
        });
        btnNewButton.setBounds(462, 472, 83, 23);
        contentPane.add(btnNewButton);

        btnNewButton_1 = new JButton("취소");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        btnNewButton_1.setBounds(555, 472, 83, 23);
        contentPane.add(btnNewButton_1);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ZipcodeSearchUI01 frame = new ZipcodeSearchUI01();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    }
