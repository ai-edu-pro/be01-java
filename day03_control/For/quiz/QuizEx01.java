package day03_control.For.quiz;

import java.util.Scanner;

public class QuizEx01 {
	public static void main(String[] args) {
		//1.원하는 단 입력 받아서 구구단 출력하기
//		System.out.println("dan = ");
//		int dan = new Scanner(System.in).nextInt();
//		
//		for (int i = 1; i < 10; i++) {
//			System.out.println(dan +" * "+ i + "= " + (dan*i));
//		}
		
//		for (int i = 1; i <=3 ; i++) {
//		for (int i = 1; i <=10 ; i += 2 ) {
		for (int i = 10; i >= 1 ; i--) {
			System.out.print(i + "\t");
		}
		
		//문제] 1~100중에 3의 배수의 합과 개수 구하는 프로그램 작성
		int sum= 0, count = 0, i ;
		for(i=1; i < 101; i++) {
			if( i % 3 == 0 ) {
				sum += i;  // sum = sum + i;  
				count++;  // count = count + 1;  count += 1;
			}
//			System.out.println("i = " + i + ", sum = "+sum + ", count = "+count);
		}
		System.out.println("\ni = " + i + ", sum = "+sum + ", count = "+count);
		
	}
	

}





