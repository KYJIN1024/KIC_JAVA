import java.util.HashMap;

public class HashMapEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String , String> hm = new HashMap<>();
		
		hm.put("a", "홍길동");
		hm.put("b", "박문수");
		hm.put("c", "이몽룡");
		
		System.out.println( hm ); // {a=홍길동, b=박문수, c=이몽룡}
		System.out.println( hm.size() ); // 3
		
		hm.put("d","장길산"); //위의 데이터가 없으면 추가
		
		System.out.println( hm ); // {a=홍길동, b=박문수, c=이몽룡, d=장길산}
		
		hm.put("c", "임꺽정"); // 위의 데이터가 있으면 수정
		
		System.out.println( hm ); // {a=홍길동, b=박문수, c=임꺽정, d=장길산}

		System.out.println( hm.get("a") ); //홍길동
		System.out.println( hm.get("b") ); //박문수
		
		hm.remove( "c" );
		System.out.println( hm ); //{a=홍길동, b=박문수, d=장길산}
		
		hm.clear();
		System.out.println( hm ); // {}
	}

}
