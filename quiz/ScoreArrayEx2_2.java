package quiz;

import java.util.Scanner;

// 3과목 입력 받고, 총점, 평균, 학점(if, switch) 구하기 
public class ScoreArrayEx2_2 {
	
	public static void main(String[] args) {
		
	        Scanner sc = new Scanner(System.in);
	        System.out.print("사람 수 입력 : ");
	        int INWON = sc.nextInt();
	        String[][] name = new String[INWON][2];
	        int[][] score = new int[INWON][5];
	 
	        // input
	        for (int i = 0; i < INWON ; i++) {
	            System.out.print("이름 입력하셈 : ");
	            name[i][0] = sc.next();
	            System.out.print("점수입력(3과목) : ");
	            for (int j = 0; j < 3; j++) {
	                score[i][j] = sc.nextInt();
	            }
	            // 총점/평균
	            score[i][3] = score[i][0] + score[i][1] + score[i][2];
	            score[i][4] = score[i][3] / 3;
	        }
	        // grade 
	        for (int i = 0; i < INWON ; i++) {
	            if (score[i][4] >= 90)
	            	name[i][1] = "A";
	            else if (score[i][4] >= 80 && score[i][4] < 90)
	            	name[i][1] = "B";
	            else if (score[i][4] >= 70 && score[i][4] < 80)
	            	name[i][1] = "C";
	            else if (score[i][4] >= 60 && score[i][4] < 70)
	            	name[i][1] = "D";
	            else
	            	name[i][1] = "F";
	        }
	        
	        // output
	        for (int i = 0; i < INWON ; i++) {
	            System.out.println("\n***** 이름 : " + name[i][0] + " *****");
	            System.out.print("국어 : " + score[i][0] + "\t수학 : " 
	            		+ score[i][1] + "\t전산 : " + score[i][2] + "\n총점 : "
	                    + score[i][3] + "\t평균 : " + score[i][4]);
	            System.out.print("\t학점 : " + name[i][1]);
	        }
	        System.out.println("\n====================================");
	} // main end
}

/*
result>
	이도연님의 성적표 *****
	국어 : 100, 영어: 100, 전산 : 100
	총점 : 300, 평균: 100.00, 학점 : A 
*/