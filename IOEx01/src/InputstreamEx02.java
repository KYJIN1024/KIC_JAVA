import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputstreamEx02 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        FileInputStream fis = null;

        try {
            fis = new FileInputStream("./test1.txt");

            // 전체 파일 내용 읽기
            int data = 0;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data); 
            }

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            if (fis != null) { 
                try {
                    fis.close();
                } catch (IOException e) {
                }
            }
        }
    }
}
