package day04_homework;

import java.util.Scanner;

/*
 과제1] 1 + (1 + 2) + (1 + 2 + 3) + (1 + 2 + 3 + 4) + (1 + 2 + 3 + 4 + 5) = ? 35
 과제2] (-1) + 2 + (-3) + 4 + (-5) + ... + (-9) + 10 = ?   5
 과제3] 1/2 + 2/3 + 3/4 + 4/5 + 5/6 + 6/7 + 7/8 +  8/9 + 9/10 = ?  7.98
*/

public class HomeWork2 {
	public static void main(String[] args) {

		int result = 0, total_result = 0, i = 0;
		// 1. for
		for (i = 1; i <= 5; i++) {
			result = result + i;
			total_result += result;
		} // i end

		// 2. while
		while (i <= 5) {
			result = result + i;
			total_result += result;
			i++;
		}

		System.out.println("result : " + total_result);

		System.out.println("-------------------------------------");
		result = 0;

		for (i = 1; i <= 10; i++) {
			if (i % 2 != 0)	result -= i;
			else if (i % 2 == 0) result += i;
		}
		System.out.println("result = " + result);

		System.out.println("-------------------------------------");
		double result2 = 0;
		for (i = 1; i <= 10; i++) {  //
			result2 += (double)i / (i + 1);
		}
		System.out.printf("result = %.2f", result2);
		
		System.out.println("\n-------------------------------------");
		System.out.printf("3개의 숫자를 입력하세요: ");
		Scanner sc = new Scanner(System.in); 
		int a = sc.nextInt();		int b = sc.nextInt();		int c = sc.nextInt();

		int min, max, mid;

		if(a>b)	{  
			max = (a>c) ? a : c;
			min = (b>c) ? c : b;
			mid = (max!=a  && min!=a)? a : 
										  (max!=b  && min!=b) ? b : c;
		} else {
			max = (b>c) ? b : c;
			min = (a>c) ? c : a;
			mid = (max!=a  && min!=a)? a : (max!=b  && min!=b) ? b : c;
		} // if end
			    
		System.out.println( max + " > " + mid + " > " + min );
	}

}
