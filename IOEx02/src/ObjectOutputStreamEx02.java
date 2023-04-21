import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectOutputStream oos = null;
		
		try {
			oos = new ObjectOutputStream( new FileOutputStream( "./object2.date"));
			
			Person p = new Person("홍길동", "010-1111-1111", "20", "서울시" );
			Person p1 = new Person("박문수", "010-2222-1111", "23", "김포시" );
			Person p2 = new Person("임꺽정", "010-3333-1111", "25", "춘천시" );
			
			oos.writeObject(p);
			oos.writeObject(p1);
			oos.writeObject(p2);
			
			System.out.println("출력완료");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			if(oos != null) try {oos.close();} catch(IOException e) {};
		}
		
	}

}
