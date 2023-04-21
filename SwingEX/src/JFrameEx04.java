import javax.swing.JFrame;

public class JFrameEx04 extends JFrame {
	
	public JFrameEx04() {
		
		//this.setSize(1024,768);
		//this.setLocation(100, 100);
		
		this.setBounds(100, 100, 1024, 768);  //창위치및 크기
		
		this.setTitle("JFrame 데모");   //창이름 
		System.out.println( this.getTitle());
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x버튼을 누르면 프로그램 종료됨
		this.setResizable(false);  //창크기강제
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrameEx04 frame = new JFrameEx04();
		
		frame.setVisible(true);
		
	}
	
	

}
