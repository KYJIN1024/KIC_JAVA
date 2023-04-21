
public class ExceptionEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println( "시작" );
		
		String name = null; //null포인트 exception을 자주 발생함
		int num1 = 0;
		int num2 = 10;
		
		// if ~ else if ~else  다중예외처리 예시 
		try {
		System.out.println( name.length() );
		System.out.println( num2 / num1);
		
		} catch(NullPointerException e) {
			System.out.println("객체 생성후 메서드 사용");
		}catch(Exception e) {
			System.out.println("[에러]:" + e.getMessage());
		}
		
		
		System.out.println( "끝" );
	}
}
