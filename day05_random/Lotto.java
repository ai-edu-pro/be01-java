package day05_random;

import java.util.Random;

//문제2] 로또 프로그램 작성 :   
//	 1 ~ 45 숫자 중에서 6개 추출 (단, 같은수 없어야함)
public class Lotto {
	public static void main(String[] args) {
		int[] arr = new int[6];
		Random rand = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(45) + 1;

			if (isCheck(arr, i)) {  // 같은 수 비교 함수 호출 
				i--;
			}
		} // end for

		// 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}
	
	private static boolean isCheck(int[] arr, int i) {
		boolean flag = false;

		for (int j = 0; j < i; j++) {
			if (arr[i] == arr[j])
				flag = true;
		}
		return flag;
	}
}
