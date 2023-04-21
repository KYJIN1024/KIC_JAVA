import java.util.Scanner;
//완성하기
public class ScannerTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner( System.in );
		
		while(true) {
			System.out.print("정확한 숫자를 입력해주세요.");
			String input = scanner.nextLine();
		
		
		if(input.equalsignoreCase("q")) {
			System.out.println("프로그램을 종료합니다.");
			break;
		}
		
		try {
			int dan = Integer.parseInt(input);
		}
		
		System.out.println("구구단" + dan +":");
		for(int i=1; i<=9; i++) {
			System.out.println(dan + "x" + i + " = "+(dan * i));
		}
	} catch (NumberFormatException e) {
		System.out.println("값이 유효하지않습니다.");
	  }
	}

	scanner.close();
	}
	}
 
