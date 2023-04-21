import java.io.File;
import java.util.Arrays;

public class FileEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File( "c:/java" );
		
		String[] lists = file.list();
		System.out.println( Arrays.toString( lists ));
		for( String list : lists ) {
			System.out.println( list );
		}
		
		File[] fileLists = file.listFiles();
		for( File f : fileLists ) {
			System.out.println( f.getName() );
		}
	}

}
