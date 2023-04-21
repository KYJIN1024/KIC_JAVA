import java.io.File;
import java.util.Arrays;

public class FileEx06 {

	public static void main(String[] args) {
	
		File file = new File( "c:/java" );
		
		String[] lists = file.list();
		for( String list : lists ) {
			File subdir = new File("c:/java", list);
			if(file.isDirectory() ) {
				System.out.println("["+ list + "]");
			} else {
				System.out.println( list );
			}
			
		}
		
		
	}

}
