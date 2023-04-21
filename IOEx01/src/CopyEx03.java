import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class CopyEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = null;
	
		
		try {
			BufferedReader br = new BufferedReader(
					new FileReader("./zipcode_seoul_utf8_type2.csv"));
			
			
			while((str = br.readLine() ) != null) {
				//System.out.println(str);
			}
			
			String[] arrZipcode = str.split(",");
			//System.out.println( arrZipcode[2] );
			if( arrZipcode[2].equals("서초구")) {
				System.out.println(arrZipcode[0] + ' ' + arrZipcode[1] + ' ' + arrZipcode[2]);}
			System.out.println( "복사 성공 ");
		} catch (FileNotFoundException e) {
			System.out.println("[에러] "+e.getMessage());
			// TODO Auto-generated catch block
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] "+e.getMessage());
		} finally {
			if( str != null) try { str.close();} catch(IOException e) {};
	
		}
	}

}
