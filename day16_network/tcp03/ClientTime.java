package day16_network.tcp03;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.Date;

public class ClientTime {
	public static void main(String[] args) {
		String serverIP = "192.168.0.48";
		int port = 7000;
		Date date = null;
		
		try {
			Socket s = new Socket(serverIP, port);
			InputStream is = s.getInputStream();
			ObjectInputStream ois = new ObjectInputStream(is);
			
			System.out.println("Server측 날짜/시간 확인.....여기는 클라이언트 입니다. \n");
			date = (Date)ois.readObject();
//			System.out.println("현재 서버측 시간 : " + new String(date.toString()) + " 입니다.");
			System.out.println("현재 서버측 시간 : " + date.toString() + " 입니다.");
			ois.close();
			s.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
				
	}
}
