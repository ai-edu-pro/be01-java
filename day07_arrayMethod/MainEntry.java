package day07_arrayMethod;

public class MainEntry {
	public static void main(String[] args) {
		int x = 3, y = 5;
		
		int result = methodEx(x, y);
		System.out.println(result);
		
		int[] arrResult = methodEx2();
//		for (int i = 0; i < arrResult.length; i++) {
//			System.out.print(arrResult[i] + "\t");
//		}
		
		for (int item : arrResult) {
			System.out.print(item + " ");
		}
		System.out.println("\n\n");
//		-- 2차원 배열 함수 만들기 - 더한 결과 출력 -------------------
		int[][] resultArr = methodEx3();
		int sum = 0;
		for (int i = 0; i < resultArr.length; i++) {
			for (int j = 0; j < resultArr[i].length; j++) {
				System.out.print(resultArr[i][j] + "\t");
				sum += resultArr[i][j];
			} // j end
			System.out.println();
		} // i end
		
		System.out.println("sum = " + sum);
		System.out.println("******* foreach 문으로 2차원 배열 데이터 출력 ************************");
		for (int[] item : resultArr) {
			for (int arrItem : item) {
				System.out.print(arrItem + "  ");
			} // arrItem end
			System.out.println();
		} // item end
		
		System.out.println("\n================================");
		int index = 0;
		for (int[] item : resultArr) {
			System.out.println("index : " + index++);
			System.out.println(item); // 데이터 들어 있는 주소 출력됨
			System.out.println(item.hashCode()); // 메모리상의 주소(16진수형태)를 10진수 형태 메모리 주소로 보여줌
		}
		
	} // end main

	public static int[][] methodEx3() {
		int[][] arr = { {1,2,3,4}, {5,6,7,8} };
		return arr;
	}

	public static int[] methodEx2() {
		int[] arr = {1,2,3,4,5,6,7,8};
		
		return arr;
	}

	public static int methodEx(int x, int y) {
		return x + y;
	}
}
