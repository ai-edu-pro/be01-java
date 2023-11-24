package day04_homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Compare_nums {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 , num2, num3;
		int temp;
		System.out.println("====숫자 크기순 나열====\n");
		
		try {
			System.out.print("1) -> ");
			num1 = sc.nextInt();
			System.out.print("2) -> ");
			num2 = sc.nextInt();
			System.out.print("3) -> ");
			num3 = sc.nextInt();
			
			if(num1 > num2) {
				if(num1 < num3){
					temp = num1;  // 교환
					num1 = num3;
					num3 = temp;
				}
				if(num2 < num3){
					temp = num2;
					num2 = num3;
					num3 = temp;
				}
			}
			else if(num1 < num2){
				temp = num1;
				num1 = num2;
				num2 = temp;
				if(num1 < num3){
					temp = num1;
					num1 = num3;
					num3 = temp;
				}
				if(num2 < num3){
					temp = num2;
					num2 = num3;
					num3 = temp;
				}
			}
			System.out.println("=====================================");
			System.out.println("result : "+num1+ " > "+num2+ " > "+num3);
		}
		catch(InputMismatchException e) {
			System.out.println("[Input Error]\nPlease Input Number!\n\n[Error Message]\n");
			e.printStackTrace();
			
		}
	}
	
}
