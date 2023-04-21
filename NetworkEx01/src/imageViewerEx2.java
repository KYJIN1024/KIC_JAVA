//gpt코드 

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.net.HttpURLConnection;
import java.net.URL;
import java.awt.event.ActionEvent;

public class imageViewerEx2 extends JFrame {

    private JPanel contentPane;
    private JTextField textField1;
    private JTextField textField2;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    imageViewerEx2 frame = new imageViewerEx2();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public imageViewerEx2() {
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 600);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        textField1 = new JTextField();
        textField1.setText("https://");
        textField1.setBounds(31, 48, 402, 33);
        contentPane.add(textField1);
        textField1.setColumns(10);

        textField2 = new JTextField();
        textField2.setText("D:\\JAVA_LAB");
        textField2.setColumns(10);
        textField2.setBounds(31, 91, 402, 33);
        contentPane.add(textField2);

        JButton btn = new JButton("Image");
        btn.setBounds(462, 48, 99, 76);
        contentPane.add(btn);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(31, 144, 527, 320);
        contentPane.add(scrollPane);

        JLabel lbl = new JLabel("");
        scrollPane.setViewportView(lbl);

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    URL imageURL = new URL(textField1.getText());
                    HttpURLConnection conn = (HttpURLConnection) imageURL.openConnection();
                    conn.connect();

                    InputStream inputStream = conn.getInputStream();
                    BufferedImage image = ImageIO.read(inputStream);

                    File outputFile = new File(textField2.getText());
                    ImageIO.write(image, "jpg", outputFile);

                    ImageIcon imageIcon = new ImageIcon(image);
                    Image scaledImage = imageIcon.getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_SMOOTH);
                    imageIcon = new ImageIcon(scaledImage);
                    lbl.setIcon(imageIcon);

                    inputStream.close();
                    conn.disconnect();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }
}
               