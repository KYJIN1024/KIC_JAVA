import java.util.Scanner;

public class ScannerEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner( System.in );
		
		String msg = "";
		while( true ) {
			System.out.println("입력> ");
			msg = sc.nextLine();
			if( !msg.equals( "exit" )) {
				System.out.println("msg : " + msg );
			} else {
				System.out.println( "종료" );
				break;
			}
		}
	

			sc.close();
	}
}
