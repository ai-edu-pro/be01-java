package day05_array.ex01;

public class ForeachTest {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		
		for (int i = 0; i < arr.length; i++) {
//			if( arr[i] >= 99 ) break;
			System.out.println(arr[i]);
		}
		System.out.println("========================");
//		for(자료형 변수명 : 배열명 또는 컬렉션명) {    }
		for (int item : arr) {
			System.out.println(item);
		}
		
		int[] score = { 78, 70, 88, 99, 58 };
		int hap = 0;
		for (int item : score) {
			hap += item;
		}
		System.out.println("점수 합계 = "+ hap);
	}
}

/*
	for(자료형 변수명 : 컬렉션명 or 배열명) {   
		반복구문;
    }

*/