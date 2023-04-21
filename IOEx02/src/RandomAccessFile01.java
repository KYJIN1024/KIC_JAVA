import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFile01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RandomAccessFile raf = null;
		try {
				raf = new RandomAccessFile("./score.dat", "rw");
				
				int[] scores = {
						1, 100, 90, 90, 
						2, 7, 90, 100,
						3, 100, 100, 100
			};
			
				for(int i= 0; i<scores.length; i++) {
					raf.writeInt( scores[i]);
					System.out.println("파일포인터 : "+ raf.getFilePointer() );
			}
			System.out.println("저장 완료 ");
			
			
			//.raf.seek(0);
			raf.seek(16);
			while( true ){
				System.out.println( raf.readInt( ));
			}
		} catch (EOFException E) {
			System.out.println("[에러]:" );
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			if(raf != null) try {raf.close();} catch(IOException e) {};
		}
	}
		
	}

