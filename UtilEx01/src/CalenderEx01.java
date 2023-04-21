import java.util.Calendar;

public class CalenderEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Calendar calendar1 = new Calendar()
		Calendar calendar = Calendar.getInstance();
		System.out.println( calendar.toString());
		
		System.out.println( calendar.get( Calendar.YEAR)); 
		System.out.println( calendar.get( Calendar.MONTH) +1 );
		System.out.println( calendar.get( Calendar.DATE));
		System.out.println( calendar.get( Calendar.DAY_OF_WEEK));
		
		System.out.println( calendar.getTime());
		System.out.println( calendar.getTimeInMillis());
		System.out.println( calendar.getActualMaximum(Calendar.DATE));
	}

}
