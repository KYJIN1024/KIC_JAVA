import java.util.Random;

public class RandomEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// seeding 
		Random r1 = new Random( System.currentTimeMillis() );
		
		//System.out.println( r1.nextInt());
		//System.out.println( r1.nextInt());
		
		//System.out.println( r1.nextInt( 10 ) );
		//System.out.println( r1.nextInt( 10 ) );
		
		System.out.println( r1.nextInt( 45 ) + 1 );
	}

}
