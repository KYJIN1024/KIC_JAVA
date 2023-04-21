package pack9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ZipcodeClientEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socket socket = null;   // 소켓을 생성
		
		BufferedWriter bw = null;
		BufferedReader br = null;
		
		try {
			System.out.println( "서버와 연결을 시작합니다." );

			socket = new Socket( "localhost", 8888 );   // 포트 7777의 로컬서버에 연결
			System.out.println( "서버와 연결되었습니다.");
			
			bw = new BufferedWriter( new OutputStreamWriter( socket.getOutputStream(), "utf-8" ) );     //  클라이언트에서 서버로 데이터를 전송하기 위한 BufferedWriter 객체와 서버에서 클라이언트로 데이터를 수신하기 위한 BufferedReader 객체를 생성
			br = new BufferedReader( new InputStreamReader( socket.getInputStream(), "utf-8" ) );
			
			bw.write( "신사" + System.lineSeparator() );   // 
			bw.flush();
			
			System.out.println( "전송이 완료되었습니다." );
			
			String msg = br.readLine();
			String[] addresses = msg.split( ":" );
			for( String address : addresses ) {
				System.out.println( address );
			}
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			System.out.println( "[에러] " + e.getMessage() );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println( "[에러] " + e.getMessage() );
		} finally {
			if( bw != null ) try { bw.close(); } catch( IOException e ) {}
			if( br != null ) try { br.close(); } catch( IOException e ) {}
			
			if( socket != null ) try { socket.close(); } catch( IOException e) {}
		}
	}
}