import java.util.HashSet;
import java.util.Random;
import java.util.random.*;
import java.util.Set;



public class lottoEx01 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> lottoNumbers = new HashSet<>();

		Random random = new Random(System.currentTimeMillis());
		
		while(lottoNumbers.size() <6 ){
			int number = random.nextInt(45)+1 ;
			lottoNumbers.add(number);
		}
		
		System.out.println("로또번호는:"+ lottoNumbers);
	}
	
}
