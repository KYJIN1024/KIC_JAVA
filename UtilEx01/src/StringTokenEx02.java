import java.util.StringTokenizer;

public class StringTokenEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strData = "사과&참외&&수박&&딸기";
		
		StringTokenizer st = new StringTokenizer(strData, "&");
		while( st.hasMoreTokens()) {
			System.out.println( st.nextElement());
		}
		
		String[] arrData = strData.split( "&" );
		for( String data : arrData ) {
			System.out.println( data );
		}

	}

}
