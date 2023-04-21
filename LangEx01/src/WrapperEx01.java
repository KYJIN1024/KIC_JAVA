
public class WrapperEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( Integer.MAX_VALUE);
		System.out.println( Integer.MIN_VALUE);
		
		System.out.println( Double.MAX_VALUE);
		System.out.println( Double.MIN_VALUE);
		// Wrapper
		Integer i1 = Integer.valueOf(123);
		Integer i2 = Integer.valueOf("123");
		
		// autoboxing
		Integer i3 = 123;
		// 형변환
		int i11 = i1.intValue();
		float f11 = i1.floatValue();
		System.out.println( i11 );
		System.out.println( f11 );
		
		//많이 쓰이므로 잘알아두기  **외워두기
		int i21 = Integer.parseInt("123" );
		float f21 = Float.parseFloat("123");
		System.out.println( i21 );
		System.out.println( f21 );
		
		
	
	}

}
