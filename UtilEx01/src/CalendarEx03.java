import java.util.Calendar;

public class CalendarEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year = 2023;
		int month = 3;
		
		Calendar startCalendar = Calendar.getInstance();
		Calendar endCalendar = Calendar.getInstance();
		
		startCalendar.set( year, month-1, 1);
		endCalendar.set( year, month, 1-1);
		
		int startDayOfWeek = startCalendar.get(Calendar.DAY_OF_WEEK);
		int endDate = endCalendar.get( Calendar.DATE);
		//마지막요일 - 디자인적인 필요..
		
		System.out.println( " SU MO TU WE TH FR SA" );
		for( int i=1; i<startDayOfWeek; i++) {
			System.out.println( "   " ); // 3	
		}
		for(int i=1, n=startDayOfWeek; i<=endDate; i++, n++) {
			System.out.println( ( i < 10 ) ? "  " + i : " " + i); // 2 / 1
			if( n % 7 == 0 ) {
				System.out.println();
			}
		}
		
	}

}

/*
 이 Java 프로그램은 주어진 년도(year)와 월(month)의 달력을 출력하는 코드입니다. 코드의 주요 부분을 아래와 같이 설명할 수 있습니다.

먼저, 년도(year)와 월(month) 변수를 설정합니다. 이 예에서는 2023년 3월이 설정되어 있습니다.

다음으로, java.util.Calendar 클래스의 인스턴스를 두 개 생성합니다. 하나는 해당 월의 시작 날짜(startCalendar)를 나타내고, 다른 하나는 해당 월의 마지막 날짜(endCalendar)를 나타냅니다.

startCalendar와 endCalendar 변수를 각각 해당 월의 시작 날짜와 마지막 날짜로 설정합니다. Java에서 월은 0부터 시작하기 때문에, month-1로 설정해야 합니다.

시작 날짜의 요일(startDayOfWeek)과 해당 월의 마지막 날짜(endDate)를 가져옵니다.

달력의 요일 헤더("SU MO TU WE TH FR SA")를 출력합니다.

시작 날짜의 요일에 도달할 때까지 빈 칸을 출력합니다. 이 과정은 해당 월의 첫 번째 날이 시작하는 요일에 맞추기 위한 것입니다.

1일부터 해당 월의 마지막 날까지 날짜를 출력하고, 각 날짜 다음에 줄바꿈을 추가하여 날짜가 행으로 구분되도록 합니다. 이 때, 한 자리 숫자 날짜 앞에 공백을 추가하여 날짜를 정렬합니다.

이 프로그램을 실행하면, 2023년 3월의 달력이 출력됩니다. 각 날짜는 올바른 요일에 나타납니다.
 
 
 
 */


