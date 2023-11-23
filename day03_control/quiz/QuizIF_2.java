package day03_control.quiz;

import java.util.Scanner;

//윤년/평년 판정 프로그램 작성
/*
*  if (년도 % 4 == 0) 
*       if( (년도 % 100 != 0)  || (년도 % 400 == 0) )  
*             "윤년" ;
*/

public class QuizIF_2 {
	public static void main(String[] args) {
		System.out.print("year = ");
		int year = new Scanner(System.in).nextInt();
		String result = null;
		boolean flag = false;
		
		if( (year % 4 == 0) && ( year % 100 != 0 || year % 400 == 0 ) ) {
			flag = true;
		}
		
//		if( year % 4 == 0 ) {
//			if ( year % 100 != 0 || year % 400 == 0  ) {
//				flag = true;
//			} // in if end
//		} // out if end
		
		result = (flag == true) ? "윤년" : "평년" ;
		
		System.out.println("\n"+year+ " 년도 ===> " + result);
	}
}






