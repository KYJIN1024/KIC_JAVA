//book page372

package pack3;

public class LocalInnerTest{
	int iMember =1;
	static int cMemebr =2;
	
	void method() {
		int localVar = 3;
		
		class LocalInner{
			int innerLocalVar =4;
			void InnerMethod() {
				System.out.println("외부인스턴스 멤버변수 :"+ iMember);
				System.out.println("외부 클래스 멤버변수 :"+ cMember);
				System.out.println("외부 로컬 변수 :"+ localVar);
				System.out.println("내부 인스턴스 멤버변수 :"+ InnerLocalVar);
			}
		}
	}
}

public class LocalInnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
