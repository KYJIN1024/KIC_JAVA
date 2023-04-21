import java.io.BufferedReader; 
import java.io.BufferedWriter; 
import java.io.FileNotFoundException; 
import java.io.FileReader; 
import java.io.FileWriter; 
import java.io.IOException; 
  
 public class LottoEx02 { 
  
         public static void main(String[] args) { 
                 // TODO Auto-generated method stub 
                 BufferedReader br = null; 
                 BufferedWriter bw = null; 
                  
                 try { 
                         br = new BufferedReader(new FileReader("./lotto(1~1059).csv")); 
                         bw = new BufferedWriter(new FileWriter("./lottoWrite.txt")); 
                          
 //                문자열 선언 
                         String str =""; 
 //                각 숫자별 나온 횟수를 저장할 배열 
                         int[] countPerNum = new int[45]; 
 //                한줄씩 읽기 
                         while((str = br.readLine()) != null)        { 
 //                        System.out.println(str); 
 //                        "," 기준으로 선언한 문자열 나누면서 arrZipcode 생성 
                                 String[] arrZipcode = str.split(","); 
 //                        System.out.println(arrZipcode[2]);                         
 //                        배열 2~8번쨰의 숫자가 1~45와 동일할 시 값 누적 
                                 for (int i = 2; i <= 8; i++) { 
                                 int num = Integer.parseInt(arrZipcode[i]); 
 //                        해당 숫자와 일치하는 경우 해당 숫자의 인덱스에 1을 증가시킴 
                                 countPerNum[num - 1]++; 
                             }         
                         } 
                         for (int j = 1; j <= 45; j++) { 
                             System.out.println(j + " 나온 횟수: " + countPerNum[j - 1]); 
                             bw.write(j + " 나온 횟수: " + countPerNum[j - 1] + "\n"); 
                         } 
                 } catch (NumberFormatException e) { 
                         // TODO Auto-generated catch block 
                         System.out.println("[에러] : " + e.getMessage()); 
                 } catch (FileNotFoundException e) { 
                         // TODO Auto-generated catch block 
                         System.out.println("[에러] : " + e.getMessage()); 
                 } catch (IOException e) { 
                         // TODO Auto-generated catch block 
                         System.out.println("[에러] : " + e.getMessage()); 
                 }        finally        { 
                         if(bw != null) try { bw.close(); } catch(IOException e) {} 
                 } 
         } 
 