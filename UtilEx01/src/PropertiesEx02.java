import java.util.Properties;
import java.util.Set;

public class PropertiesEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Properties prop = System.getProperties();
		
		Set<String> names = prop.stringPropertyNames();
		for( String name : names ) {
			System.out.println( name );
			
			//Ecilpse JRE
			
			System.out.println( System.getProperty("java.version" ));
			System.out.println( System.getProperty("java.home" ));

		}
	}

}
