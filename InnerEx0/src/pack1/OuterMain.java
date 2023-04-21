package pack1;

public class OuterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Outer outer = new Outer();
//		System.out.println( outer.x1 );
		System.out.println( outer.x2 );
		
		Outer.Inner inner = outer.new Inner();
//		System.out.println( inner.y1 );
		System.out.println( inner.y2 );
		
		inner.viewInner();
	}

}

/*
[result]
Outer : pack1.Outer@6f2b958e
100
200
100
100
200
200
   파일을 확인해보면 innerclass파일이 별도로 생성됨
*/