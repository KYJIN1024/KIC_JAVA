
public class ObjectEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1 = 10;
		int a2 = 10;
		
		// 내용값을 비교
		System.out.println( a1 == a2 );  //ture
		
		Object o1 = new Object();
		Object o2 = new Object();
		
		// 주소값
		System.out.println(o1 == o2);  // new키워드를 사용하여 생성된 객체는 서로 다른 주소값을 가지므로 o1 o2는 서로다른객체임
		// 내용값(멤버필드)
		System.out.println(o1.equals(o2)); // Object 클래스의 기본 equals() 메소드 구현은 객체의 주소를 비교하는 것과 동일하므로, 여기서도 결과는 false입니다.
		
		String str1 = new String("박문수");
		String str2 = new String("박문수");
		
		System.out.println( str1 == str2 );
		System.out.println(str1.equals(str2));// String 클래스는 equals() 메소드를 오버라이드하여 문자열의 내용을 비교하도록 구현되어 있습니다. 여기서는 두 객체의 문자열 값이 동일하므로 결과는 true입니다
	}

}
