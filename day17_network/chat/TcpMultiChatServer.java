package day17_network.chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

// collection, thread, io, basic java
public class TcpMultiChatServer {  // Outer class
	HashMap  clients ;  // key, value
	
	public TcpMultiChatServer() {  // constructor method
		clients = new HashMap();  // HashMap 객체 생성
		Collections.synchronizedMap(clients);  // 동기화
	}
	
	public void start() {
		ServerSocket ss = null;  // server socket 1
		Socket s = null;  // client socket 2
		
		try {
			ss = new ServerSocket(7777);
			System.out.println("서버 시작 되었습니다. 채팅 준비 완료!");
			
			
			while(true) {
				s = ss.accept(); // 응답대기, 클라이언트 소켓
				System.out.println("["+s.getInetAddress()+":"+s.getPort()+"] 에서 접속하셨습니다.");
				ServerReceiver thread = new ServerReceiver(s);  // user class
				thread.start(); 
			}
		} catch (Exception e) {		e.printStackTrace();		}
		
	}  // user method , start() end
	
	public void sendToAll(String msg) {
		Iterator  it = clients.keySet().iterator(); // key 값 출력
		
		while( it.hasNext() ) {
			try {
				DataOutputStream dos = (DataOutputStream)clients.get(it.next());  // 해당 키 값으로 value 값 출력
//				System.out.println("dos.toString() : " + dos.toString()); 
				dos.writeUTF(msg);
				
			} catch (Exception e) {		e.printStackTrace();		}
		}
	} // sendToAll end
	
	class ServerReceiver extends Thread {  // Inner Class
		Socket s ;
		DataInputStream  dis;   // readXXX(); - XXX : 자료형
		DataOutputStream  dos;  // writeXXX();  
		
		public ServerReceiver(Socket s) {
			this.s = s;
			try {
				dis = new DataInputStream(s.getInputStream()); // 네트워크를 통해서 읽기
				dos = new DataOutputStream(s.getOutputStream());  // 네트워크를 통해서 쓰기
			} catch (Exception e) {		e.printStackTrace();		}
		}

		@Override
		public void run() {  // 스레드 실행부(구현부)
			String name = "";
			try {
				name = dis.readUTF();
				sendToAll("#"+name+" 님이 입장하셨습니다.");
				
//				System.out.println(dos.toString().hashCode());
				clients.put(name, dos); // HashMap 넣기
				System.out.println("현재 서버 접속자 수는 : " + clients.size() + " 입니다."); // 접속자 수를 확인
				
				while( dis != null) {
					sendToAll(dis.readUTF());
				}
				
			} catch (Exception e) { e.printStackTrace();
			} finally {
				sendToAll("#"+ name+" 님이 나가셨습니다.");
				clients.remove(name); // 접속자 수 제거하기
				System.out.println("["+s.getInetAddress()+":"+s.getPort()+"] 에서 접속 종료 하셨습니다.");
				System.out.println("현재 서버 접속자 수는 : " + clients.size() + " 입니다.");
			}
			
		} // run() end
		
	} // ServerReceiver class end
	
	public static void main(String[] args) {
		new TcpMultiChatServer().start();
	}
}









