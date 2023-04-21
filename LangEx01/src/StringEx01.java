
public class StringEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문자열 저장 클래스
		// String(*)
		// StringBuffer / StringBuilder(o)
		
		//선언
		String str1 = "Hello String";
		String str2 = new String("Hello String");
		char[] charArray = { 'H', 'e', 'l', 'l', 'o'};
		String str3 = new String(charArray);
		
		// toString()
		// euals() - 내용값 비교 ★☆ 중요하므로 잘기억하기 프로젝트때 내용값 비교할때 사용가능
		
		System.out.println( str1.length());
		System.out.println( "HELLO".length());
		
		//문자열 -> 문자추출
		System.out.println(str1.charAt(0)); //문자와 문자열은 자료형이 완전히 틀리므로 주의
		
		//마지막 문자를 출력
		System.out.println(str1.charAt(str1.length()-1) );
		
		//문자열 -> 부분문자열추출 (요걸더많이씀)
		System.out.println( str1.substring(2));
		System.out.println( str1.substring(2,4));
		
		//문자위치
		System.out.println(str1.indexOf('1'));  // -1
		System.out.println(str1.lastIndexOf("p")); // -1 (없는문자열) '' : 문자 "":문자열
		
		//문자열존재여부 (contains, endsWith) ~~를 포함하느냐 or ~~로 끝나느냐
		System.out.println( str1.startsWith("He"));
		
		//문자열치환
		System.out.println( str1.replaceAll("Hello", "안녕"));
		
		//문자열 결합 : +
		System.out.println( str1.concat( "안녕" ));
		
		//대소문자
		System.out.println( "hello".toUpperCase());
		System.out.println( "Hello".toLowerCase());
		
		//공백제거
		String str11 = "                Hello       String           ";
		System.out.println( str11.length());
		String str12 = str11.trim();
		System.out.println( str12.length());
		System.out.println( str12 );
		
		//구분자 단위 분리
		String str21 = "apple,banana,pineapple,kiwi";
		String[]strArr = str21.split( "," );
		for ( String str : strArr ) {
			System.out.println( str );
		}
		
		//구분자 단위 결합
		String str22 = String.join( "," , strArr);
		System.out.println( str22 );
		
		//형식이 있는 문자열  printf와 똑같음
		String str31 = String.format("%s-%s-%s","aaa","bbb","cccc", args);
		System.out.println( str31 );
	}

}
