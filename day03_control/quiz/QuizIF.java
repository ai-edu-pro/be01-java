package day03_control.quiz;

import java.util.Scanner;


//문제1] 숫자 2개 입력 받아서 큰수 출력하는 프로그램 작성
public class QuizIF {
	public static void main(String[] args) {
		System.out.println("integer data : ");
        int Num = new Scanner(System.in).nextInt();
        System.out.println("integer data2 : ");
        int Num2 = new Scanner(System.in).nextInt();

        if(Num > Num2) {
            System.out.println("max = "+Num);
        }else if(Num < Num2) {
            System.out.println("max = "+Num2);
        }else {
            System.out.println("값이 같습니다. "+Num);
        }
	}
}
