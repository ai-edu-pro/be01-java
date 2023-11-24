package day05_random;

import java.util.Random;
import java.util.Scanner;

//문제1] 업/다운 게임 프로그램 작성 (난수 이용)
//1~100 숫자 중에서 임의의 난수 추출해 놓고, 사용자는 5번의 기회를줘서 입력 받는다.  
//그 입력 받은 숫자와 추출한 난수가 같은지를 판정하는 프로그램 작성

public class UpDownGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int num = rand.nextInt(100) + 1; // 난수 추출

		for (int i = 0; i < 5; i++) { // 사용자로 부터 입력 받기 기회 - 5회
			System.out.print("\n" + (i + 1) + "번째 답을 입력하세요(1 ~100 사이값) : ");
			int su = sc.nextInt();
			if ((i == 4) && (su != num)) {
				System.out.println("\n정답을 맞추지 못했습니다. 정답은 : " + num + " 입니다");
			} else if (su == num) {
				System.out.println("\n" + num + "정답입니다");
				System.exit(0); // 프로그램 탈출
			} else if (su < num) {
				System.out.println("up입니다.");
			} else if (su > num) {
				System.out.println("down입니다.");
			}
		}
	}
}
