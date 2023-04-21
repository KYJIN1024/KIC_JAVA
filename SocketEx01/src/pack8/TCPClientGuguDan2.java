package pack8;

import java.awt.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class TCPClientGuguDan extends JFrame {
    private JPanel contentPane;
    private JTextArea textArea;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    TCPClientGuguDan frame = new TCPClientGuguDan();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public TCPClientGuguDan() {
        ...
        // Add a JTextArea to display the result
        textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(47, 227, 712, 315);
        contentPane.add(scrollPane);
        
        // Modify the ActionListener for the "구i*j구단 출력" button
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int start = (int) spinner.getValue();
                int end = (int) spinner_1.getValue();
                displayGuguDan(start, end);
            }
        });
        ...
    }

    private void displayGuguDan(int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) {
            for (int j = 1; j <= 9; j++) {
                sb.append(i).append(" * ").append(j).append(" = ").append(i * j).append("\n");
            }
            sb.append("\n");
        }
        textArea.setText(sb.toString());
    }
}