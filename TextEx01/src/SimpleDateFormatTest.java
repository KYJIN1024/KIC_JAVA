
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String source = "2020년 12월 25일";
		System.out.println(source + "를 요일 정보까지 출력하려면?");
		
		SimpleDateFormat format =
				new SimpleDateFormat("yyyy년 mm월 dd일");
		Date parsed;
		try {
			parsed = format.parse(source);
			System.out.println(format.format(parsed));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		format.applyPattern("yyyy년 mm월 dd일(E)");
		
		
	}

}
