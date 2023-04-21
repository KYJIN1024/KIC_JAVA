import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// FileInputSteam = input / byte / 1차스트림
		
		FileInputStream fis = null;                         //전형적인 구문
		
		try {
			fis = new FileInputStream(" ./test1.txt" );
			
			int data = fis.read();
			System.out.println( data);
			System.out.println((char)data);
			
			data = fis.read();
			System.out.println((char)data );
			
			byte[] datas = new byte[5];
			fis.read(datas);
			System.out.println((char)datas[0]);
			System.out.println((char)datas[4]);
		
			
		} catch (FileNotFoundException e) {
			System.out.println("[에러]:" + e.getMessage());
		} catch (IOException e) {
			System.out.println("[에러]:" + e.getMessage());
		} finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    System.out.println("[에러]:" + e.getMessage());
                }
            }
        }
    }
}