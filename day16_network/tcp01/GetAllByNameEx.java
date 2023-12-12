package day16_network.tcp01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;

public class GetAllByNameEx {
	public static void main(String[] args) {
		
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		String strUrl = null;
		InetAddress[]  address;
		
		System.out.println("site address = ");
		try {
			strUrl = br.readLine();  // 예외발생
			address = InetAddress.getAllByName(strUrl);  // 예외발생
			
			for (int i = 0; i < address.length; i++) {  // 127.0.0.1   or   192.168.0.48
				System.out.println(address[i]);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
