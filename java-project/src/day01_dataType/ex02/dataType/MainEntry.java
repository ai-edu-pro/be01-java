//*
package ex02.dataType;

public class MainEntry {
	public static void main(String[] args) {  // 시작점(진입점)
		int su = 9;
		char ch = 'A'; // '문자'
		String str = "korea"; // "문자열"
		double d = 12.34;
		float f = 12.34f;  // f, F
		long num = 9; 
		
		System.out.println(su + ", "+ch+", "+str);
		System.out.println("su = "+su);
		
		System.out.println(100);  // int O - 4byte //long X
		System.out.println(100L);   // long - 8byte
		
		System.out.println(3.5);  // double
		System.out.println(3.5F);  // float
		
		System.out.println(su);
		System.out.println(ch);   // 2byte
		System.out.println(str);
		System.out.println(d);
		
		System.out.println();
		int su2 = 100; // 지역변수는 반드시 초기화하고 사용한다.
		System.out.println(su2);  // 
		
		//*--------------------------------
		int x = 2;  // 기본자료형
		Integer  y = 2;  // 참조형 
		x = y.intValue();   // 4.x 이전까지는 형변환 함수 이용해야했음
		y = x;   // autoboxing / unboxing  5.x 이후부터
		
//		String str2 = 'A'; //
//		char  ch2 = "encore"; //
		
		String str3 = "A";   // A\0
		char ch3 = 'A';    // A
		
	}  //end main
} // end class 
//*/


/*
package ex02.basic;

public class MainEntry {
	public static void main(String[] args) {
		System.out.print("hello java");
		System.out.println(100);
		System.out.print("dkfskfs");
	}
}
//*/

// 한줄 주석

/*
	여러줄 주석
*/

// Ctrl + F11 