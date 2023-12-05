package quiz.listEx02;

import java.util.Scanner;

public class MainEntry {  // view
	static String name;
	static String add;
	static String tel;

	public static void menu() {
		System.out.println("\n\n*-*-*-*-* 메뉴 *-*-*-*-*");
		System.out.println("1. 고객 정보 입력");
		System.out.println("2. 고객 정보 삭제");
		System.out.println("3. 고객 정보 수정");
		System.out.println("4. 모든 고객 보기");
		System.out.println("5. 종료");
		System.out.println("----------------------");
		System.out.print(" >> ");
	}
	
	public static void main(String[] args) {
		CustomerManager cus = new CustomerManager();
		
		Scanner sc = new Scanner(System.in);
		
		try {
			while (true) {  //무한루프 --> 탈출구문
				menu();
				int inNum = sc.nextInt();

				try {
					switch (inNum) {
					case 1:
						System.out.println("\n*-*-*-* 1. 고객 정보 입력 *-*-*-*");
//						inCustomer();
						cus.CustomerAdd();
//						cus.CustomerAdd(name, add, tel);
						System.out.println("* 입력완료");
						break;
					case 2:
						System.out.println("\n*-*-*-* 2. 고객 정보 삭제 *-*-*-*");
						cus.display();
						System.out.println("---------------------------");
						System.out.print("삭제할 고객의 번호를 입력하세요 >> ");
						inNum = sc.nextInt();
						cus.CustomerRmv(inNum);
						break;
					case 3:
						System.out.println("\n*-*-*-* 3. 고객 정보 수정 *-*-*-*");
						cus.display();
						System.out.println("---------------------------");
						System.out.print("수정할 고객의 번호를 입력하세요 >> ");
						inNum = sc.nextInt();
						System.out.println("수정할 고객의 정보를 입력하세요.");
						inCustomer();
						cus.CustomerCh(inNum, name, add, tel);
						break;
					case 4:
						System.out.println("\n*-*-*-* 4. 모든 고객 보기 *-*-*-*");
						cus.display();
						break;
					case 5:
						System.out.println("\n* 프로그램을 종료합니다.");
						System.exit(0);
						break;
					default:
						System.out.println("\nerr)잘못입력하셨습니다. 다시 입력해주세요.");
					} // switch
				} catch (Exception e) {
					System.out.println("err) 없는 고객입니다. 다시 입력해주세요.");
				} // try catch
			} // while
		} catch (Exception e) {
			System.out.println("err) 잘못 입력하셨습니다. 프로그램을 종료합니다.");
		}// try catch

	}// main

	public static void inCustomer() {
		Scanner sc = new Scanner(System.in);

		System.out.print("이름 >> ");
		name = sc.next();
		System.out.print("주소 >> ");
		add = sc.next();
		System.out.print("연락처  >> ");
		tel = sc.next();
	}
}// class