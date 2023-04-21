
public class MyFunctionalInterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFunctionalInter() {
			
			@Override
			public void method() {
				// TODO Auto-generated method stub
				System.out.println( "method 호출1" );
			}
		}.method();
		
		//인터페이스를 객체변수로 선언 => lambda
		MyFunctionalInter f = new MyFunctionalInter() {
			
			@Override
			public void method() {
				// TODO Auto-generated method stub
				
				System.out.println("method호출2");
			}
		};
		
		f.method();
		
		MyFunctionalInter f1 = () -> {
			System.out.println("method 호출3");
		};
		
		f1.method();
	
		//lambda축약식
		MyFunctionalInter f2
		= () -> System.out.println("method 호출4");
		
		f2.method();
	}

}
