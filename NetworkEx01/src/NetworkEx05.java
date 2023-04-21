import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NetworkEx05 {

    public static void main(String[] args) {
        BufferedReader br = null;

        try {
            URL url = new URL("https://news.daum.net/");
            br = new BufferedReader(new InputStreamReader(url.openStream()));
          
            String line = null;
            boolean flag = false;
            while ((line = br.readLine()) != null) {
            	
            	
            	//equals
            	// contains / startWith / endsWith
            	// indexOf
            	// <ul class="list_newsissue">
            	// </ul>
            	//class="link_txt" data-tiara-layer="article_main"
            	//</a>
            	
            	if( line.contains("class=\"link_txt\" data-tiara-layer=\"article_main\"")) {
            		flag = true;
            	}
            	if( line.contains("</a>")) {
            		flag = false;
            	}
            	if(flag ) {
            		System.out.println(br.readLine().trim());
            	}
            	
               
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
