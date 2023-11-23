package day04_control.While;

public class MultiWhile {
	public static void main(String[] args) {
		int a = 1, b = 1;  // 변수 초기화
		
		while (a <= 2) {
			//안쪽 변수의 초기화
			b = 1;
			while( b <= 3 ) {
				System.out.print(b + "\t");
				b++; // 증감식
				
			} // b end
			//System.out.println("안쪽 변수 : " +b);
			a++; 
			System.out.println();
			
		} // a end
	}
}
