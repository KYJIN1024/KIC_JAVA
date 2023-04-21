import java.net.MalformedURLException;
import java.net.URL;

public class NetworkEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// URL
		
		try {
			String strUrl = "https://search.naver.com:437/search.naver?where=nexearch&sm=top_hty&fbm=1&ie=utf8&query=covid\r\n";
			URL url = new URL( strUrl );
			
			System.out.println(url.getProtocol());  //https
			System.out.println(url.getHost());
			System.out.println(url.getPort());
			System.out.println(url.getPath());
			System.out.println(url.getQuery());
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
