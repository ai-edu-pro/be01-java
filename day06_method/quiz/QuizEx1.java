package day06_method.quiz;

import java.util.Scanner;

public class QuizEx1 {
	//문제1] info() { 이름, 연락, 주소 출력 함수 }
	public static void info() {
		Scanner sc = new Scanner(System.in);
		System.out.println("name, phone, address = ");
		String name = sc.next();
		String phone = sc.next();
		String address = sc.next();
		System.out.println(name+"님의 연락처 : "+phone+", 주소는 : "+ address+"에 살고 계시군요.");
	}
	//문제2] abs(int x) { 절대값 구하는 함수   }
	public static void abs(int x) {
		if( x < 0 ) x = -x;
		else x = x;
		System.out.println("절대값 : " + x );
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		info();
		System.out.println("정수 데이터 입력 : ");
		int su = sc.nextInt();
		abs(su);
		max();
		System.out.println("2수 입력 : ");
		max(sc.nextInt(), sc.nextInt());
	}
	
	//문제3] max(){  정수2개 입력 받아서 큰수 출력 함수  }
	public static void max() {
		Scanner sc = new Scanner(System.in);
		System.out.println("x , y = ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int result = ( x > y ) ? x : y;
		System.out.println(x+"와 "+y+" 중에서 max = " +result);
	}
	
	public static void max(int x, int y) {
		int result = ( x > y ) ? x : y;
		System.out.println(x+"와 "+y+" 중에서 max = " +result);
	}
}










