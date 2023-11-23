package day03_control.For.quiz;

public class ForStar {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 1; j++) {
				System.out.print("*");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 4; i >= 1; i--) {
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 1; j++) {
				System.out.print("*");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("=======================");
		// 속빈 마름모
		for (int i = 0; i <= 5; i++) { // row - 개행
			for (int j = 1; j <= 5 - i; j++)
				System.out.print(" ");
			for (int j = 1; j <= 5; j++) { // col - "*" 출력
				if (j == 1 || j == 2 * i - 1) {
					System.out.print("*");
				} else System.out.print(" ");
			} // j end
			System.out.println();
		} // i end

		for (int i = 4; i >= 1; i--) { // row - 개행
			for (int j = 1; j <= 4 - i; j++)
				System.out.print(" ");
			for (int j = 1; j <= 2 * i - 1; j++) { // col - "*" 출력
				if (j == 1 || j == 2 * i - 1) {
					System.out.print("*");
				} else System.out.print(" ");
				
			} // j end
			System.out.println();
		} // i end

		System.out.println("==================");

		// 마름모
		for (int i = 0; i <= 5; i++) { // row - 개행
			for (int j = 1; j <= 5 - i; j++)
				System.out.print(" ");
			for (int j = 1; j <= 2 * i - 1; j++) { // col - "*" 출력
				System.out.print("*");
			} // j end
			System.out.println();
		} // i end

		for (int i = 4; i >= 1; i--) { // row - 개행
			for (int j = 1; j <= 5 - i; j++)
				System.out.print(" ");
			for (int j = 1; j <= 2 * i - 1; j++) { // col - "*" 출력
				System.out.print("*");
			} // j end
			System.out.println();
		} // i end

		System.out.println("==================");

		// 벽에서 떨어진 역정삼각형
		for (int i = 0; i <= 5; i++) { // 개행
			for (int j = 0; j < i; j++)
				System.out.print(" ");
			for (int j = 1; j < 6 - i; j++) { // 출력
				System.out.print("*");
			} // j end
			System.out.println();
		} // i end
		System.out.println("=======================");

		// 벽에서 떨어진 삼각형
		for (int i = 1; i <= 5; i++) { // 개행
			for (int j = 0; j < 5 - i; j++)
				System.out.print(" ");
			for (int j = 0; j < i; j++) { // 출력
				System.out.print("*");
			} // j end
			System.out.println();
		} // i end
		System.out.println("=======================");

		// 역정삼각형
		// for (int i = 5; i >= 1; i--) { // 개행
		for (int i = 0; i <= 5; i++) { // 개행
			// for (int j = 1; j <= i; j++) { // 출력
			for (int j = 1; j < 6 - i; j++) { // 출력
				System.out.print("*");
			} // j end
			System.out.println();
		} // i end
		System.out.println("=======================");

		// 정삼각형
		for (int i = 1; i <= 5; i++) { // 개행
			for (int j = 1; j <= i; j++) { // 출력
				System.out.print("*");
			} // j end
			System.out.println();
		} // i end
		System.out.println("=======================");
		// 정사각형
		for (int i = 1; i <= 5; i++) { // 개행
			for (int j = 1; j <= 5; j++) { // 출력
				System.out.print("*");
			} // j end
			System.out.println();
		} // i end
	}
}
