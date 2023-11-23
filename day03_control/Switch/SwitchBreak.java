//*
package day03_control.Switch;

import java.util.Scanner;

public class SwitchBreak {
	public static void main(String[] args) {
		System.out.println("point = ");
		
		int point = new Scanner(System.in).nextInt();  
		
		switch( point ) {  // 조건 - 문자형, 정수형(long형 제외), 실수형 안됨
			case 1 : System.out.print("집 "); //break;
			case 2 : System.out.print("피아노 "); //break;
			case 3 : System.out.print("우산 "); //break;
		
		}  // switch end
		
		System.out.println("상품에 당첨 되셨습니다. 축하합니다.~~~~^^");
	}
}
//*/


/*
package day03_control.Switch;

import java.util.Scanner;

public class SwitchBreak {
	public static void main(String[] args) {
		System.out.println("도시를 선택하세요 (s, d, b, j) = ");
		
		String ch = new Scanner(System.in).next();  
		
		switch( ch ) {  // 조건 - 문자형, 정수형(long형 제외), 실수형 안됨
			case "s" : System.out.print("서울 "); //break;
			case "d" : System.out.print("대구 "); //break;
			case "b" : System.out.print("부산 "); //break;
			case "j" : System.out.print("제주 "); //break;
		
		}  // switch end
		
		System.out.println("를(을) 선택하셨습니다.");
	}
}
//*/
