package day03_control.Switch.quiz;

import java.util.Scanner;

// 숫자 입력 받아서 짝/홀수 판정 프로그램 
public class QuizSwitchEx1 {
	public static void main(String[] args) {

		System.out.println("숫자를 입력하시오 : ");
		int su = new Scanner(System.in).nextInt();
		// int na = su % 2 ;

		switch (su % 2) { // switch(na) {
		case 1:
			System.out.println("홀수");
			break;
		case 0:
			System.out.println("짝수");
			break;
		default:
			System.out.println("무슨 수를 입력한거니?");
		}

	}
}
