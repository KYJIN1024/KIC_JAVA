
public class ExceptionEx07 {
	public void method1( int num ) {
		System.out.println( "메서드 시작" );
		
		
		//입력값 검사
		if ( num >= 100 ) {
			System.out.println( "100보다 크다 " ); // 100이상이면 출력
		} else {
			// System.out.println( "100보다 작다 ");
			// 강제 예외발생 
			try {
			throw new Exception( "100보다 작다" );
			} catch(Exception e) {
				System.out.println("[에러]:" + e.getMessage()); // 발생한 예외를 처리하고 exception화 처리함
			}
		}
		
		System.out.println(" 메서드 끝 ");
	}
	
	public void method2( int num ) throws Exception {
		System.out.println( "메서드 시작" );
		
		
		//입력값 검사
		if ( num >= 100 ) {
			System.out.println( "100보다 크다 " ); // 100이상이면 출력
		} else {
			// System.out.println( "100보다 작다 ");
			// 강제 예외발생 
			try {
			throw new Exception( "100보다 작다" );
			} catch(Exception e) {
				System.out.println("[에러]:" + e.getMessage()); // 발생한 예외를 처리하고 exception화 처리함
			}
		}
		
		System.out.println(" 메서드 끝 ");
	}

	  public void method3(int num) throws CustomException {
	        System.out.println("메서드 시작");

	        // 입력값 검사
	        if (num >= 100) {
	            System.out.println("100보다 크다 ");
	        } else {
	            throw new CustomException("100보다 작다");
	        }

	        System.out.println(" 메서드 끝 ");
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionEx07 ee = new ExceptionEx07();
		ee.method1(10);
		ee.method1(200);
		
	try {
	ee.method2( 10 );
	} catch(Exception e) {
		System.out.println("[에러]:" + e.getMessage()); // [에러]:100보다 작다
	}
	
	
	try {
		 ee.method3( 10 );
	}catch (CustomException e ) {
			System.out.println("[에러]:"+ e.getMessage() );
		}
}
}
		
class CustomException extends Exception {
    public CustomException() {
        super();
    }

    public CustomException(String message) {
        super(message);
    }
}


/*
 결과값
 
 메서드 시작
[에러]:100보다 작다
 메서드 끝 
메서드 시작
100보다 크다 
 메서드 끝 
첫 번째 method1 호출에서 num이 10이므로 100보다 작고, 예외가 발생하여 catch 블록에서 처리됩니다. 두 번째 호출에서 num이 200이므로 100보다 크고, 입력값 검사에서 "100보다 크다"가 출력됩니다.
 
 
 
 */



