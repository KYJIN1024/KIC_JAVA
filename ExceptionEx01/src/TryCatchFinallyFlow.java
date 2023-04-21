import java.util.Random;

public class TryCatchFinallyFlow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = new Random().nextInt(2);
		try {
			System.out.println("code 1. num:" + num); // 무작위로 생성된 num 값을 출력
			int i = 1 / num;
			System.out.println("code 2 - 예외없음 "); //num이 1이면, 1 / num 계산이 정상적으로 이루어지고 "code 2 - 예외없음"이 출력
			return;
		} catch (ArithmeticException e) {
			System.out.println("code 3 - 예외 처리 완료"); //num이 0이면, 1 / num 계산에서 ArithmeticException이 발생하며, "code 3 - 예외 처리 완료"가 출력
		} finally {
			System.out.println("code 4 - 언제나 실행"); // finally 블록은 예외 발생 여부와 관계없이 항상 실행
		}
		System.out.println(" code 5 ");
		
	}

}
