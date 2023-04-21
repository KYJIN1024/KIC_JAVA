import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class SystemEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//키보드 입력
		InputStream br = null;
		
		try {
			
			br = new BufferedReader( new InputStreamReader( System.in));
			
			System.out.print("데이터입력 :");
			
			//System.out.println( (char)br.read() );
			//System.out.println( (char)br.read() );
			//System.out.println( (char)br.read() );
			System.out.println(br.readLine() );
			
			System.out.println("입력완료");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} finally{
			if( br != null) try { br.close();} catch(IOException e) {};
		}

}
}
