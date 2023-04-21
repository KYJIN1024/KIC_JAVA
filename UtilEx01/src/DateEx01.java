import java.util.Date;

public class DateEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.Date d1 = new java.util.Date();
		Date d2 = new Date();
		
		System.out.println( d1 );
		System.out.println( d2 );
		System.out.println( d2.toString());
		//deprecated
		System.out.println( d2.toLocaleString());
		
		//연월일을 분리 출력
		String strDate = d2.toLocaleString();
		System.out.println( strDate.substring(0,4));
		
		System.out.println(d2.getYear() + 1900 );
		System.out.println(d2.getMonth() + 1 );
		System.out.println(d2.getDate());
		System.out.println(d2.getDay());
		// 참고: 일요일이 기준값(0)
		
		// getDay -> 한글 출력
		// switch / if
		String[] weekname = {"일","월","화","수","목","금","토"};
		System.out.println(weekname[d2.getDay()]);

	}

}
