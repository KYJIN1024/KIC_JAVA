import java.io.IOException;

public class ExceptionEx08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProcessBuilder processBuilder2
		= new ProcessBuilder("C:\\Windows\\System32\\notepad.exe");
		
		//★★ unhandeled exception 에러가 발생시 
		// 처리방법①: try catch 처리하기 ★
		// 처리방법②: error부분을 드래그한후 surround with 메뉴를 선택후 try catch block을 선택하면 자동으로 처리가능 
		try {
			processBuilder2.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
		


