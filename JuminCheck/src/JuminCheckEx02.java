
public class JuminCheckEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if( args.length !=1 ) {
			System.out.println("java 클래스명 xxxxxx-xxxxxxx 형식으로 입력해주세요");
		}else {
			//
			//System.out.println("정상입력");
			
			// 코드를 무작정짜지말고 알고리즘을 통해 계획하여 짜기
			
			String strJumin = args[0].replaceAll("-", "");
			int[] bits = {2,3,4,5,6,7,8,9,2,3,4,5};
			int sum = 0;
			for( int i=0; i<bits.length; i++) {
				sum += Integer.parseInt(strJumin.substring(i,i+1)) * bits[i];
			}
			
			//System.out.println( num01 );
			int lastNum = Integer.parseInt( strJumin.substring(12,13)) ;
			

			int resultNum = (11 - (sum % 11))% 10;
			
			if( lastNum == resultNum ) {
				System.out.println("주민등록번호 형식이 맞음");
			}else {
				System.out.println("주민등록번호 형식이 틀림");
			}
			
		}
	}