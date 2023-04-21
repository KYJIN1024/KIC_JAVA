package pack3;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClientEx01 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Socket socket = null;
      
      BufferedWriter bw = null;
      
      System.out.println("서버와 연결을 시작합니다.");
      try {
         socket = new Socket("localhost", 7777);      //socket이 생기면서 accept부분(TCPserver의)에서 만난다.
         System.out.println("서버와 연결되었습니다.");
         
         bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
         
         //bw.write("안녕서버1"+System.lineSeparator());
         //bw.write("안녕서버2"+System.lineSeparator());
         //bw.write("안녕서버3"+System.lineSeparator());
         
         //전송프로토콜
         bw.write("안녕서버1:안녕서버2:안녕서버3:"+System.lineSeparator());
         
         System.out.println("전송이 완료되었습니다.");
      } catch (UnknownHostException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } finally {
         if(bw != null) try {bw.close();} catch(IOException e) {}
         if(socket != null) try {socket.close();} catch(IOException e) {}
      }
   }

}