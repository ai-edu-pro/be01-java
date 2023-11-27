package day06_array.ex03;

// 3차원 형태
// 임의적인 데이터 입력 받아서 출력하기

public class QuizEx5 {
	public static void main(String[] args) {

		int[][][] a = new int[2][2][3]; // [면크기][행크기][열크기];
		int x = 1;
		//input
		for (int i = 0; i < a.length; i++) { // 면
			for (int j = 0; j < a[i].length; j++) { // 행
				for (int k = 0; k < a[i][j].length; k++) {
//					a[i][j][k] = (int)(Math.random()*100);
					a[i][j][k] = x++ * 5;
				} // k end
			} // j end
		} // i end
		
		//output
		for (int i = 0; i < a.length; i++) { // 면
			for (int j = 0; j < a[i].length; j++) { // 행
				for (int k = 0; k < a[i][j].length; k++) {
					System.out.print(a[i][j][k] + "\t");
				} // k end
				System.out.println();
			} // j end
			System.out.println();
		} // i end

	}
}
