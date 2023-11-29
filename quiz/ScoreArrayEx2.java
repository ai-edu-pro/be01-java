package quiz;

import java.util.Scanner;

// 3과목 입력 받고, 총점, 평균, 학점(if, switch) 구하기 
public class ScoreArrayEx2 {
	public static void main(String[] args) {
		int INWON = 3;
		int SU = 3; // 국어,영어,전산
		Scanner sc = new Scanner(System.in); // 객체 생성, 메모리에 할당, 생성자함수자동호출
		int[][] arr = new int[INWON][SU]; // 인원수, 과목수
		int[][] nUserInfo = new int[INWON][SU]; // 총점, 평균,학점
		String[] strName = new String[INWON];

		// input & process(처리==계산)
		for (int i = 0; i < arr.length; i++) {  // row 
			System.out.printf("%d번째 학생 이름 입력: \n", i + 1);
			strName[i] = sc.next();
			
			for (int j = 0; j < arr[0].length; j++) { // col - 과목점수 
				
				switch (j) {
					case 0:	System.out.print("국어점수 입력: ");
						break;
					case 1:	System.out.print("영어점수 입력: ");
						break;
					case 2:	System.out.print("전산점수 입력: ");
						break;
				} // end switch
				
				arr[i][j] = sc.nextInt();
				
			} // j   end
		}  // i  end

		int nSum = 0, nGrade = 0;
		double fAvg = 0;
		String subject = " ";
		char szGrade = ' ';
		// output
		for (int i = 0; i < arr.length; i++) {
			nSum = 0;
			fAvg = 0.0f;
			nGrade = 0;
			System.out.printf("[ %s ] 학생 점수 ==================\n ", strName[i]);
			
			for (int j = 0; j < arr[0].length; j++) {
				subject = " ";
				switch (j) {
					case 0:	subject = "국어 ";		break;
					case 1:	subject = "영어 ";		break;
					case 2:	subject = "전산 ";		break;
				} // switch end
				nSum += arr[i][j];
				System.out.printf("[ %s ] : %d \n", subject, arr[i][j]);
			 } // end j for 
			
			System.out.println("-----------------------");
			
			fAvg = (double) nSum / arr.length;
			nGrade = (int) fAvg / 10;
			
			switch (nGrade) {  // 학점
				case 10:
				case 9:	szGrade = 'A';	break;
				case 8:	szGrade = 'B';		break;
				case 7:	szGrade = 'C';		break;
				case 6:	szGrade = 'D';	break;
				default:	szGrade = 'F';
			} // end switch

			// output
//			for (int j = 0; j < arr[0].length; j++) {
				System.out.println("\n**************** [ " + strName[i] + " ] 번 학생 점수 결과 ****************");
//				System.out.println("국어 : " + arr[i][0] + " 영어 : " + arr[i][1] + " 전산 : " + arr[i][2]);
				System.out.printf("[ 총점: %d ]\t[ 평균: %.2f ]\t[ 학점 : %s ]\t", nSum, fAvg, szGrade);
				System.out.println("\n=================================================\n");
//			} // j end 
			
		} // i end
	} // end main
}

/*
result>
	이도연님의 성적표 *****
	국어 : 100, 영어: 100, 전산 : 100
	총점 : 300, 평균: 100.00, 학점 : A 
*/