import java.util.ArrayList;

public class ArrayListEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al1 = new ArrayList();
		
		al1.add( "홍길동" );
		al1.add( new Person( "1001", "홍길동") );
			
		// 데이터 가공, 출력 
		//for( int i=0; i<al1.size(); i++ ) {
		//	String s = (String)al1.get(i);
		//	System.out.println( s );
		
		// Generic => 컬렉션 (클래스, 메서드) 내부 자료형 선언
		ArrayList<String> a12 = new ArrayList<>();
		al2.add("홍길동");
		al2.add("박문수");
		
		for( int i=0; i<a12.size(); i++) {
			String s = al2.get(i);
			System.out.println( s );
		}

	}

}
