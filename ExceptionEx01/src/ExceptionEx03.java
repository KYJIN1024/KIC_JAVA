
public class ExceptionEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println( "시작" );
		
		int num1 = 10;
		int num2 = 20;
		
		try {
			int result = num2 / num1;
			System.out.println( result ); // 2
		}catch(ArithmeticException e) {
			System.out.println("exception 발생");
			System.out.println(e.getMessage()); 
			e.printStackTrace();
		}
		
		System.out.println( "끝" );
				
				
	}

}
