import java.util.StringJoiner;

public class StringJoinerEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 문자열 결합
		String str1 = "사과" + ",수박" + ",딸기" + ",수박";
		System.out.println( str1 ); // +연산자를 통한 결합
		
		String str2 = "사과".concat(",수박").concat(",딸기").concat(",참외");
		System.out.println( str2 ); // concat 메소드를 사용한 결합
		
		String str3 = String.format("%s,%s,%s,%s","사과","수박","딸기","참외");
		System.out.println( str3 ); // String.format 메소드를 사용한 결합
		
		String[] arrStr = { "사과", "수박", "딸기", "참외" };
		String str4 = String.join( ",", arrStr );
		System.out.println( str4 ); // String.join 메소드를 사용하여 문자열 배열 arrStr의 요소들을 콤마로 구분하여 결합
		
		StringJoiner sj = new StringJoiner( "," );
		sj.add( "사과" );
		sj.add( "수박" );
		sj.add( "딸기" );
		sj.add( "참외" );
		System.out.println( sj.toString()); //StringJoiner 클래스를 사용하여 문자열을 결합
		
	}

}
