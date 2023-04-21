package Pack5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;



public class TCPClientEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Socket socket = null;
		
			
			try {
				
				/* 시작단, 끝단 받아오기 */
				br = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("구구단을 시작합니다\n 시작단과 끝단을 입력해주세요.");
				System.out.print("시작단>");
				int startDan = Integer.parseInt(br.readLine());
				System.out.println("끝단>");
				int endDan = Integer.parseInt(br.readLine());
				if(startDan > endDan) {
					System.out.println("** 시작단이 끝단보다 큽니다.");
					System.out.println("구구단 클라이언트를 종료합니다.");
					return;
				}
				
				
				
				System.out.println("서버와 연결되었습니다. ");
				
				socket = new Socket("localhost", 7777);
				System.out.println("클라이언트가 연결되었습니다.");
				
				bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				
				JSONObject jsonObject = new JSONObject();
				jsonObject.put("startDan", startDan);
				jsonObject.put("endDan", endDan);

				JSONArray jsonArray = new JSONArray();
				jsonArray.add(jsonObject);

				bw.write(jsonArray.toJSONString() + System.lineSeparator());
				bw.flush();
				
				System.out.println("전송이 완료되엇습니다.");
				
				String gugudanJson = br.readLine();
				System.out.println("서버에서 보낸 메시지 : "+gugudanJson);
			
				JSONParser parser = new JSONParser();
				JSONObject object = (JSONObject)parser.parse(gugudanJson);
				JSONArray array = (JSONArray)object.get("gugudan");
				
				for(int i=0; i<array.size(); i++) {
					System.out.println(array.get(i));
				}
				
				
				
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				System.out.println("[에러]"+ e.getMessage());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("[에러]"+ e.getMessage());
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				
			}finally {
				if( bw != null ) try { bw.close(); } catch(IOException e) {} ;
				if( br != null ) try { br.close(); } catch(IOException e) {} ;
				
				
				if( socket != null ) try { socket.close(); } catch(IOException e) {} ;
				
				
			}
	}

}
