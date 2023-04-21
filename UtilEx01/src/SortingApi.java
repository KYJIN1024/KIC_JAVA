import java.util.Arrays;

public class SortingApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr= {"JAVA", "is", "A", "PIE"};
		Arrays.sort(arr);
		System.out.println("정렬 후");
		for(String i : arr) {
			System.out.printf("%s \t", i);
		}
		
	}

}
