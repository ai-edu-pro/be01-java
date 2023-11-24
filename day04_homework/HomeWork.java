package day04_homework;

import java.util.Scanner;

public class HomeWork {
	public static void main(String[] args) {
		// 과제1] 1 + (1 + 2) + (1 + 2 + 3) + (1 + 2 + 3 + 4) + (1 + 2 + 3 + 4 + 5) = ? 35
		//System.out.println("과제1] 1 + (1 + 2) + (1 + 2 + 3) + (1 + 2 + 3 + 4) + (1 + 2 + 3 + 4 + 5) = ");
		int sum = 0;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				sum += j;
			}
		}
		System.out.println("1 + (1 + 2) + (1 + 2 + 3) + (1 + 2 + 3 + 4) + (1 + 2 + 3 + 4 + 5) = " + sum);
		
		System.out.print("(-1) + 2 + (-3) + 4 + (-5) + ... + (-9) + 10 = ? ");
		//System.out.println("num = ");
		//int num = new Scanner(System.in).nextInt();
		int num = 10;

		if (num % 2 == 1) { // note 홀수
			int return_val = -(num / 2) - 1;
			System.out.println(return_val);
		} else {
			System.out.println( num / 2 );
		}
		
		//3.과제3] 1/2 + 2/3 + 3/4 + 4/5 + 5/6 + 6/7 + 7/8 +  8/9 + 9/10 = ?
		double hap = 0;
        for(int i=1; i < num+1; i++){
            hap += (double)i/(i+1);
        }
        System.out.printf("1/2 + 2/3 + 3/4 + 4/5 + 5/6 + 6/7 + 7/8 +  8/9 + 9/10 = %.2f", hap);
	}
}





