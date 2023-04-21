import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//클래스명에 동이름을 넣으면 해당 동 우편번호 출력


public class CheckJuminEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(args.length);
		if( args.length != 1) {
			System.out.println("java 클래스명 동이름 형식으로 입력하셔야합니다.");
			System.out.println(0 );
		}

		if(args[0].length() <= 1 ) {
			System.out.println( "동이름을 두 자이상 입력하셔야 합니다.");
			System.exit(0);
		}
		
		String strDong = args[0];
		
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("./zipcode_seoul_utf8_type2.csv"));
			
			String address = null;
			while( ( address = br.readLine() ) != null) {
				System.out.println( address );
			}
		} catch (FileNotFoundException e) {
			System.out.println("[에러]"+e.getMessage());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러]"+e.getMessage());
		} finally {
			if( br != null ) try { br.close();} catch(IOException e) {};
		}
		
	}

}
