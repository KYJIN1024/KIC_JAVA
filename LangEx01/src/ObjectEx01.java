
public class ObjectEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object o1 = new Object();
		//객체변수 = o1.tostring()
		//override
		// toString() => 내용(멤버필드)출력
		System.out.println( o1 );
		System.out.println( o1.toString());
		
		System.out.println( o1.getClass().getName());
		System.out.println( o1.hashCode());
		System.out.printf( "%x%n", o1.hashCode());
		
		Person p = new Person(100,"홍길동",20);
		//toString() - Object클레스에서 상속
		System.out.println(p);
		System.out.println(p.toString());
		
		System.out.println(p.toString());
		String str = new String( "Hello Java");
		System.out.println(str);
	}

}

/*
 결과값
java.lang.Object@1ee0005
java.lang.Object@1ee0005
java.lang.Object
32374789
1ee0005
Person [id=100, name=홍길동, age=20]
Person [id=100, name=홍길동, age=20]
Person [id=100, name=홍길동, age=20]
Hello Java
*/

