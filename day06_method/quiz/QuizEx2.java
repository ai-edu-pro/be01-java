package day06_method.quiz;

import java.util.Scanner;

public class QuizEx2 {
	
	// 사칙연산(+,-,*,/) 함수 - 2개 리턴타입 매개변수 있는, 2개는 리턴타입 아닌 상태 
	// plus(+), sub(-), mul(*), div( / ) <-- 예외처리  
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 0; 
		
		while(true) {  // 무한루프 
			System.out.println("integer data input(1,2,3,4,0) = ");
			int choice = sc.nextInt();
			
			switch (choice) {
				case 1: System.out.println("덧셈 함수 호출: x, y, z = ");
						result = plus(sc.nextInt(),sc.nextInt(), sc.nextInt());
						System.out.println("plus = "+ result);
						break;
						
				case 2: System.out.println("뺄셈 함수 호출: x, y = ");
						sub(sc.nextInt(),sc.nextInt());
						break;
				case 3: System.out.println("나눗셈 함수 호출: x, y = ");
						div(sc.nextInt(),sc.nextInt());
						break;
				case 4: System.out.println("곱셈 함수 호출: x, y = ");
						result = mul(sc.nextInt(),sc.nextInt());
						System.out.println("mul = "+ result);
						break;
				case 0 : System.out.println("프로그램 종료합니다.");
						System.exit(0);  // 탈출구문
						
				default: System.out.println("없는 선택 번호이거나 문자입니다. 숫자(1,2,3,4,0)중에서 넣어주세요!! ");
						System.exit(0);
			} // switch end
			
			System.out.println("프로그램 강제 종료 되었습니다.");
		} // while end
		
	} // main end
	
	public static int plus(int x, int y, int z) {
		int hap = x + y + z;
		return  hap;   //x + y;
	}
	
	public static void sub(int x, int y) {
		if( x > y ) System.out.println(x+"-"+y+"="+(x-y));
		else System.out.println(y+"-"+x+"="+(y-x));
	}
	
	public static void div(int x, int y) {
		if( y == 0 ) {
			System.out.println("0으로 나눌 수 없습니다.");
			return;
		}
		System.out.println(x+" / "+y+"=" +( x / y) );
	}
	
	public static int mul(int x, int y) {
		return x * y; 
	}
}









