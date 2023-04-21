import java.io.File;

public class FileEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// File
		// 파일 / 디렉토리
		// 경로 - 절대 /상대 경로 둘다 사용가능
		
		//디렉토리를 절대경로
		File file1 = new File("c:\\java");  
		File file2 = new File("c:/java");
		// 디렉토리를 상대경로
		File file3 = new File("./java");  
		
		File file4 = new File("c:/java/test.txt");  
		File file5 = new File("./test.txt");  
		
		File file6 = new File("c:/java","test.txt");  
	
	
	}

}
