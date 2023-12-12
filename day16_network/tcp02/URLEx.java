package day16_network.tcp02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLEx {
	public static void main(String[] args)
			
			throws MalformedURLException, IOException {
		
//		URL goolgle = new URL("https://www.en-core.com");
//		URL goolgle = new URL("https://www.google.com");
		URL naver = new URL("https://www.naver.com/");
		
		// System.in  : 표준 입력 - 키보드로부터.....
		BufferedReader br = new BufferedReader(new InputStreamReader(naver.openStream())); //
		
		String inputLine;
		while( (inputLine = br.readLine() ) != null ) {
			System.out.println(inputLine);
		}
		
		br.close();
	}
}
