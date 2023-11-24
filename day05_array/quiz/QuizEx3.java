package day05_array.quiz;

import java.util.Scanner;

// 문제3] 임의의 수를 2차원 배열로 입력 받아서 합 출력 프로그램 작성
public class QuizEx3 {
	public static void main(String[] args) {
		int[][] a = new int[2][3];
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("array data 2row, 3col = ");
		//input
		for (int i = 0; i < a.length; i++) {  // row ,    배열명.length  <---- 행의길이
			for (int j = 0; j < a[i].length; j++) {  // col ,   배열명[행크기].length  <---- 열의길이
				System.out.print("a["+i+"]["+j+"] = ");
				a[i][j] = sc.nextInt();
				
				sum += a[i][j];
			} // j end
		} // i end
		
		System.out.println("[2][3] 입력 데이터 합은? " +sum);
		
		//output
//		for (int i = 0; i < a.length; i++) {  // row
//			for (int j = 0; j < a[i].length; j++) {  // col
//				System.out.print(a[i][j] + "\t");
//			} // j end
//			System.out.println();
//		} // i end
	}
}
