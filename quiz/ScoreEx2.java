package quiz;

import java.util.Scanner;

// 3과목 입력 받고, 총점, 평균, 학점(if, switch) 구하기 
public class ScoreEx2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  // 객체 생성, 메모리에 할당, 생성자함수자동호출
		int kor, eng, com, tot = 0;
		double avg= 0;
		String name = null;
		String flag = "";
		
		while(true) {  // 무한루프
			System.out.print("name = ");
			name = sc.next();
			
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
			avg = tot / 3.0 ;  

			char grade = ' ';
			switch ( (int) avg / 10 ) {	
				case 10:
				case 9: grade = 'A';	break;
				case 8: grade = 'B';	break;
				case 7: grade = 'C';	break;
				case 6: grade = 'D';	break;
				default: grade= 'F';		
			} // end switch
				
			System.out.println("\n\n****  " +name +"님의 성적표 **********");
			System.out.println("국어 : " + kor + " 영어 : " + eng + " 전산 : " + com);
			System.out.printf("총점 : %d 평균 : %.1f  평점(학점) : %c ", tot, avg, grade );
			
			System.out.println("\n더 입력 받으시겠습니까(y/n)? ");
			flag = sc.next(); // String
			
			//if( flag.equals("n") || flag.equals("N")  ) break; 
			//if( flag.equalsIgnoreCase("n")) break;
			if( flag.toUpperCase().equals("N")  ) break;  // 탈출구문
			//if( flag.toLowerCase().equals("n")  ) break;
			
		} // while end
	}
}

/*
result>
	이도연님의 성적표 *****
	국어 : 100, 영어: 100, 전산 : 100
	총점 : 300, 평균: 100.00, 학점 : A 
*/