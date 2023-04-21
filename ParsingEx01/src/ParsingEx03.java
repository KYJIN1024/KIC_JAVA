import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


/*
	line = line.replaceAll(",",",\n" );
	System.out.println(line);
			
	json-simple => rank movieCd movieNm
*/

public class ParsingEx03 {
	public static void main(String[] args) {
		//parsing - 문서분석
		BufferedReader br = null;
		
		try {
			URLConnection conn = new URL("https://kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchWeeklyBoxOfficeList.json?key=f5eef3421c602c6cb7ea224104795888&targetDt=20230409").openConnection();
			br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			
			String line = br.readLine();
			line = line.replaceAll(",",",\n");
			System.out.println( line );
			
			JSONParser parser = new JSONParser();
			JSONObject jsonObject = (JSONObject) parser.parse(line);
			JSONObject boxOfficeResult = (JSONObject) jsonObject.get("boxOfficeResult");
			JSONArray weeklyBoxOfficeList = (JSONArray) boxOfficeResult.get("weeklyBoxOfficeList");
			
 			for (Object movieObject : weeklyBoxOfficeList) {
 					JSONObject movie = (JSONObject) movieObject;
 					String rank = (String) movie.get("rank");
 					String movieCd = (String) movie.get("movieCd");
 					String movieNm = (String) movie.get("movieNm");
 					
 					System.out.printf("순위: %s, 영화고유번호: %s, 영화명: %s%n", rank, movieCd, movieNm);
 					
 			}
			
				
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(br != null) try {br.close();} catch(IOException e) {}; 
		
		}
		
	}
}

