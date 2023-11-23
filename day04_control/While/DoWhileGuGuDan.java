package day04_control.While;

public class DoWhileGuGuDan {
	public static void main(String[] args) {
		// 구구단 전체 출력 - do~while문 이용
		int a = 1, b = 1; // 변수 초기화

		do {
			b = 2; // 안쪽 변수 초기화

			do {
				System.out.print(b + "*" + a + "=" + (a * b) + "\t");
				b++; // 증감식
			} while (b <= 9); // 조건

			System.out.println();
			a++;

		} while (a < 10);
	}
}
