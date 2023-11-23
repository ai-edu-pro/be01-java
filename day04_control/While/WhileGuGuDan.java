package day04_control.While;

import java.util.Scanner;

public class WhileGuGuDan {
	public static void main(String[] args) {
		// while문으로 원하는 단 입력 받아서 구구단 출력하기
		System.out.println("dan = ");
		int dan = new Scanner(System.in).nextInt();
		int a = 1;
		while( a < 10 ) {
			System.out.println(dan + "*"+a+"= "+ (dan*a));
			a++; 
		}
		
		
		// do ~ while문으로 원하는 단 입력 받아서 구구단 출력하기
		System.out.println("dan = ");
		dan = new Scanner(System.in).nextInt();
		a = 1;
		do  {
			System.out.println(dan + "*"+a+"= "+ (dan*a));
			a++; 
		} while( a < 10 ); //문장 종결 기호
		
	}
}
