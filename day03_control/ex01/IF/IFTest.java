package day03_control.ex01.IF;

import java.util.Scanner;

public class IFTest {
	public static void main(String[] args) {
		System.out.print("integer data : ");
		int su = new Scanner(System.in).nextInt();
		
		//짝/홀수 판정
	
		if( su % 2 == 0 ) {
			System.out.println(su +" ==> even");
			if( su > 0 ) {
				System.out.println("양수");
			} else if( su == 0 ) {
				System.out.println("0 이군요.");
			} else {
				System.out.println("음수");
			}
		}
		else {
			System.out.println(su +" ==> odd");
			if( su > 0 ) {
				System.out.println("양수");
			} else if( su == 0 ) {
				System.out.println("0 이군요.");
			} else {
				System.out.println("음수");
			}		
		}
	}
}
