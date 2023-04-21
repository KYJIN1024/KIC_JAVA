import java.io.File;
import java.io.IOException;

public class FileEx07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 디렉토리관련
		// mkdir() - make directory의 약자 
		File file = new File( "c:/java/dir1");
		File file2 = new File( "c:/java/dir2");
		
//		if(file.mkdir() ) {				//디렉토리(폴더) 생성
//			System.out.println("성공");
//		}else {
//			System.out.println("실패");
//		}
		
		//file
//		file.renameTo( file2 ); //파일이름변경
		file2.delete();  //파일삭제
		
		try {												//새로운파일 생성방법 객체 생성/출력  그리고 tryandcatch
			File file3 = new File( "c:/java/test2.txt");  
			file3.createNewFile();
			System.out.println("파일 생성");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
