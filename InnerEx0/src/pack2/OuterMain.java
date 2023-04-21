package pack2;

public class OuterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer outer = new Outer();
		System.out.println( outer.x2 );
		
		Outer.Inner inner = new Outer.Inner();
		System.out.println( inner.y2 );
		
		inner.viewInner();
				
	}

}
