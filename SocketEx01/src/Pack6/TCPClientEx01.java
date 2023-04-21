package Pack6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClientEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		Socket socket = null;
			
			
			while(true) {
			try {
				System.out.println("서버가 준비되엇습니다.");
				socket = serverSocket.accept();
				
					
				}
				
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				System.out.println("[에러]"+ e.getMessage());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("[에러]"+ e.getMessage());
			}finally {
				
				if( socket != null ) try { socket.close(); } catch(IOException e) {} ;
				
				
			}
	}

	private static void BufferedWriter(OutputStreamWriter outputStreamWriter) {
		// TODO Auto-generated method stub
		
	}

}
