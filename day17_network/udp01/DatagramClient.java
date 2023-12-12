package day17_network.udp01;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class DatagramClient {
	public static void main(String[] args) {
		DatagramPacket dp = null;
		DatagramSocket ds = null;
		DataInputStream dis = null;
		BufferedReader br = null;
		
		int port = 8000;
		String str;
		byte[] buffer = null;
		
		try {
			System.out.println("@@@ UDP file Client @@@");
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("전송 대상 (Server IP) = ");
			String ipAddress = br.readLine(); // 127.0.0.1 or 192.168.0.48
			System.out.println("전송 파일(파일명.확장자) = " );
			String fileName = br.readLine();
			
			File file = new File(fileName);
			
			if( !file.exists() ) {
				System.out.println("파일이 존재하지 않습니다.");
				System.exit(-1);
			}
			
			str = "start";
			buffer = str.getBytes();
			ds = new DatagramSocket();
			InetAddress iaddress = InetAddress.getByName(ipAddress); // 문자열 ip주소를 실제 ip 주소로....
			dp = new DatagramPacket(buffer, buffer.length, iaddress, port);  // 크기, 버퍼크기, 서버아이피, 포트번호
			ds.send(dp);  // 송신....
			
			dis = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
			
			buffer = new byte[65536];
			
			while(true) {
				int count = dis.read(buffer, 0, buffer.length);
				
				if( count == -1 ) break;
				
				dp = new DatagramPacket(buffer, count, iaddress, port);
				ds.send(dp);
			} // while end
			
			str = "end";
			buffer = str.getBytes();
			
			dp = new DatagramPacket(buffer, buffer.length, iaddress, port);
			ds.send(dp);
			
		}  catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {	dis.close(); br.close(); 	} catch (IOException e) {		e.printStackTrace();	} // try end
		}
	}
}










