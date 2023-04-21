
public class SystemEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] src = {1,2,3,4,5};
		
		//shadow copy - 참조값 복사ㅕㅛㅗㅛㅕㅓㅗㅕㅓ
		int[] dest1 = src;
		
		System.out.println( src[0] );
		System.out.println( dest1[0] );
		
		//for
		// System.arraycopy
		int[] dest2 = { 0, 0, 0, 0, 0};
		
		//deep copy 
		System.arraycopy(src, 0 , dest2, 0, src.length);
		
		for( int i=0; i<dest2.length; i++ ) {
			System.out.println( dest2[i]);
		}
		
		
	}

}
