package day03_exception.ex01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyMain {
	public static void main(String[] args) {
		System.out.print("x, y = ");
		int x, y, result = 0;
		
		try {
			x = new Scanner(System.in).nextInt();
			y = new Scanner(System.in).nextInt();
			
			result = x / y ;  //문제 발생 소지 있는 코드
			System.out.println(x +" / " + y + "= "+ result);
			
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException ");  // user message
//			System.out.println(e.getMessage());
			e.printStackTrace();  // 
		} catch (Exception e) {
			System.out.println("Exception ");  // user message
//			System.out.println(e.getMessage());
			e.printStackTrace();  // 
		} finally {
			System.out.println("finally 무조건 처리됨!!! ");
		}
	}
}
