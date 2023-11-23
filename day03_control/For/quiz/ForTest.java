package day03_control.For.quiz;

public class ForTest {
public static void main(String[] args) {
		
		int a=1, b = 1;
		
//		초기값/ 증감식은 2개 이상 기재 가능  (단, 조건은 오직 1개여야함 )
//		for(a =1, b=3 ; a <= 10;  a++, b+=2 ) {
//			System.out.println(b);
//		}
		
//		초기값/ 증감식은 생략 가능  (단, 조건 생략하면 무한루프임)
//		for(  ; a <= 10;  ) {
//			System.out.println(b);
//			a++;
//			b += 2;
//		}
		
//		for(a =1, b=3 ;   ;  a++, b+=2 ) {   // (단, 조건 생략하면 무한루프임)
//			System.out.println(b);
//		}
		
//		for(   ;   ;   ) {   // 무한루프
//			a++; 	b+=2; 
//			System.out.println("b = " +b);
//			System.out.println("a = " +a);
//			if ( a < 6 ) break;
//			
//		}
		
//		 문제] 1~10 까지 중에서 출력 결과는 5의 배수로 출력 (for문 이용) :  5 10  15......50  
		 for (int i = 1; i < 11; i++) {
			System.out.print(i * 5 + "\t");
		 }
		 System.out.println("======================");
//		 int result = 1;
//		for (int i = 1; i < 11; i++) {
//			int 배수 = 5;
//			result = i * 배수;
//			System.out.print(i + "\t");
//			System.out.print("\n"+ result +"\t" );
//			
//		}
		
	}
}
