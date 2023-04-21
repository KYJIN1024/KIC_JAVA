import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonEx03 {
	public static void main(String[] args) {
		
		String strJson = "{ \"data\" : \"value1\", \"data2\" : \"value2\" }";
		
		JSONParser parser = new JSONParser();
		
		try {
			JSONObject obj = (JSONObject)parser.parse(strJson);
			
			String data1 =(String)obj.get("data1");
			System.out.println( data1 );
			
			String data2 =(String)obj.get("data2");
			System.out.println( data2 );
			
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
