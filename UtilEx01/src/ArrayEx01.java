import java.util.Arrays;
import java.util.List;

public class ArrayEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arrs = { "aaa", "bbb", "ccc" };
		
		System.out.println(Arrays.toString(arrs));// 문자열 형식으로 리턴함  [aaa, bbb, ccc]
		
		Arrays.fill( arrs, "xxx" );
		System.out.println( Arrays.toString( arrs ));
		
		Arrays.fill( arrs, 0, 2, "yyy" );
		System.out.println( Arrays.toString(arrs )); //[yyy, yyy, xxx]
		
		String[] arrs1 = { "aaa", "bbb", "ccc" };
		String[] arrs2 = { "aaa", "bbb", "ccc" };
		
		System.out.println( arrs1 == arrs2 ); //false
		System.out.println( Arrays.equals(arrs1, arrs2)); //ture
		
		Integer[] arrNums = { 5, 2, 3, 1, 4 };
		Arrays.sort(arrNums);
		System.out.println( Arrays.toString( arrNums )); //[1, 2, 3, 4, 5]
	
		//List <-> 배열
		List<String> lists = Arrays.asList( arrs1 );
		System.out.println( lists );  // [aaa, bbb, ccc]
		
	
	
	
	
	
	
	
	}

}
