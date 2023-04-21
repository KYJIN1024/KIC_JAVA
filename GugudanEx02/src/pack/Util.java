package pack;

public class Util { 
	public void viewGugudan( int startDan , int endDan) {
		for( int dan = startDan = 1; dan <= endDan; dan++) {
			System.out.println(dan+"단");
			for( int i=1; i<=9; i++) {
				System.out.println(dan +"*" +i +"=" + (dan*i));
			}
			System.out.println();
		} 
	}

}
