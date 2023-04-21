package ch15.processing.object;

import java.io.Serializable;

public class Person implements Serializable {
	private static final long serialVersionUID =
			3075830113306886480L;
	
	private String name;
	private int age;
	private transient String ssn;
	private LoginInfo IInfo;
	
	public Person(String name, int age,
				String ssn, String userId, String userPass) {
		this.name = name;
		this.age = age;
		this.ssn = ssn;
		this.IInfo = new LoginInfo(userId, userPass);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + 
				", ssn=" + ssn + ", IInfo= " + IInfo + "]";
	}
}

	class LoginInfo implements Serializable {
		private static final long serialVersionUID = 1L;
		private String userid;
		private transient String userPass;
		
		public LoginInfo(String userid, String userPass) {
			super();
			this.userid = userid;
			this.userPass = userPass;
		}
		
		public String toString() {
			return "LoginInfo [userid=" + userid + ", userPass=" + userPass + "]";
		}
		
	}



