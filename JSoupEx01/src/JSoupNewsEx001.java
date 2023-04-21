import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.Timer;
import java.text.SimpleDateFormat;

public class JSoupNewsEx001 extends JFrame {

    private JPanel contentPane;
    private ArrayList<String> titles = new ArrayList<>();
    private ArrayList<String> links = new ArrayList<>();
    private ArrayList<JLabel> titleLabels = new ArrayList<>(); // 뉴스 제목 레이블을 저장할 ArrayList를 추가

    /**
     * Launch the application.
     */
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    JSoupNewsEx001 frame = new JSoupNewsEx001();
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
    public JSoupNewsEx001() {
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 600);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton btn1 = new JButton("실시간 뉴스보기");
        btn1.setBounds(39, 10, 680, 29);
        contentPane.add(btn1);

        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "\uB274\uC2A4 \uBCF4\uAE30", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
        panel.setBounds(36, 45, 689, 470);
        contentPane.add(panel);
        panel.setLayout(null);

        // 뉴스 제목 레이블 생성 및 추가
        for (int i = 0; i < 10; i++) {
            JLabel lbl = new JLabel("뉴스내용");
            lbl.setBounds(6, 19 + 34 * i, 503, 29);
            panel.add(lbl);
            titleLabels.add(lbl); // 생성된 레이블을 ArrayList에 추가
        }

        // 실시간 뉴스보기 버튼 이벤트 처리
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                getNewsTitlesAndLinks(); // 실시간 뉴스 제목과 링크를 가져옵니다.
                updateNewsTitles(); // 뉴스 제목을 업데이트합니다.
            }
        });

        // 바로가기 버튼 생성 및 추가
        for (int i = 0; i < 10; i++) {
            JButton btn = new JButton("바로가기");
            final int index = i; // 바로가기 버튼의 인덱스를 저장하는 상수를 생성합니다.
            btn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                        try {
                            Desktop.getDesktop().browse(new URI(links.get(index))); // 해당 인덱스의 링크를 사용하여 브라우저를 엽니다.
                        } catch (IOException | URISyntaxException ex) {
                            ex.printStackTrace();
                        }
                    }
                }
            });
            btn.setBounds(520, 19 + 34 * i, 97, 23);
            panel.add(btn);
        }
        //현재시간 표기하는 ui
        JLabel currentTimeLabel = new JLabel();
        currentTimeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        currentTimeLabel.setBounds(300, 525, 200, 30);
        contentPane.add(currentTimeLabel);
        // 현재시간 표기하는 함수값
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String currentTime = sdf.format(new Date());
                currentTimeLabel.setText(currentTime);
            }
        });
        timer.start();
        
    }
    //기사제목을 가져오는 함수
    private void getNewsTitlesAndLinks() {
        titles.clear();  //이전에 가져온 기사와 링크를 비우기위해
        links.clear();

        BufferedReader br = null;  // 페이지를 읽기위해 버퍼리더 생성
        try {
            URL url = new URL("https://news.daum.net/");   //뉴스를 가져올 웹페이지 설정
            br = new BufferedReader(new InputStreamReader(url.openStream()));  //웹페이지를 열고 데이터를 읽기위해 버퍼리더를 생성

            String line = null;   // 웹페이지의 각줄을 저장하는 변수
            boolean flag = false;   // 뉴스제목을 찾기위한 표시   제목을 찾으면 true 다른줄을 읽을때는 false로 유지
            while ((line = br.readLine()) != null) { // 웹페이지의 각줄을 읽으며 제목과 링크를 찾음  줄이 없을때까지 반복
                if (line.contains("class=\"link_txt\" data-tiara-layer=\"article_main\"")) { 
                    flag = true;    // 뉴스제목이 잇는 줄을 찾으며 flag를 true로 설정
                }
                if (line.contains("</a>")) {
                    flag = false;  // 제목이 끝나는 태그를 찾으면 flag를 false로 설정
                }
                if (flag) {
                    String title = br.readLine().trim();
                    titles.add(title);
                    int startIdx = line.indexOf("href=\"") + 6;
                    int endIdx = line.indexOf("\"", startIdx);
                    String link = line.substring(startIdx, endIdx);
                    links.add(link);     // 뉴스제목을 찾았을때 (flag가 true일때) 뉴스제목과 링크를 추출하고 titles과 링크 리스트에 추가
                }
            }

        } catch (MalformedURLException e) {
            System.out.println("[에러] " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("[에러] " + e.getMessage());
        } finally {   // 버퍼리더 닫음
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                }
            }
        }
    }

    private void updateNewsTitles() {
    	for (int i = 0; i < Math.min(titles.size(), titleLabels.size()); i++) {
    	    JLabel lbl = titleLabels.get(i);
    	    lbl.setText(titles.get(i));
    	}
    }
}