//*
package day01_dataType.ex02.dataType;

public class DataType {
	public static void main(String[] args) {
		char ch = 'A';  // ASCII code
		
		System.out.println(ch + ", ASCII code = " + (int)ch);
		System.out.println('B');
		System.out.println((int)'b');
		
		int num = 9;  // 10 진수
		int xNum = 0x9; // 0x숫자 : 16진수
		int oNum = 011;  // 0숫자 : 8진수
		int bNum = 0B1010;  // 0b숫자 : 2진수 
		
		System.out.println("2진수 : "+bNum);
		System.out.println(num);
		System.out.println(xNum);
		System.out.println(oNum);
		System.out.println("===================");
		System.out.printf("%d %d \n", 0xa, 0xA);  // 16 ---> 10
		System.out.printf("%d \n", 012); // 8 --> 10
		
		System.out.println("-----------------------");
		System.out.printf("%x  %X \n", 10, 10); // 16 <--- 10
		System.out.printf("%o  %o \n", 10, 10); // 8 <--- 10
		
	}
}
//*/


/*
package ex02.dataType;

public class DataType {
	public static void main(String[] args) {
		short sh = -32768;  // -32,768 ~ 32,767
		int su = 32768; // 32770;   //  -21억 ~ 21억 
		
//		su = sh;   // 묵시적(자동) 형변환 
		sh = (short)su;   // 명시적 형변환 - 데이터 손실 발생
		
		System.out.println(sh + ",  "+su);
	}
}
//*/