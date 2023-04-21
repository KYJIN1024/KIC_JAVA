import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputstreamEx04 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub


        BufferedOutputStream bos = null;
        
        try {
//            fis = new FileInputStream("./test2.txt");
            bos = new BufferedOutputStream(new FileOutputStream("./test2.txt") );
            
            bos.write( 'a' );
			bos.write( 'b' );
			
			bos.write( '\n' );
			
			
			bos.write( 'c' );
			System.out.println(" 출력완료 ");
            // 전체 파일 내용 읽기
        } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} finally {
			try { bos.close(); } catch(IOException e) {}
		}
	}

}

