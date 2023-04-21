package Pack1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClientEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Socket socket = null;
			
			
			BufferedReader bw = null;
			
			
			try {
				
				
				socket = new Socket("localhost", 7777);
				System.out.println("서버와 연결되었습니다. ");
				
				socket = serverSocket.accept();
				System.out.println("클라이언트가 연결되었습니다.");
				
				BufferedReader(new inputStreamreader(socket.getOutputStream()));
				bw.write("Hello Client" + System.lineSeparator());
				System.out.println("전송이 완료되엇습니다.");
				
				
				
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				System.out.println("[에러]"+ e.getMessage());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("[에러]"+ e.getMessage());
			}finally {
				if( bw != null ) try { bw.close(); } catch(IOException e) {} ;
				if( socket != null ) try { socket.close(); } catch(IOException e) {} ;
				if( serverSocket != null ) try { serverSocket.close(); } catch(IOException e) {} ;
				
			}
	}

	private static void BufferedWriter(OutputStreamWriter outputStreamWriter) {
		// TODO Auto-generated method stub
		
	}

}
