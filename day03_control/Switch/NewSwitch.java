package day03_control.Switch;

import java.util.Scanner;

public class NewSwitch {
	public static void main(String[] args) {
		System.out.println("원하는 달의 일수 확인 하기 : ");
		int month = new Scanner(System.in).nextInt();  // 5월
		int day = 0; 
		String result = null;
		boolean flag = false;
		
		/*
		// JDK 14 이후 새로 추가된 switch 형식 
		int day = switch( month ) {
			case 1, 3, 5, 7, 8, 10, 12 -> {
					System.out.println("31일까지 있음!");
					yield 31;
				}
			case 4,6,9,11 -> {
				System.out.println("30일까지 있음!");
				yield 30;
			}
			case 2 -> {
				System.out.println("28일까지 있음!");
				yield 28;
			}
			default -> {
				System.out.println("없는 달입니다. 1~12월까지만,...!");
				yield 0;
			}
		};
	*/	
		switch (month) {
			case 1 : case 3: case 5: case 7: case 8: case 10: case 12:  day = 31;	break;
			case 4 : 
			case 6: 
			case 9: 
			case 11:   day = 30;	break;
			
			case 2 : 
				System.out.print("year = ");
				int year = new Scanner(System.in).nextInt();
				if( (year % 4 == 0) && ( year % 100 != 0 || year % 400 == 0 )) {
					day = 29;  break;
				}
				day = 28;  break;
		} 
		System.out.println(month + " ==> " + day + "일까지 있습니다.");
	}
}
