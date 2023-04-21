package Pack1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerEx01 {

	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			// 1포트는 1개의 프로그램만 사용가능
			serverSocket = new ServerSocket(7777);
			System.out.println( "서버가 준비되었습니다." );
			
			socket = serverSocket.accept();  //대기상태
			System.out.println("클라이언트가 연결되었습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if( socket != null ) try { socket.close(); } catch(IOException e) {} ;
			if( serverSocket != null ) try { serverSocket.close(); } catch(IOException e) {} ;
		}
		
	}
}
// Address already in use: bind   이미 명령프롬프트에서 포트를 사용할 경우 에러가 출력됨

