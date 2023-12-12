package day17_network.tcp05;

import java.io.*;
import java.net.*;

public class ServerChat {
	public static void main(String[] args) throws IOException {
			int port = 8000;
			ServerSocket  ss = new ServerSocket(port);  // socket 1
			System.out.println("chat server start");
			
			while( true ) {
				Socket s = ss.accept();  // socket 2
				
//				InputStream is = s.getInputStream();  // 네트워크를 통해 읽기
				BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
				PrintStream  ps = new PrintStream(System.out);
				
				ps.print( s.getInetAddress().getHostAddress() );  //
				String str = br.readLine();
				byte[] buffer = str.getBytes("euc-kr");   // or UTF-8
				String message = new String(buffer, "euc-kr");
				
				ps.print("       : 에서 수신 메세지 =====>  " + message);
				
				br.close();
				s.close();
			} // while end
	}
}





