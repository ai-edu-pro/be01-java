package day04_control.While;

public class MainEntry {
	public static void main(String[] args) {
		System.out.println("for ---");
		for (int i = 1; i < 4; i++) {
			System.out.print(i+"\t");
		}
		
		System.out.println("\nwhile~~~");
		int a = 1;  // 변수초기화
		while( a <= 3 ) {     // while( a++ <= 3 ) { System.out.print(a+"\t"); }
			System.out.print(a+"\t");
			a++; // 증감식
		}
		//System.out.println(a); // 4
		System.out.println("\ndo~while~~~");
		a = 1;  // 변수초기화
		do {
			System.out.print(a+"\t");
			a++; // 증감식
		} while( a <= 3 );
				
	}
}
