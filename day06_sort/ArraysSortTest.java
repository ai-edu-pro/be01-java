package day06_sort;

import java.util.Arrays;

public class ArraysSortTest {
	
	public static void main(String[] args) {
		int[] a = { 7, 3, 2, 5, 8 };
		
		System.out.println("******* sort 전 출력 ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"\t");
		}
		
		//sort
		System.out.println("\n오름차순");
		Arrays.sort(a);  // 정렬 알고리즘은 이미 내부적으로 처리 되어 있는 메소드
		
		System.out.println("\n******* sort 후 출력 ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"\t");
		}
		
		System.out.println("\n******* 내림차순");
		for (int i = a.length-1; i >= 0 ; i--) {
			System.out.print(a[i]+"\t");
		}
		
	}
}







