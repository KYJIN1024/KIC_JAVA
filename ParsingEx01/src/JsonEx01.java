import java.lang.reflect.Array;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonEx01 {
	public static void main(String[] args) {
		
		String strJson = "[8,9,6,2,9]";
		
		JSONParser parser = new JSONParser();
		
		try {
			JSONArray array = (JSONArray)parser.parse(strJson);
			System.out.println( array );
			System.out.println( array.size() );
			
			for( int i=0; i<array.size(); i++) {
				//정수형 - long
				long data = (Long)array.get(i);
				System.out.println( data );
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
