
public class MainEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Employee1();
		Person p2 = new Employee2();
		
		// 다형
		// Person salary(x) - Employee salary가  호출됨
		p1.salary();
		p2.salary();
		
		System.out.println( p1 instanceof Person );
		System.out.println( p1 instanceof Employee1 );
		System.out.println( p1 instanceof Employee2 );
		System.out.println( p1 instanceof Object );
	}

}
