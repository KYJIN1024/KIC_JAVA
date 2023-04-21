import java.util.Scanner;

public class ScannerEx01 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner( System.in);
		System.out.println("입력 : " );
		// 공백까지만 입력을 받아드림
//		String msg = sc.next();
		// 엔터키까지 입력을 받아드림
		String msg = sc.nextLine();
		
		System.out.println("msg : " + msg );
		
		sc.close();

	}

}
