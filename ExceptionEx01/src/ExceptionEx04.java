
public class ExceptionEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println( "시작" );
		
		String name = null; //null포인트 exception을 자주 발생함
		int num1 = 0;
		int num2 = 10;
		
		try {
		System.out.println( name.length() );
		} catch(NullPointerException e) {
			System.out.println("객체 생성후 메서드 사용");
		}
		
		try {
			System.out.println( num2 / num1);
		} catch(ArithmeticException e) {
			System.out.println("0으로 나눌수 없음");
		}
		
		System.out.println( "끝" );
	}
}
