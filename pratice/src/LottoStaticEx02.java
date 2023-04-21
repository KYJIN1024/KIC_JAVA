import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LottoStaticEx02 {

	public static void main(String[] args) {
		// 변수 선언
		BufferedReader br = null;
		BufferedWriter bw = null;
		// 로또 번호(1~45) 저장을 위한 배열을 선언하고 초기화
		int[] counts = new int[45];
		
		try {
		// 입력파일 읽기 위한 BufferedReader 생성
			br = new BufferedReader(new FileReader("D:\\JAVA_LAB\\pratice\\lotto(1~1059).csv"));
		// 출력파일 작성을 위한 BufferedWrtier 생성
			bw = new BufferedWriter(new FileWriter("D:\\JAVA_LAB\\pratice\\lottostatistics.txt"));
		// 입력파일에서 한줄씩 읽어올 변수 선언	/ 입력파일의 끝에 도달할때까지 한줄씩 읽어옴	
			String str = "";
			while((str = br.readLine())!=null) {
		// 읽어온 줄에 마침표를 삭제 / 콤마[,]를 기준으로 문자열을 분리하여 배열에 저장
				str = str.replace(".","");
				String[] arr = str.split(",");
		// 분리된 문자열 배열을 순회	(향상된for문 사용)	
				for(String s: arr) {
					int number = Integer.parseInt(s);  //문자열을 정수로 변환함
					if(number >= 1 && number <= 45) {  // 숫자가 1~45의 경우에만 카운트를 증가시킴
						counts[number -1]++;
//				 for(int i = 0; i<arr.length; i++) {
//					int number = Integer.parseInt(arr[i]);
//					if(number >= 1 && number <=45) {
//						counts[number -1]++;     
					}
				}
			}
			// 배열을 순회하고 결과를 텍스트 파일에 작성 합니다.
			for(int i=0; i< counts.length; i++) {
				bw.write("번호"+(i+1)+"번: " + counts[i] + "회 \n");
			}
			System.out.println("통계완료");
			
		//예외처리	
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
