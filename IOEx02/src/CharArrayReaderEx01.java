import java.io.CharArrayReader;
import java.io.IOException;
import java.util.Arrays;

public class CharArrayReaderEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 메모리에서 스트링 기능이 가능
		
		char[] memory = { '안', '녕', ' ', 'j', 'a', 'v', 'a'};  //초기화
		
		try( CharArrayReader charArry = new CharArrayReader(memory) ){  //객체생성 후 이 객체에 메모리 배열을 전달
			char[] buffer = new char[5];   // 크기가 5인 배열을 생성  이배열은  chararrayreader에서 읽은 문자를 저장하는데 사용
			
			int read = 0;
			while( ( read = charArry.read(buffer) ) >0 ) {
				System.out.println( Arrays.toString(buffer));  //buffer을 호출하여 배열의 길이 만큼의 문자를 호출
			}
		} catch(IOException  e) {
			System.out.println("[에러]"+ e.getMessage());

		}
		
	}

}
