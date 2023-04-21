import java.io.File;

public class FileEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file1 = new File("c:/java");
		System.out.println(file1.exists() ); //true 
		
		File file2 = new File("c:/java/test1.txt");
				System.out.println( file2.exists() ); //true - exists는 파일의 존재여부를 확인함
				
		System.out.println( file2.isDirectory() ); //파일이 디렉토리인지 아닌지를 확인하고, 그 결과를 출력
		System.out.println( file2.isFile() );  // 파일이 파일인지 확인
		
		System.out.println( file2.isHidden() ); //생성한 파일 객체가 숨겨진 파일인지 확인합니다. 숨겨진 파일이면 true를 반환합니다. false
	}

}
