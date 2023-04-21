package pack7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClientEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Socket socket = null;
			
			BufferedWriter bw = null;
			BufferedReader br = null;
			
			try {
	
				System.out.println("서버와 연결이 시작되었습니다. ");
				
				socket = new Socket("localhost", 7777);
				System.out.println("서버와 연결되었습니다.");
				
				bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				
				bw.write("hello"+System.lineSeparator());
				bw.flush();
				
				System.out.println("전송이 완료되엇습니다.");
				
				String msg = br.readLine();
				System.out.println("메시지:"+ msg );
				
				
				
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				System.out.println("[에러]"+ e.getMessage());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("[에러]"+ e.getMessage());
			}finally {
				if( bw != null ) try { bw.close(); } catch(IOException e) {} ;
				if( br != null ) try { br.close(); } catch(IOException e) {} ;
				
				
				if( socket != null ) try { socket.close(); } catch(IOException e) {} ;
				
				
			}
	}

}