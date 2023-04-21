import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class NetworkEx06 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		//https://t1.daumcdn.net/daumtop_chanel/op/20200723055344399.png
		// 이미지를 가져오기 위해서는  BufferedInputStream  / BufferedOutputStream
		
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			
			HttpURLConnection conn = 
					(HttpURLConnection)new URL("https://t1.daumcdn.net/daumtop_chanel/op/20200723055344399.png").openConnection();
			

				
			bis = new BufferedInputStream(conn.getInputStream());
			bos = new BufferedOutputStream(new FileOutputStream("./daum.png"));
			
			int data = 0;
			while((data= bis.read()) != -1) {
				bos.write( data );
			}
			System.out.println("다운로드완료");
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러]"+ e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("[에러]"+ e.getMessage());
		} finally {
			if(bos != null) try {bos.close();} catch(IOException e) {}; 
			if(bis != null) try {bis.close();} catch(IOException e) {}; 
		}

	}

}