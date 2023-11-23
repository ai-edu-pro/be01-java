//*
package day03_exception.ex01;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		System.out.print("x, y = ");
		int x, y, result = 0;
		
		try {
			x = new Scanner(System.in).nextInt();
			y = new Scanner(System.in).nextInt();
			
			result = x / y ;  //문제 발생 소지 있는 코드
			
		} catch (Exception e) {
//			System.out.println("0으로 나눌 수 없습니다.");  // user message
//			System.out.println(e.getMessage());
			e.printStackTrace();  // 
		} // try end
		
	}
}
//*/

/*
package day03_exception.ex01;

public class MainEntry {
	public static void main(String[] args) {
		int x = 30 , y = 0;
		int result = 0;
		
		if( y == 0 ) {
			System.out.println("0으로 나눌 수 없습니다.");
			return;
		} else {
			result = x / y;  // 예외발생
		}
		
		System.out.println(result);
		
	}
}
//*/


/*
package day03_exception.ex01;

public class MainEntry {
	public static void main(String[] args) {
		int x = 30 , y = 0;
		
		int result = x / y;
		
		System.out.println(result);
		
	}
}
//*/

/*
> Exception (예외처리)
 Java는 의무적(반드시)으로 예외처리를 해야하는 상황들이 있음.
 -- 네트워크, 데이터베이스(JDBC), Thread, IO(입출력), File,......

 형식>
   try {
	정상코드(또는 예외 발생 예측 코드);
  } catch(Excption e ) {
  	예외 발생시 처리할 코드 ;
  }

 1) try ~ catch : 직접처리  <--- 권장
 2) throws : 위임
 3) throw : 예외 던지기 

*/