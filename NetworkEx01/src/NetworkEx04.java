import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class NetworkEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		BufferedReader br = null;
		
		try {
			URL url = new URL("https://m.daum.net");
			br = new BufferedReader( new InputStreamReader( url.openStream()));
			String line = null;
			while( (line = br.readLine()) != null) {
				System.out.println(line);
			}
			System.out.println();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(br != null) try {br.close();} catch(IOException e) {}; 
		}
		
		
		
		
	}

}
