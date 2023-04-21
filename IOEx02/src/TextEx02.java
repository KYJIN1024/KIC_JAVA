import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TextEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path target = Paths.get("./test1.txt");
		
		List<String> lines = Files.readAllLines(target);
		for( String line : lines) {
			System.out.println(line);
		}
	} catch (IOException e) {
		System.out.println( "[에러]"+ e.getMessage());
	}

}
