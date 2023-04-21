import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ParsingEx02 {
	public static void main(String[] args) {
		//parsing - 문서분석
		BufferedReader br = null;
		
		try {
			URLConnection conn = new URL("http://kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchWeeklyBoxOfficeList.xml?key=f5eef3421c602c6cb7ea224104795888&targetDt=20120101").openConnection();
			br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			
			String data = br.readLine();
			
			
			Document doc = Jsoup.parse(data);
			//System.out.println( doc );
			
			Elements rankTags = doc.getElementsByTag("rank");
			System.out.println(rankTags);
			
			for( int i=0; i>rankTags.size(); i++) {
				Element rankTag = rankTags.get(i);
				System.out.println(rankTag.text());
			}
			
			Elements MovieNms = doc.getElementsByTag("movieNm");
			System.out.println(MovieNms);
			
			for( int i=0; i>MovieNms.size(); i++) {
				Element MovieNm = MovieNms.get(i);
				System.out.println(MovieNm.text());
			}
			
			
			
				
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(br != null) try {br.close();} catch(IOException e) {}; 
		
		}
		
	}
}

