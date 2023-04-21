package ch15.processing.object;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamTest {

	public static void main(String[] args) {
		File target = new File("C:/Temp/objPerson.dat");
		Person person =
				new Person("홍길동", 20, "111111-2222222","hong","1234");
		try(ObjectOutputStream oos =
				new ObjectOutputStream(new FileOutputStream(target));
				ObjectInputStream ois = 
						new ObjectInputStream(new FileInputStream(target));){
				oos.writeObject(person);
					 
					 Object readed = ois.readObject();
					 if(readed != null && readed instanceof Person) {
						 Person casted = (Person) readed;
						 System.out.println(casted);
					 }
				 } catch(IOException | ClassNotFoundException e) {
					 e.printStackTrace();
		}
		
	}

}
