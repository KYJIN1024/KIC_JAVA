package pack4;

interface SomeInterface{
	void printinfo();
}

public class AnonymousInnerTest {
	int iMember = 1;
	static int cMember = 2;
	
	void method(SomeInterface si) {
		si.printinfo();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnonymousInnerTest lit = new AnonymousInnerTest();
		int localVar = 3;
		lit.method( new SomeInterface() {

			@Override
			public void printinfo() {
				// TODO Auto-generated method stub
			System.out.println("외부 인스턴스 멤버변수 : "+ iMember);
			System.out.println("외부 클래스 멤버변수:" + cMember);
			System.out.println("외부 로컬 변수 :"+ localVar);
			
			cMember++;
			//localVar++; //여전히 편집을 불가능
				
				
			}
			
		});
	}

}
