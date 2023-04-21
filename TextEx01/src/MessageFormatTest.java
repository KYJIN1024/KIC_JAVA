import java.text.MessageFormat; //메시지를 구성할 때 사용되며, 특히 다양한 언어와 문화권에서 메시지를 다루기 쉽게 함
import java.text.ParseException; // 문자열을 파싱할 때 발생할 수 있는 예외를 처리

public class MessageFormatTest {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		String pattern = "이름: {0}, Java: {1}, HTML:{2}, Script: {3}"; // {}숫자는 해당위치에 삽입할 값의 인덱스를 나타냄
		String src = "홍길동:100:90:85,임꺽정:90:98:70,장길산:75:85:90";
		String[] studentInfo= src.split(","); // 쉼표(,)를 기준으로 학생 정보를 분리하여 문자열 배열 studentInfo에 저장
		for(String student: studentInfo) {
			System.out.println(
					MessageFormat.format(pattern, student.split(":")));
		}
	}

}
