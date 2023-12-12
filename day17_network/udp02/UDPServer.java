package day17_network.udp02;
import java.net.*;
import java.io.*;

public class UDPServer {
	
	private final static int PACKTSIZE = 100;
	
	public static void main(String[] args) {
			if( args.length != 1 ) {
				System.out.println("using : DatagramServer port number : ");
				return;
			}
			
			try {
				int port = Integer.parseInt(args[0]);
				DatagramSocket ds = new DatagramSocket(port);
				System.out.println("The Server is ready........................................");
				
				for( ; ; ) {  // 무한루프
					DatagramPacket  dp = new DatagramPacket(new byte[PACKTSIZE], PACKTSIZE);
					ds.receive(dp);
					System.out.println(dp.getAddress() + "  " + dp.getPort() + " : " + new String(dp.getData()));
					//ds.send(dp);
				} // for end
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
}




