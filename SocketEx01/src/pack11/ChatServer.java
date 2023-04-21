package pack11;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;

public class ChatServer {
	
	//채팅룸
    private HashMap<String, OutputStream> clients;

    public static void main(String[] args) {
        new ChatServer().start();
    }

    public ChatServer() {
        clients = new HashMap<String, OutputStream>();
    }

    public void start() {
        ServerSocket serverSocket = null;
        Socket socket = null;
        try {
            serverSocket = new ServerSocket(8888);  
            System.out.println("서버가 시작되었습니다.");
            while (true) {
                socket = serverSocket.accept();
                System.out.println("[" + socket.getInetAddress() + " : " + socket.getPort() + "]" + "에서 접속하였습니다.");
                // 
                // 클라이언트 접속되면 소켓을 가지 스레드 생성
                ServerReceiver thread = new ServerReceiver(socket);
                thread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sendToAll(String msg) {
        Iterator<String> it = clients.keySet().iterator();
        while (it.hasNext()) {
            try {
                DataOutputStream out = (DataOutputStream) clients.get(it.next());
                out.writeUTF(msg);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    class ServerReceiver extends Thread {
        private Socket socket; 
        private DataInputStream in;
        private DataOutputStream out;

        public ServerReceiver(Socket socket) {
            this.socket = socket;
            try {
                in = new DataInputStream(socket.getInputStream());
                out = new DataOutputStream(socket.getOutputStream());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void run() {
            String name = "";
            try {
                name = in.readUTF();
                // 접속해 있는 전체에게 메시지 전송 
                sendToAll("#" + name + "님이 들어오셨습니다.");
                // 나를 채팅룸  등록
                clients.put(name, out);
                System.out.println("현재 서버접속자 수는 " + clients.size() + "입니다.");
                
                // 다음 전송 메시지 대기 
                while (in != null) {
                    sendToAll(in.readUTF());
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
            	// 방에서 나가기
                sendToAll("#" + name + "님이 나가셨습니다.");
                clients.remove(name);
                
                
                System.out.println("[" + socket.getInetAddress() + " : " + socket.getPort() + "]" + " 에서 접속을 종료하였습니다.");
                System.out.println("현재 서버접속자 수는 " + clients.size() + " 입니다.");
            }
        }
    }
}