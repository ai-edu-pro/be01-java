package quiz.IO.bmiOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuizEx1 {
	public static void main(String[] args) {
		try {
			BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));

			System.out.print("Integer data input = ");			int su1 = Integer.parseInt(br.readLine());
			System.out.print("Integer data input = ");			int su2 = Integer.parseInt(br.readLine());
			// 연산자 입력은 2가지 방법 있음.  1) String 처리 , 2) Charator 처리 
			System.out.print("Operator(+,-,*,/)  input = ");	
			String op = br.readLine();    //  char op =  br.readLine().charAt(0);
			int result = 0;
			
			// 사칙 연산 처리하기
			if (op.equals("+")) 		result = su1 + su2;
			if (op.equals("-")) 		result = su1 - su2;
			if (op.equals("*"))		result = su1 * su2;
			if (op.equals("/")) 		result = su1 / su2;
			
			System.out.println(op+ " 연산 : " + su1 + " " + op + " "+ su2 + " = " + result);
			
//			switch( op ) {
//				case "+" :
//					System.out.println(su1 + " + " + su2 + " = " + (su1 + su2));
//					break;
//				case "-" :
//					System.out.println(su1 + " - " + su2 + " = " + (su1 - su2));
//					break;
//				case "*" :
//					System.out.println(su1 + " * " + su2 + " = " + (su1 * su2));
//					break;
//				case "/" :
//					System.out.println(su1 + " / " + su2 + " = " + (su1 / su2));
//					break;
//				default : System.out.println("연산자를 잘못 입력하셨습니다.");
//			} // switch end
			
		} catch (NumberFormatException e) {
			System.out.println("정수형 데이터가 아닙니다");  // 사용자 에러 메세지
		} catch (IOException e) {
			e.printStackTrace(); 
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");  // 사용자 에러 메세지
//			System.out.println(e.getMessage());  // 처리된 에러 메세지 출력
//			e.printStackTrace();  // 처리된 에러를 단계적으로 찾아서 출력
		} catch (Exception e) {
			e.printStackTrace(); 
		}
	}
}
/**
 * 문제] 연산자(+,-,*,/) 입력 받고, 숫자 2개 입력 받아서
     사칙연산 프로그램 작성하기 ( io 이용 )
*/

