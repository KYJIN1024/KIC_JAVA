package pack1;

import pack1.Outer.Inner;

public class InstanceInner test {
	class Inner{
		int innerMember = 10;
		//static int staticMember = 10;
		static final int finalStaticMember = 20;
		
		private void innerMethod() {
			System.out.println("om:"+ outerMember + ",im"+ innerMember);
		};
	};
};
	
	private int outerMember = 1;
	
	private void outerMethod() {
		Inner inner = new Inner();
		inner.innerMember = 100;
		inner.innerMethod();
	}
}


public class InstanceInnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntstanceInnerTest iit = new InstanceInnerTest();
		Inner inner = iit.new Inner();
		inner.innerMethod();

	}

}
