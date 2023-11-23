//*
package day03_control.Switch;

import java.util.Scanner;

public class SwitchMain {
	public static void main(String[] args) {
		System.out.println("도시를 선택하세요 (s, d, b, j) = ");
		
//		char ch = new Scanner(System.in).next().charAt(0);  // "s", "j" <====  s\0,  j\0
		String ch = new Scanner(System.in).next();  // "s"  s\0
		
		switch( ch ) {  // 조건 - 문자형, 정수형(long형 제외), 실수형 안됨
			case "s" : System.out.print("서울 "); break;
			case "d" : System.out.print("대구 "); break;
			case "b" : System.out.print("부산 "); break;
			case "j" : System.out.print("제주 "); break;
			default : 
				System.out.println("잘못 선택하셨습니다. s, d, b, j 중에서만 선택하세요.... ");
				System.exit(0);  // 프로그램 강제 종료
		}  // switch end
		
		System.out.println("를(을) 선택하셨습니다.");
	}
}
//*/

/*
package day03_control.Switch;

import java.util.Scanner;

public class SwitchMain {
	public static void main(String[] args) {
		System.out.println("도시를 선택하세요 (s, d, b, j) = ");
		
		char ch = new Scanner(System.in).next().charAt(0);  // "s", "j" <====  s\0,  j\0
		
		
		switch( ch ) {  // 조건 - 문자형, 정수형(long형 제외), 실수형 안됨
			case 's' : System.out.print("서울 "); break;
			case 'd' : System.out.print("대구 "); break;
			case 'b' : System.out.print("부산 "); break;
			case 'j' : System.out.print("제주 "); break;
			default : 
				System.out.println("잘못 선택하셨습니다. s, d, b, j 중에서만 선택하세요.... ");
				System.exit(0);  // 프로그램 강제 종료
		}  // switch end
		
		System.out.println("를(을) 선택하셨습니다.");
	}
}
//*/