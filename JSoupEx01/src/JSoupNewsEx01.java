import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.management.timer.Timer;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.Desktop;

public class JSoupNewsEx01 extends JFrame {

	private JPanel contentPane;
	private ArraayList<String> titles = new ArrayList<>();
	private ArraayList<String> links = new ArrayList<>();
	private ArraayList<JLabel> titleLabels = new ArrayList<>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {
					JSoupNewsEx01 frame = new JSoupNewsEx01();
					frame.setVisible(true);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			});
	}
	
		public JSoupNewsEx01() {
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
	
		
			for(int i = 0; i<10; i++) {
				JLabel lbl = new JLabel("뉴스내용");
				lbl.setBounds(6, 19+34*i, 503, 29);
				panel.add(lbl);
				titleLabels.add(lbl);
			}
			
			btn1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					getNewsTitlesAndLinks();
					updateNewsTitles();
					
				}
			});
			
			for(int i = 0; i < 10; i++) {
				JButton btn = new JButton("바로가기");
				final int index = i;
				btn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
							
							try {
								Desktop.getDesktop().browse(new URI(links.get(index)));
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} catch (URISyntaxException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							
							
						}
					}
					
					
				});
				
				btn.setBounds(520, 19+35 * i, 97, 23);
				panel.add(btn);
			}
			
			JLabel currentTimeLabel = new JLabel();
			currentTimeLabel.setHorizontalAlignment(SwingConstants.CENTER);
			currentTimeLabel.setBounds(300,525,200, 30);
			contentPane.add(currentTimeLabel);
			
			Timer timer = new Timer(1000, new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					SimpleDataFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
					String currentTime = sdf.format(new Date());
					currentTimeLabel.setText(currentTime);
				}
					
				});
				timer.start();
					
		}
		private void getNewsTitleAndLinks() {
			titles.clear();
			links.clear();
			
		BufferedReader br = null;
		
		try {
		    URL url = new URL("https://news.daum.net/");
            br = new BufferedReader(new InputStreamReader(url.openStream()));
          
            String line = null;
            boolean flag = false;
            while ((line = br.readLine()) != null) {
  
            	if( line.contains("class=\"link_txt\" data-tiara-layer=\"article_main\"")) {
            		flag = true;
            	}
            	if( line.contains("</a>")) {
            		flag = false;
            	}
            	if(flag ) {
            		System.out.println(br.readLine().trim());
            		titles.add(title);
            		int startIdx = line.indexOf("href=\"") + 6;
            		int endIdx = line.indexOf("\"",startIdx);
            		String link = line.substring(startIdx, endIdx);
            		links.add(link);
            	}
            	
            }
            
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러]"+ e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("[에러]"+ e.getMessage());
		} finally {
			if(br != null) try {br.close();} catch(IOException e) {}; 
		}

		
	}
		private void updateNewsTitles() {
			for(int i = 0; i< Math.min(titles.size(), titleLabels.size()); i++) {
				JLabel lbl = titleLabels.get(i);
				lbl.setText(titles.get(i));
			}
		}
		
		
	

}
