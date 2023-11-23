//*
package ex01.oprator;
// 최단산쉬관논삼대콤
public class MainEntry {
	public static void main(String[] args) {
		// shift연산자 : << , >>, >>>
		
		int x = 8, result;
		
		result = x << 2 ; // left shift :  원래값 * 2 ^ bit수 
		result = x >> 3 ;  // right shift : 원래값 / 2 ^ bit수 
		
		System.out.println("left shift result : " + result );  // 32
		System.out.println("right shift result : " + result );  // 1
	}
}
//*/
/*
package ex01.oprator;
// 최단산쉬관논삼대콤
public class MainEntry {
	public static void main(String[] args) {
		// 산술연산자 : +, -, *, /, %,....
		int x=10, y = 20;
		int gob = x * y;
		
		System.out.println("x * y = " + gob);
		System.out.println("x * y = " + (x*y));
		System.out.println(x +" * "+y +"= " + gob);
		System.out.println("\n\n3+4*5 = " + (3+4*5));
		System.out.println("(3+4)*5 = " + ( (3+4)*5));
		
		// 정수 ( +, -, *, /, %,......) 정수 = 정수 
		System.out.println("\n 7 / 3 =" + (7/3) ); // 2, 몫 
		System.out.println(" 7 % 3 =" + (7%3) ); // 1, 나머지 
		
		System.out.println("\n 7 / 3.0 =" + (7/3.) ); // 2.3333333
		System.out.println(" 7.0 % 3.0 =" + ( 7. % 3. ) ); 
		
	}
}
//*/


/*
package ex01.oprator;
// 최단산쉬관논삼대콤
public class MainEntry {
	public static void main(String[] args) {
		// 단항연산자 : 증감 ==> ++, --, ~,.....
		int x = -7, y;
		
		y = ~x;  // 비트부정     -(원래값 + 1) ==> 결과
		System.out.println("x = " +x+ ", y= "+y); 
	}
}
//*/

/*
package ex01.oprator;
// 최단산쉬관논삼대콤
public class MainEntry {
	public static void main(String[] args) {
		// 단항연산자 : 증감 ==> ++, --, ~,.....
		int x = 10, y;
		
		//y = x++;  // 후위연산 : 대입먼저, 연산나중
		//y = ++x;  //전위연산 : 연산먼저, 대입나중
		y = x--; 
		x++;   // ++x; 
		y = x; 
		
		System.out.println("x = " +x+ ", y= "+y);  //
	}
}
//*/