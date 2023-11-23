//*
package ex01.oprator;

// 최단산쉬관논삼대콤
public class OperatorTest {
	public static void main(String[] args) {
		//논리연산자 : && (and),  || (or),  ! (not)  10진 논리 ==> 결과 : 참, 거짓
		
		int x = 10, y = 20, z = 30;
		boolean result = true;
		
		result = (x > y) && ( y > z ) ; // '&&' 연산은 앞에 것이 '거짓'이면 뒤는 수행X
		System.out.println("&& : " +result);
		
		result = (x < y) && ( y < z ) ; 
		System.out.println("&& : " +result);
		
		result = (x < y) || ( y < z ) ; // '||' 연산은 앞에 것이 '참'이면 뒤는 수행X
		System.out.println("|| : " +result);
		
		System.out.println("! : " + !result);
		
	}
}
//*/


/*
package ex01.oprator;

// 최단산쉬관논삼대콤
public class OperatorTest {
	public static void main(String[] args) {
		//논리연산자 : & (and),  | (or),  ^ (xor)  2진 논리 ==> 결과 : 값
		int x = 4, y = 7;
		
		System.out.println(x & y);  // System.out.println(4 & 7);
		System.out.println(x | y);
		System.out.println(x ^ y);
		
		
	}
}
//*/


/*
package ex01.oprator;

// 최단산쉬관논삼대콤
public class OperatorTest {
	public static void main(String[] args) {
		//관계연산자 : > , <, >=, <=, == , != 
		int x = 3, y = 5;
		
		boolean flag = true;
		
		System.out.println(!flag);  // t -> f , f -> t 
		
		if( x != y ) { 	// if( x == y ) { 	// if( x >= y ) {	// if( x > y ) {
			System.out.println("max : " + x);
			System.out.println("if");
		} else {
			System.out.println("max : " + y);
			System.out.println("else");
		}
	}
}
//*/




