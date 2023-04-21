import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("./test2.txt", true );  // true면 appending 옵션지정가능
			
			//출력 내용 없음
			fos.write( 'a' );
			fos.write( 'b' );
			
			fos.write( '\n' );
			
			
			fos.write( 'c' );
			
			
			System.out.println(" 출력완료 ");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} finally {
			try { fos.close(); } catch(IOException e) {}
		}
	}

}
