import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class NetworkEx07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;
		
		try {
			//URLConnection conn = new URL("https://news.daum.net").openConnection();
			HttpURLConnection conn = (HttpURLConnection)new URL("https://news.daum.net/").openConnection();
			
			//int responseCode = conn.getResponseCode();
			//System.out.println(responseCode);
			
			if( conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
				
			System.out.println(conn.getRequestMethod());
			System.out.println(conn.getResponseMessage());
				
			br = new BufferedReader( new InputStreamReader(conn.getInputStream()));
			
			String line = null;
			while((line= br.readLine()) != null) {
				System.out.println(line);
			}
		}else {
			System.out.println("접속에러");
			}
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러]"+ e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("[에러]"+ e.getMessage());
		} finally {
			if(br != null) try {br.close();} catch(IOException e) {}; 
		}

	}

}