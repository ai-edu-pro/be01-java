package quiz.Abstract.ex02;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		while (true) {
			System.out.print("\n여행 수단을 선택하세요\n1번 자전거\n2번 버스\n3번 비행기\n4번 지하철\n0번 종료\n선택 : ");
			int ch = s.nextInt();
			
			switch (ch) {
				case 1:
					Biciycle b = new Biciycle();
					b.run();
	
					break;
				case 2:
	//				Bus bb = new Bus();  // 구현하면됨
	//				bb.run();
	
					break;
				case 3:
	//				Plain p = new Plain();
	//				p.run();
	
					break;
				case 4:
					Subway ss = new Subway();
					ss.run();
	
					break;
				case 0:
					System.out.println("\n모든 운행을 마치고 프로그램 종료합니다.");
					System.exit(0);
					
			}
		}
	}
}
