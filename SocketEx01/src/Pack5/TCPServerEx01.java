package Pack5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class TCPServerEx01 {

	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		System.out.println("---구구단 서버 ---");
		
		try {
			// 1포트는 1개의 프로그램만 사용가능
			serverSocket = new ServerSocket(7777);
			
			while(true) {
				System.out.println("서버가 준비되었습니다.");
				socket = serverSocket.accept();
				System.out.println("클라이언트에 연결되었습니다.");
				
			
			//클라이언트 메시지 읽어오기 
			
				br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "utf-8"));
				String clientJson = "";
				String line;
				while ((line = br.readLine()) != null) {
				    clientJson += line;
				}
			System.out.println("json: "+ clientJson);
			
			JSONParser parser = new JSONParser();
			JSONArray array = (JSONArray) parser.parse(clientJson);
			JSONObject object = (JSONObject)array.get(0);
			
			long startDan = (long)object.get("startDan");
			long endDan = (long)object.get("endDan");
			System.out.println("startDan :"+ startDan + ",endDan :" +endDan);
			
			
			String gugudanJson = "{\"gugudan\":[";
			for(int i=(int)startDan; i<=endDan; i++) {
				gugudanJson += "\"";
				for(int j=1; j<=10; j++) {
					gugudanJson += i+ "*" + j + "=" + i*j + "\t";
					if(j!=10) {
						gugudanJson += ",";
					}
				}
				
				gugudanJson += "\"";
				if(i!=endDan) {
					gugudanJson +=",";
				}
			}
				
				gugudanJson += "]}";
				System.out.println("구구단: "+ gugudanJson);
				
				/* 클라이언트에 구구단 전송 */
				bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), "utf-8"));
				bw.write(gugudanJson+System.getProperty("line.separator"));
				bw.flush();
			}
				
			} catch (UnknownHostException e) {
		         // TODO Auto-generated catch block
		         e.printStackTrace();
		      } catch (IOException e) {
		         // TODO Auto-generated catch block
		         e.printStackTrace();
		      } catch (Exception e) {
		            e.printStackTrace();
		        }  finally {
		         if(bw != null) try {bw.close();} catch(IOException e) {}
		         if(socket != null) try {socket.close();} catch(IOException e) {}
		      }
		   }

		}
					
			
			