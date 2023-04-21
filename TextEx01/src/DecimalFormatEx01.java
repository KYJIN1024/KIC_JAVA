import java.text.DecimalFormat; //문자열로 변환하는 메소드
import java.text.ParseException;

public class DecimalFormatEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat format1 = new DecimalFormat("$#,###.#"); // $ : 숫자앞에 표시
		
		double dbNum1 = 1234.5;
		double dbNum2 = 1234.5689898;
		double dbNum3 = 234.5;
		
		String strNum1 = format1.format(dbNum1);
		String strNum2 = format1.format(dbNum2);
		String strNum3 = format1.format(dbNum3);
		
		System.out.println( strNum1 ); //1,234.5  
		System.out.println( strNum2 ); //1,234.6
		System.out.println( strNum3 ); //234.5
		
		
		try {
			String strNum4 = "$1,234.5";
			double parseNum;
			parseNum = (double)format1.parse(strNum4);
			System.out.println( parseNum ); //1234.5   문자열에서 숫자만을 추출함
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
