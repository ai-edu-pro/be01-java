package day13.IO.ex02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedReaderEx {
	public static void main(String[] args) throws IOException  {  // 예외처리 위임 - JVM
		/*
		InputStream is  = System.in;  // 표준 입력
		Reader reader = new InputStreamReader(is);	
		BufferedReader br = new BufferedReader(reader);
		*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("charator input = ");
		int str = Integer.parseInt(br.readLine());  // 예외발생, 여러개 데이터 읽기
		int str2 = Integer.parseInt(br.readLine());
		
//		String str = br.readLine();  // 예외발생, 여러개 데이터 읽기
//		String str2 = br.readLine();
//		
//		int su1 = Integer.parseInt(str);
//		int su2 = Integer.parseInt(str2);
		
//		System.out.println(su1 + su2);
		System.out.println(str + str2);
	}
}
