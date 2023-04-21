package pack1;

public class MyfunctionalInterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFunctionalInter f = null;
		f = () -> {
			System.out.println ( "method 호출" ); //함수형인터페이스를 선언할때는 인터페이스의 추상메서드는 하나만 입력되어야함 복수로 입력되어 있을경우 오류출력
		
		}
 	}

}
