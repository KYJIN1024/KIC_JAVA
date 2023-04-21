import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			bis = new BufferedInputStream( new FileInputStream("./Jellyfish.jpg" ) );
			bos = new BufferedOutputStream( new FileOutputStream("./Jellyfish.jpg" ) );
			
			int data = 0;
			while((data = bis.read( )) != -1 ) {
				bos.write( data );
			}
			
			System.out.println( "복사 성공 ");
		} catch (FileNotFoundException e) {
			System.out.println("[에러] "+e.getMessage());
			// TODO Auto-generated catch block
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] "+e.getMessage());
		} finally {
			if( bos != null) try { bos.close();} catch(IOException e) {};
			if( bis != null) try { bis.close();} catch(IOException e) {};
		}
	}

}
