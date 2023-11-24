package day05_array.ex01;

public class MainEntry {
	public static void main(String[] args) {
		//1.
		char[] ch;  // 배열선언
		ch = new char[4];  // 배열생성, 메모리에할당
		
		//2. 
		int NUM = 3;
		char[] ch2 = new char[NUM];  // 배열선언 및 생성
		//배열 초기화
		ch2[0] = 'J';
		ch2[1] = 'A';
		ch2[2] = 'V';
		ch2[3] = 'A';
		
		System.out.println(ch2[0]); // J
		System.out.println(ch2[3]); // A
		System.out.println("=====================");
		for(int i=0; i < 4; i++) {
			System.out.println("ch2["+i+"] = " + ch2[i]);
		}
		System.out.println("===========================");
		
		//3.
		char[] ch3 = { 'J', 'A', 'V', 'k', 'p', 'a', 'b', 'Y', 'e', 'Q', 'T', 's', '9', '5' };  // char[] ch3 = new char[8];
		System.out.println("배열의 길이 : " + ch3.length); 
		
		for (int i = 0; i < ch3.length; i++) { 	// for (int i = 0; i < 8; i++) {
			System.out.println("ch3["+i+"] = " + ch3[i]);
		}
		System.out.println("===========================");
		
		String[] str = { "a", "kbs", "Park", "D", "you", "encore", "KOSA" };
		for (int i = 0; i < str.length; i++) { 	
			System.out.println("str["+i+"] = " + str[i]);
		}
		
		System.out.println(str[3]);
		
//		char[] ch4 = { };
//		char[] ch5 = new char[]{ };  
	}
}

/*
	배열(Array)
   - 일괄처리
   - 동일한 데이터 모임
   - 메모리상에 연속적 모임
   - index 는 0부터 시작함
   - for문이랑 친함

  - 형식>
   자료형[] 배열명 = new 자료형[크기]; 
   int[] a = new int[30];   // int a[] = new int[30]

  자료형[][] 배열명 = new 자료형[행크기][열크기]; 
   int[] a = new int[2][3];

  자료형[][][] 배열명 = new 자료형[면크기][행크기][열크기]; 
   int[] a = new int[2][2][3];
   
*/