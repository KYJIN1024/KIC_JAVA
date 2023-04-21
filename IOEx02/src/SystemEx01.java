import java.io.IOException;
import java.io.InputStream;

public class SystemEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//키보드 입력
		InputStream is = null;
		
		try {
			is = System.in;
			System.out.print("데이터입력 :");
			System.out.println( (char)is.read() );
			System.out.println( (char)is.read() );
			System.out.println( (char)is.read() );
			
			System.out.println("입력완료");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} finally{
			if( is != null) try { is.close();} catch(IOException e) {};
		}

}
}
