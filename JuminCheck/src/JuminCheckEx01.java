
public class JuminCheckEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// java jumincheckex01 123456-7894512
		
		// 입력
		// 처리 - 비지니스 로직
		// 출력
		
		// 입력값 검사
		if( args.length !=1 ) {
			System.out.println("java 클래스명 xxxxxx-xxxxxxx 형식으로 입력해주세요");
		}else {
			//
			//System.out.println("정상입력");
			
			// 코드를 무작정짜지말고 알고리즘을 통해 계획하여 짜기
			
			String strJumin = args[0].replaceAll("-", "");
			System.out.println( strJumin ); // 중간중간 println을 통해 에러 확인
			
			int num01 = Integer.parseInt( strJumin.substring(0,1)) * 2; 
			int num02 = Integer.parseInt( strJumin.substring(1,2)) * 3;
			int num03 = Integer.parseInt( strJumin.substring(2,3)) * 4;
			int num04 = Integer.parseInt( strJumin.substring(3,4)) * 5;
			int num05 = Integer.parseInt( strJumin.substring(4,5)) * 6;
			int num06 = Integer.parseInt( strJumin.substring(5,6)) * 7;
			int num07 = Integer.parseInt( strJumin.substring(6,7)) * 8;
			int num08 = Integer.parseInt( strJumin.substring(7,8)) * 9;
			int num09 = Integer.parseInt( strJumin.substring(8,9)) * 2;
			int num10 = Integer.parseInt( strJumin.substring(9,10)) * 3;
			int num11 = Integer.parseInt( strJumin.substring(10,11)) * 4;
			int num12 = Integer.parseInt( strJumin.substring(11,12)) * 5;
			//System.out.println( num01 );
			int lastNum = Integer.parseInt( strJumin.substring(12,13)) ;
			
			int sum = num01 + num02 + num03 + num04 + num05 + num06
					+ num07 + num08 + num08 + num09 + num10 + num11 + num12;
			int resultNum = (11 - (sum % 11))% 10;
			
			if( lastNum == resultNum ) {
				System.out.println("주민등록번호 형식이 맞음");
			}else {
				System.out.println("주민등록번호 형식이 틀림");
			}
			
		}
	}

}
