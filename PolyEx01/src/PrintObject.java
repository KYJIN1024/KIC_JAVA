
class Userinfo {
	String name = "홍길동";
	
	public String toString() {
		return "이름: " + this.name;
	}
}

class MemberInfo extends PrintObject{
	String grade = "정회원";
	
	@Override
	public String toString() {
		return "MemberInfo [grade=" + grade + "]";
	}
}

public class PrintObject{
	
	public static void main(String[] args) {
		Object member = new MemberInfo();
		System.out.print("객체 정보: "+ member);
	}
}