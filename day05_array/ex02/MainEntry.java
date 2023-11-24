//*
package day05_array.ex02;
// 2차원 배열
public class MainEntry {
	public static void main(String[] args) {
		int[][] a = { {1,2,3, 55, 1, 3, 7}, {4,55,6, 5, 8, 99, 100}, {66,22,6, 5, 8, 99, 100} };
		
		System.out.println("행의 길이 : " + a.length);     // row, 배열명.lenght 
		System.out.println("열의 길이 : " + a[0].length);
		System.out.println("열의 길이 : " + a[1].length);  // col, 배열명[행크기].lenght
		
		
		for (int i = 0; i < a.length; i++) {    // 행
			for (int j = 0; j < a[i].length; j++) {  // 열
//				System.out.print("a["+i+"]["+j+"] = " + a[i][j] +"\t");
				System.out.print(a[i][j] +"\t");
			} // j end
			System.out.println();
		} // i end
	}
}
//*/


/*
package day05_array.ex02;
// 2차원 배열
public class MainEntry {
	public static void main(String[] args) {
//		int[][] a = new int[2][3];
//		int[][] a = new int[][] { {1,2,3}, {4,5,6} };  // 2행3열
		int[][] a = { {1,2,3}, {4,55,6} };
		
		
		
		for (int i = 0; i < 2; i++) {    // 행
			for (int j = 0; j < 3; j++) {  // 열
				System.out.print("a["+i+"]["+j+"] = " + a[i][j] +"\t");
			} // j end
			System.out.println();
		} // i end
	}
}
//*/