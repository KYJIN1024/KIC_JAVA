import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream( "./image1.png" );
			fos = new FileOutputStream( "./image2.png" );
			
			int data = 0;
			while((data = fis.read( )) != -1 ) {
				fos.write( data );
			}
			
			System.out.println( "복사 성공 ");
		} catch (FileNotFoundException e) {
			System.out.println("[에러] "+e.getMessage());
			// TODO Auto-generated catch block
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] "+e.getMessage());
		} finally {
			if( fos != null) try { fos.close();} catch(IOException e) {};
			if( fis != null) try { fis.close();} catch(IOException e) {};
		}
	}

}
