
public class StringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.lang.StringBuilder sb1 = new java.lang.StringBuilder();
		java.lang.StringBuilder sb2 = new java.lang.StringBuilder(100);
		java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Hello StringBuilder");
		
		//buffer의크기
		System.out.println( sb1.capacity() );
		System.out.println( sb2.capacity() );
		System.out.println( sb3.capacity() );
	
	
		//저장 문자열의 길이
		System.out.println( sb1.length() );
		System.out.println( sb2.length() );
		System.out.println( sb3.length() );
		
		System.out.println( sb3.charAt(0));
		System.out.println( sb3.substring(4));
		
		
		
		//indexOf / lastIndexOf
		//replace
		//append / insert /delete
		
		System.out.println( sb3.reverse());
		
		
		
	}
}
