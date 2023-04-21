import java.util.*;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d1 = new Date();
		System.out.println(d1);
		Date d2 = new Date(15000000000L);
		System.out.println(d2);
		long gap = d1.getTime()- d2.getTime();
		System.out.printf("두 날짜의 차는" + (gap/1000/60/24)+"일이다.");
	}

}
