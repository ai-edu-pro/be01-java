package day17_network.udp02;
import java.net.*;
import java.io.*;

public class UDPClient {
	
	private final static int PACKTSIZE = 100;
	
	public static void main(String[] args) {
		
		if( args.length != 2 ) {
			System.out.println("using : DatagramServer host ip, port number : ");
			return;
		} // if end
		
		DatagramSocket ds = null;
		
		try {
			InetAddress  host = InetAddress.getByName(args[0]);  // server ip
			int port = Integer.parseInt(args[1]);  // server port number
			
			ds = new DatagramSocket();
			byte[] data = "Hello Server kosta160 UDP test".getBytes();
			DatagramPacket dp = new DatagramPacket(data, data.length, host, port);
			
			ds.send(dp);
			
			ds.setSoTimeout( 2000 );  // 2초 
			dp.setData(new byte[PACKTSIZE]);
			
			System.out.println(new String(dp.getData()));
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if( ds != null ) ds.close();
		} // end try
	}
	
}


