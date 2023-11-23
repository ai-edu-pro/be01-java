package quiz;

import java.util.Scanner;

// 3과목 입력 받고, 총점, 평균, 학점(if, switch) 구하기 
public class Score {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  // 객체 생성, 메모리에 할당, 생성자함수자동호출
		int kor, eng, com, tot = 0;
		double avg= 0;
		
		System.out.print("name = ");
		String name = sc.nextLine();
		
		// 점수 : 0~100 점까지만 입력 받게 처리 
//		  do {
//				System.out.print("kor, eng, com (0~100점까지) score = ");
//				kor = sc.nextInt();		eng = sc.nextInt();			com = sc.nextInt();
//		  } while ( (kor < 0 || kor > 100) || eng < 0 || eng > 100 || com < 0 || com > 100 );
		
		 do {
				System.out.print("국어 점수를 입력하세요(0~100) = ");
				kor = sc.nextInt();	
		  } while ( kor < 0 || kor > 100 );
		 do {
				System.out.print("영어 점수를 입력하세요(0~100) = ");
				eng = sc.nextInt();	
		  } while ( eng < 0 || eng > 100 );
		 do {
				System.out.print("전산 점수를 입력하세요(0~100) = ");
				com = sc.nextInt();	
		  } while ( com < 0 || com > 100 );
			
		tot = kor + eng + com;
		avg = tot / 3.0 ;  // avg = (double)tot / 3; 
		// 학점(평점) 구하기
		
//		String grade = null;
		char grade = ' ';
		switch ( (int) avg / 10 ) {	//switch ( total / 30 ) {
			case 10:
			case 9: grade = 'A';	break;
			case 8: grade = 'B';	break;
			case 7: grade = 'C';	break;
			case 6: grade = 'D';	break;
			default: grade= 'F';		
		} // end switch
		
		/*
		    if (avg <= 100 && avg >= 90) {
				grade = 'A';
			} else if (avg <= 89 && avg >= 80) {
				grade = 'B';
			} else if (avg <= 79 && avg >= 70) {
				grade = 'C';
			} else if (avg <= 69 && avg >= 60) {
				grade = 'D';
			} else {
				grade = 'F';
			}
		 */
		
		System.out.println("\n\n****  " +name +"님의 성적표 **********");
		System.out.println("국어 : " + kor + " 영어 : " + eng + " 전산 : " + com);
		System.out.printf("총점 : %d 평균 : %.1f  평점(학점) : %c ", tot, avg, grade );
//		System.out.println("학점 : " + grade);
	}
}

/*
result>
	이도연님의 성적표 *****
	국어 : 100, 영어: 100, 전산 : 100
	총점 : 300, 평균: 100.00, 학점 : A 
*/