import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file1 = new File ("C:\\Java\\java_workspace\\KIC_JAVASTUDY_ecilpse\\mariadb-10.11.2-winx64.msi");
		File file2 = new File ("./mariadb-10.11.2-winx64.msi");
		
		System.out.println( file1.exists() );
		System.out.println( file2.exists() );
		
		try {
			System.out.println(file2.getCanonicalPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 생성(수정)일자
		// 파일크기 
		
		System.out.println(file1.length()); //71266304 파일크기출력 byte단위로 표기됨
		//timestamp
		System.out.println(file1.lastModified() ); //1679561328806  milliseconds값으로 출력됨

		Date date = new Date(file1.lastModified()); // lastModified을 읽을수 있게 변경하는법  date객체생성 
		System.out.println(date.toLocaleString()); // 2023. 3. 23. 오후 5:48:48
	}	
	
}
