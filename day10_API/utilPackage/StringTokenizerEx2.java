package day10_API.utilPackage;

import java.util.StringTokenizer;

public class StringTokenizerEx2 {
	public static void main(String[] args) {
		
		StringTokenizer token = new StringTokenizer("사과=5|초코렛=3|샴페인=1", "=|", true);
		
		while(token.hasMoreTokens()) {  // 다음 요수가 있느냐?
//			System.out.println(token.nextToken());
			
			String str = token.nextToken();
			
			if( str.equals("=")) System.out.println("\t");
			else if( str.equals("|")) System.out.println("\n");
			else System.out.println(str);
		}
		
		
	}
}
