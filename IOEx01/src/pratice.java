// 다시보고 순서를 생각해보고 외울수 있을만큼 다시 코딩 해보기 

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class pratice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String keyword = "";
       
        while(keyword.length()<2) {
        	System.out.println("검색할 키워드를 2자이상 입력하세요:");
        	keyword = scanner.nextLine();
        }
        		
        scanner.close();

        String contactsFile = "./zipcode_seoul_utf8_type2.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(contactsFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.contains(keyword)) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println("[에러] " + e.getMessage());
        }
    }
}
