
public class MainEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Person p1 = new Person();
		Person p1 = new Employee1();
//		Employee1 e1 = (Employee1)p1; //person을 통해서 임플로이를 만들엇기때문에 문법상 틀릴리지 않았지만 
//		e1.viewEmployee();
		
		System.out.println( p1 instanceof Person );  //true
		System.out.println( p1 instanceof Employee1 ); //false
		
		
		if( p1 instanceof Employee1) {
			Employee1 e1 = (Employee1)p1; //person을 통해서 임플로이를 만들엇기때문에 문법상 틀릴리지 않았지만 
			e1.viewEmployee();		
		} else {
			System.out.println(" 형변환 불가 ");
			//형변환에 대한 검사를 해줄수 있음
		}
	}

}
