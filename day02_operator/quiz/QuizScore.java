//*
package day02_operator.quiz;
import java.util.Scanner;

public class QuizScore {
	public static void main(String[] args) {
		// Scanner 이용해서 데이터 처리하기
		System.out.print("kor, eng, com data & name input : ");
		int kor = new Scanner(System.in).nextInt();
		int eng = new Scanner(System.in).nextInt();
		int com = new Scanner(System.in).nextInt();
		String name = new Scanner(System.in).next();
		int total = kor +eng + com;
		double avg = total / 3.0 ;  // avg = (double)total / 3 ;		
		
		System.out.println(name+"님의 성적표 *****");
		System.out.println("국어 : "+kor+", 영어 : "+eng+", 전산 : "+com);
		System.out.printf("총점 : %d,  평균 : %.2f ", total, avg);
	}
}
//*/



/*
package day02_operator.quiz;

//import java.lang.*;  // java.lang package 자동 임포트 
import java.lang.String;
import java.lang.System;
import java.util.Scanner;

public class QuizScore {
	public static void main(String[] args) {
		// Scanner 이용해서 데이터 처리하기
		Scanner sc = new Scanner(System.in);
		int kor, eng, com, total = 0;
		double avg = 0;  
		System.out.print("name input : ");
		String name = sc.next();
		System.out.print("kor, eng, com data input : ");
		kor = sc.nextInt();
		eng = sc.nextInt();
		com = sc.nextInt();
		
//		System.out.print("국어 : " );
//        kor = sc.nextInt();
//        System.out.print("영어 : ");
//        eng = sc.nextInt();
//        System.out.print("전산 : ");
//        com = sc.nextInt();
		
		total = kor +eng + com;
		avg = total / 3.0 ;  // avg = (double)total / 3 ;		
		
		System.out.println(name+"님의 성적표 *****");
		System.out.println("국어 : "+kor+", 영어 : "+eng+", 전산 : "+com);
		System.out.printf("총점 : %d,  평균 : %.2f ", total, avg);
	}
}
//*/
/*
package day02_operator.quiz;

//import java.lang.*;  // java.lang package 자동 임포트 
import java.lang.String;
import java.lang.System;

public class QuizScore {
	public static void main(String[] args) {
		int kor=90, eng =88, com=100, total = 0;
		double avg = 0;  
		String name = "이도연";
		total = kor +eng + com;
		avg = total / 3.0 ;  // avg = (double)total / 3 ;
		
		System.out.println(name+"님의 성적표 *****");
		System.out.println("국어 : "+kor+", 영어 : "+eng+", 전산 : "+com);
		System.out.printf("총점 : %d,  평균 : %.2f ", total, avg);
	}
}
//*/
/*
	result :
	이도연님의 성적표****
	국어 : 90, 영어 : 88, 전산 : 100
	총점 : 278,  평균 : 92.67
*/