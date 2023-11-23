package day03_exception.ex01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowsMain {
	public static void main(String[] args) 
				//throws ArithmeticException, InputMismatchException {  // 예외처리 위임
				throws Exception {  // 예외처리 위임
		
		System.out.print("x, y = ");
		int x, y, result = 0;
		
		x = new Scanner(System.in).nextInt();
		y = new Scanner(System.in).nextInt();
		
		result = x / y ;  //문제 발생 소지 있는 코드
		System.out.println(x +" / " + y + "= "+ result);
	
	}
}
