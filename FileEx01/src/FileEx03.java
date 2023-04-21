import java.io.File;
import java.io.IOException;

public class FileEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File("c:/java/test1.txt");
		
		System.out.println( file.getName() ); //파일명및 형식출력
		System.out.println( file.getParent() ); 
		System.out.println( file.getPath() );
		
		File file2 = new File( "./" );
		
		System.out.println( file2.getPath() );
		try {
			System.out.println( file2.getCanonicalPath() );  // C:\Java\java_workspace\KIC_JAVASTUDY_ecilpse\FileEx01 파일의 정식경로를 리턴함 unhandle 오류가 발생하기 때문에 trycatch처리해야함
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
