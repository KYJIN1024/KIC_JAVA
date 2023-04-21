import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JFrameEx05 extends JFrame {
	
	private JPanel contentPane;
	
	public JFrameEx05() {
		
	
		
		this.setBounds(100, 100, 1024, 768);  //창위치및 크기
		

		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x버튼을 누르면 프로그램 종료됨

		contentPane = new JPanel();  // 새로운 jpanel 인스턴스를 생성
		
		contentPane.setBackground(Color.RED);   //배경색 변경
		
		JButton btn1 = new JButton("난 버튼1");    //버튼생성및 버튼의 크기 설정
		btn1.setBounds(10, 10, 100, 25);
		
		JButton btn2 = new JButton("난 버튼2");    //버튼생성및 버튼의 크기 설정
		btn2.setBounds(10, 40, 100, 25); //버튼의 위치
		
		// 레이아웃 매니저(배치관리자)
		// null - null layout / absolute layout
		contentPane.setLayout( null );
		
		
		
		contentPane.add(btn1); //버튼 적용
		contentPane.add(btn2); 
		
		this.setContentPane(contentPane);  //배경적용
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrameEx05 frame = new JFrameEx05();
		
		frame.setVisible(true);  
		
	}
	
	

}
