import java.io.Serializable;

public class Person implements Serializable {  //직렬화처리

	private String name;
	private String phone;
	private String age;
	private transient String address; //직렬에서 제외
	
	public Person(String name2, String phone2, String age2, String address2) {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public String getPhone() {
		return phone;
	}
	public String getAge() {
		return age;
	}
	public String getAddress() {
		return address;
	}
	
	
	
	
}
