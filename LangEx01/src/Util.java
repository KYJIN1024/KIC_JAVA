
public class Util {
	private String name;
  
	public Util(String name) {
		this.name = name;
	}
	
	public String capitalizeName() {
		String[ ] names = this.name.split(" ");

		for( int i=0; i<names.length; i++) {
			names[i] = names[i].substring(0,1).toUpperCase()
			+ names[i].substring( 1 );
		}
		return String.join(" ", names);
	} 
	

}
