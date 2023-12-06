package quiz.mapEx01;

import java.util.Scanner;

public class MainEntry {   // View
	
	public static void main(String[] args) {
		VideoManager vm = new VideoManager();
		Scanner sc = new Scanner(System.in); 
		char ch;
		do {
			System.out.println("환영합니다!");
			System.out.println("1. 비디오 추가");
			System.out.println("2. 비디오 삭제");
			System.out.println("3. 비디오 변경");
			System.out.println("4. 비디오 출력");
			System.out.println("5. 대여");
			System.out.println("6. 반납");
			ch = sc.next().toLowerCase().charAt(0);
			switch(ch) {
				case '1':
					vm.addVideo();
					break;
				case '2':
					vm.delVideo();
					break;
				case '3':
					vm.editVideo();
					break;
				case '4':
					vm.printVideo();
					break;
				case '5':
					vm.rentVideo();
					break;
				case '6':
					vm.returnVideo();
					break;
				default:
					if(ch != 'q')
						System.out.println("잘못된 입력입니다.");
					break;
			}
		} while(ch != 'q');
		System.out.println("시스템을 종료합니다.");
	}
}
