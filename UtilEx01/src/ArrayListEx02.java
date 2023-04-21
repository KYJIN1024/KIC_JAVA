
public class ArrayListEx02{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayListEx02 al = new ArrayListEx02();

		// String -> Object
		al.add( "홍길동" );
		al.add( "박문수" );
		al.add( "이몽룡" );
		
		System.out.println( al.toString() );
		
		//추가 삭제
		al.add( 2, "장길산" );
		System.out.println(al.toString());
		
		al.set(0,"이몽룡");
		System.out.println(al.toString());
		
		al.remove( 0 );
		System.out.println( al.toString());
		
		al.clear();
		System.out.println( al.toString());
		System.out.println( al.size() );
	
	}

	private char[] size() {
		// TODO Auto-generated method stub
		return null;
	}

	private void remove(int i) {
		// TODO Auto-generated method stub
		
	}

	private void set(int i, String string) {
		// TODO Auto-generated method stub
		
	}

	private void add(int i, String string) {
		// TODO Auto-generated method stub
		
	}

	private void add(Person p1) {
		// TODO Auto-generated method stub
		
	}
}
