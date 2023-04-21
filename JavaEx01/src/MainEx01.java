import pack1.Student2;

public class MainEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Hello Eclipse ");
		System.out.println(" Hello Eclipse ");
		
		Student1 stu1 = new Student1();
		stu1.hakbun = "1001";
		stu1.name = "홍길동";
		System.out.println (stu1.hakbun);
		System.out.println (stu1.name);
		
		/*
		pack1.Student2 stu2 = new pack1.Student2();
		stu2.hakbun = "1001";
		stu2.name = "홍길동";
		System.out.println (stu2.hakbun);
		System.out.println (stu2.name);
		*/
		
		Student2 stu2 = new Student2();
		stu2.hakbun = "1001";
		stu2.name = "홍길동";
		System.out.println (stu2.hakbun);
		System.out.println (stu2.name);
			
	}
 /*
run as 를 누르면 컴파일이 자동으로 되어 bin폴더에 저장되고 실행됨
이클립스오류로 인해 컴파일 과정이 제대로 수행되지 않으면 결과값이 달라질수 있음
그때는 반드시 cmd사용하여 컴파일 하여 결과값을 체크 해볼것!

ctrl+space로 클래스등을 불러올때 클래스명과 패키지명을 함께 확인하여 불러올것
*/	

}
