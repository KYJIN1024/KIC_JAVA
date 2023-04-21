import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs1 = new HashSet<>();
		Set<String> hs1 = new HashSet<>();
		Set<String> hs2 = new HashSet<>();
		
		hs1.add("홍길동");
		hs1.add("박문수");
		hs1.add("임꺽정");
		
		System.out.println( hs1 );
		System.out.println( hs1.size() );
		
		hs1.add( "홍길동" );
		hs1.add( "장길산" );
		
		System.out.println( hs1 );
		
		//전체 데이터 가져오기
		Iterator<String> i = hs1.iterator();
		while( i.hasNext()) {
			System.out.println( i.next() ); 
		}
		//향상된for문
		for( String str : hs1 ) {
			System.out.println( str );
		}
		
		
		
	}
}
