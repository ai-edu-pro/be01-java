package day05_array.quiz;

import java.util.Scanner;

public class QuizEx4 {
	public static void main(String[] args) {
//		int[][] a = new int[][] {{7, 2, 1, 3}, {10, 8, 9, 7}, {0,0,0,0} }; 
		Scanner sc = new Scanner(System.in);
		int[][] a = new int[3][4]; 
		
		// input 및 처리(계산)
		for (int i = 0; i < a.length; i++) {  // row
			for (int j = 0; j < a[i].length; j++) {  // col
				if( i == 2 ) {
					a[2][j] = a[0][j] + a[1][j] ;  // 계산
				}else {
					System.out.print("a["+i+"]["+j+"] = ");
					a[i][j] = sc.nextInt();  // 입력받기
				} // if end
			} // j end
		} // i end
		System.out.println();
		// output
		for (int i = 0; i < a.length; i++) {  // row
			for (int j = 0; j < a[i].length; j++) {  // col
				//System.out.print("a["+i+"]["+j+"] = ");
				System.out.print(a[i][j]+"\t");
			} // j end
			System.out.println();
		} // i end
	}
}









