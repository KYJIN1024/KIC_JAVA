import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Lottostatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;
		BufferedWriter bw = null;
		int[] counts = new int[45];
		
		try {
			br = new BufferedReader(new FileReader("D:\\JAVA_LAB\\pratice\\lotto(1~1059).csv"));
			bw = new BufferedWriter(new FileWriter("D:\\JAVA_LAB\\pratice\\lottostatistics.txt"));
			String str = "";
			while((str = br.readLine())!=null) {
				str = str.replace(".","");
				String[] arr = str.split(",");
				
				for(int i = 0; i<arr.length; i++) {
					int number = Integer.parseInt(arr[i]);
					if(number >= 1 && number <=45) {
						counts[number -1]++;
					}
				}
			}
			
			for(int i=0; i< counts.length; i++) {
				bw.write((i+1)+": " + counts[i] + "\n");
			}
			System.out.println("통계완료");
			
			
		} catch (FileNotFoundException e) {
			System.out.println("[ERROR]"+e.getMessage());
		} catch (IOException e) {
			System.out.println("[ERROR]"+e.getMessage());
		} finally {
			{ try { if (br != null) br.close(); 
			if (bw != null) bw.close(); 
			} catch (IOException e) { System.err.println("[ERROR]"+e.getMessage());
		}
			
		}
		}
	}

}
