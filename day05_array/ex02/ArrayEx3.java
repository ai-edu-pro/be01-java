package day05_array.ex02;

public class ArrayEx3 {
	public static void main(String[] args) {
		// 1.
		int[][] a = new int[2][3]; // 행크기, 열크기
		a[0][0] = 1; // 초기화
		a[0][1] = 2;
		a[0][2] = 3;
		a[1][0] = 4;
		a[1][1] = 5;
		a[1][2] = 6;

		// 2.
		int[][] a2 = new int[][] { { 1, 2, 3 }, { 4, 5, 6 } };
		// 3.
		int[][] a3 = { { 1, 2, 3 }, { 4, 5, 6 } };

		// 배열 값 출력
		System.out.println("a3[0][2] = " + a3[0][2]);
		System.out.println("a3[1][1] = " + a3[1][1]);
		System.out.println("배열의 행크기 : " + a3.length);
		System.out.println("배열의 열크기 : " + a3[0].length);
		System.out.println("배열의 열크기 : " + a3[1].length);

		for (int i = 0; i < 2; i++) { // row
			for (int j = 0; j < 3; j++) { // col
				System.out.print(a3[i][j] + "\t");
			} // j end
			System.out.println();
		} // i end

		System.out.println("------------------------------------");
		for (int i = 0; i < a3.length; i++) { // row
			for (int j = 0; j < a[i].length; j++) { // col
				System.out.print(a3[i][j] + "\t");
			} // j end
			System.out.println();
		} // i end
	}
}
