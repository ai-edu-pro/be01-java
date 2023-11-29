package quiz;

import java.util.Scanner;
/*
 * 입력 함수 input()  - 이름 , 국어, 영어,전산 점수 
   총점 함수 total(~~~) - 총점 구하는 함수
   평균 함수 average( ~~ ) - 평균 구하는 함수
   평점(학점) grade( ~~ ) - 학점 구하는 함수 
   출력 함수 output( ) - 결과 출력하는 함수 
 */
public class ScoreMethod {
	
	public static void main(String[] args) {
        input();
    }
 
    public static void input() {
        Scanner s = new Scanner(System.in);
        String name = "";
        int kor, eng, com;
        System.out.print("이름을 입력하세요 : ");
        name = s.next();
        System.out.print("국어 성적을 입력하세요 : ");
        kor = s.nextInt();
        System.out.print("영어 성적을 입력하세요 : ");
        eng = s.nextInt();
        System.out.print("전산 성적을 입력하세요 : ");
        com = s.nextInt();
 
        process(kor, eng, com, name);
 
    }
 
    public static void process(int kor, int eng, int com, String name) {
        int sum = kor + eng + com;
        double avg = sum / 3;
        System.out.println("이름 = " + name);
        System.out.println("총점 = " + sum + ", 평균 = " + avg);
        grade(avg);
    }
 
    public static void grade(double avg) {
        String grade = "";
        switch ((int) avg / 10) {
	        case 10:
	        case 9:
	            grade = "A";
	            break;
	        case 8:
	            grade = "B";
	            break;
	        case 7:
	            grade = "C";
	            break;
	        case 6:
	            grade = "D";
	            break;
	        default:
	            grade = "F";
	            break;
        }
        System.out.println("학점 = " +grade);
    }
}

/*
result>
	이도연님의 성적표 *****
	국어 : 100, 영어: 100, 전산 : 100
	총점 : 300, 평균: 100.00, 학점 : A 
*/