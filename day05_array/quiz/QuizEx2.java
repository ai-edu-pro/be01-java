package day05_array.quiz;

import java.util.Scanner;

// 문제2] 11월 한달간(기준 30일)의 강수량을 입력 받아서, 평균 구하는 프로그램 작성
public class QuizEx2 {
	public static void main(String[] args) {
		int SU = 3, sum = 0;
		double avg = 0;
		double[] arr = new double[SU];
		
//		System.out.println("일일 강수량 입력 하세요. ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println( (i+1) + "일 강수량 입력 하세요. ");
			arr[i] = new Scanner(System.in).nextDouble();
			sum += arr[i];
			avg = (double)sum / arr.length;   // avg = sum / SU; 
		}
		
		/*
		for(double item : arr) {
			sum += item;
		}
		 */
		System.out.printf("11월 평균 강수량 : %.2f " , avg);
	}
}
