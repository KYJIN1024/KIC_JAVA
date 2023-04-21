import java.util.Calendar;
import java.util.Queue;

public class CalendarEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c = Calendar.getInstance();
		c.set(2023, 3-1, 1);
		System.out.println(c.getTime());
		
		// 특정기간이 지난후 ...
		c.add(Calendar.DATE, 3);
		System.out.println(c.getTime().toLocaleString());
		Date date = c.getTime();
		System.out.println( date );
		
		c.add(Calendar.DATE, -6);
		System.out.println( c.getTime().toLocaleString());
		
		queue
	}

}
