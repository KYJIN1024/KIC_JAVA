import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LottoStaticEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			br = new BufferedReader(new FileReader("./lotto(1~1059).csv"));
			bw = new BufferedWriter(new FileWriter("./lottostaticresult.txt"));
			
			String str ="";
			int[] countPerNum = new int[45];
			while((str = br.readLine())!=null) {
//				System.out.println(str);
			String[] arrZipcode = str.split(",");
//			System.out.println(arrZipcode[2]);
				for(int i=2; i<=8; i++) {
					int num = Integer.parseInt(arrZipcode[i]);
					countPerNum[num -1]++;
				}
			}
		for(int j = 1; j <=45; j++) {
			System.out.println(j+ "나온 횟수: "+ countPerNum[j-1]);
		bw.write(j + "나온횟수:" + countPerNum[j-1]+"\n");
		}	
		} catch (FileNotFoundException e) {
		System.out.println("[에러] : "+e.getMessage());
		} catch (IOException e) {
		System.out.println("[에러] : "+e.getMessage());
		} finally {
			if(bw !=null) try {bw.close();} catch(IOException e) {}
			
		}
	}
}

