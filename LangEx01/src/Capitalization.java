
public class Capitalization {
	
	public static void main(String[] args) {
		
		//강사님의 풀이
		if( args.length != 1 ) {
			System.out.println("1개를 입력하셔야 합니다.");
		}else {
			//System.out.println("정상");
			
		String[ ] names = args[0].split(" ");
//		System.out.println(names[0]);
//		System.out.println(names[1]);
//		System.out.println(names[2]);
		
		for( int i=0; i<names.length; i++) {
			names[i] = names[i].substring(0,1).toUpperCase()
			+ names[i].substring( 1 );
		}
		System.out.println( String.join("", names));
	}
		
//		String[] words = data.split ( " " );
//	      String result = " ";
//	    for( String word : words ) {  
//	         result += word.substring(0,1).toUpperCase() 
//	          + word.substring(1) + ' ';
//	         
//	    System.out.println(result.trim());
	}
	
}
