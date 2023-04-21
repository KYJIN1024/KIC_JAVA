
public class SystemEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("시작");
		/*
		if ( args.length != 1 ) {
			System.out.println("비정상");
			
			//프로그램 종료
		} else {
			System.out.println("정상");
		}
		*/
		if ( args.length != 1 ) {
			System.out.println("비정상");		
			//프로그램 종료
			System.exit(0);  // "끝"이 출력되지않음
		} else {
			System.out.println("정상");
		}
		
		System.out.println( "끝" );

	}

}
