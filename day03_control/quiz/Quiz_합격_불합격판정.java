package day03_control.quiz;

import java.util.Scanner;

/*
문제3] 전산,영어,국어 점수 입력 받아서 평균 60점이상이고,
각 과목 과락 40점이하면 과목 불합격 처리하는 프로그램 작성
*/
public class Quiz_합격_불합격판정 {
	public static void main(String[] args) {
		System.out.print("kor = ");		int kor = new Scanner(System.in).nextInt();
		System.out.print("eng = ");		int eng = new Scanner(System.in).nextInt();
		System.out.print("com = ");		int com = new Scanner(System.in).nextInt();
		
//		double avg = (double)(kor + eng + com) / 3 ;
		double avg = (kor + eng + com) / 3.0 ;
		
		if( avg >= 60 ) {
			
			if( kor >= 40 && eng >= 40 && com >= 40 ) {
				System.out.printf("모든 과목이 40점 이상이며, 평균이 %.2f로 [합격] 입니다\n", avg);
			} else {
				System.out.printf("평균은 %.2f 이지만, ", avg);
				if( kor < 40 ) System.out.print("국어 "+kor+"점");
				if( eng < 40 ) System.out.print("영어 "+eng+"점");
				if( com < 40 ) System.out.print("전산 "+com+"점");
				System.out.print("으로 [과락탈락] 입니다. \n");
			} // in if
			
		} else {
			System.out.printf("평균이 %.2f로 [평균 미달 탈락] 입니다\n", avg);
		} // out if
	}
}








