import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetworkEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//network - java.net
		//ip정보 <- 도메인
		
		InetAddress inetAddress1;
		try {
			inetAddress1 = InetAddress.getByName("www.daum.net");
		System.out.println(inetAddress1.getHostAddress());
		System.out.println(inetAddress1.getHostName());
		
		InetAddress[] inetAddresses 
		= InetAddress.getAllByName("www.daum.net");
		
		for(InetAddress inetAddress: inetAddresses) {
			System.out.println(inetAddress.getHostAddress());
		}
		
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
