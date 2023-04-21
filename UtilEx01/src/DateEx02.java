import java.util.Date;

public class DateEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d1 = new Date(2023-1900, 3-1, 1);
		System.out.println( d1.toLocaleString());
	
	
	// 2023년 12월 24일의 요일??
		Date d2 = new Date(2023-1900,12-1,25);
		System.out.println(d2.getDay());
		
		int dayOfWeek = d2.getDay();
        String[] daysInKorean = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};
        String dayInKorean = daysInKorean[dayOfWeek];
        System.out.println(dayInKorean);
	
	}
}
