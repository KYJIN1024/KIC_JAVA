package Pack6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerEx01 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      ServerSocket serverSocket = null;   
      Socket socket = null;
      
      BufferedReader br = null;
      
      try {
         //1개의 포트는 1개의 프로그램만 사용가능
         serverSocket = new ServerSocket(7777);      //7777서버소켓을 만들라는 의미
         System.out.println("서버가 준비되었습니다.");
         
         socket = serverSocket.accept();         //accept를 리턴한게 server의 socket 이다.   
         System.out.println("클라이언트가 연결되었습니다.");
         
         br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
         
         
         //System.out.println("메시지: "+ br.readLine());
         
         String[] arrMsg = br.readLine().split( ":" );
         for ( String msg : arrMsg) {
        	 System.out.println(msg);
         }
         
         
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } finally {   //끝났으면 닫아줘야한다.
         if(br != null) try {br.close();} catch(IOException e) {}
         
         if(socket != null) try {socket.close();} catch(IOException e) {}
         if(serverSocket != null) try {serverSocket.close();} catch(IOException e) {}
      }
   }

}