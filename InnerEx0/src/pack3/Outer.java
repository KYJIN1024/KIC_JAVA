package pack3;

public class Outer {

	public void viewOuter() {
		final int x = 100; //1.7버전까지만 final 선언가능
		
//		int x = 100;
		
		class Inner {
			private int y1 = 100;
			public int y2 = 200;
			
			public void viewInner() {
				System.out.println( x );
				System.out.println( y1 );
				System.out.println( y2 );
				
			}
		}
		
		Inner inner = new Inner();
		inner.viewInner();
	}
}
