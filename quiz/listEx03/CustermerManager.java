package quiz.listEx03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CustermerManager extends Customer {  // controller & view
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Customer> list = new ArrayList<Customer>();

		int num = 0;
		Iterator itr = list.iterator();

		while (true) {
			System.out.print("원하는 메뉴를 선택하시오" + " (1. 고객 정보 추가, 2. 고객 정보 삭제, 3. 고객 정보 수정, 4. 고객 리스트 출력, 5. 프로그램 종료) : ");
			num = sc.nextInt();
			if (num == 1) {
				list.add(new Customer());
				System.out.println("==========현재 고객 목록==========");
				for (int i = 0; i < list.size(); i++) {
					System.out.println("Customer " + (i + 1) + list.get(i));
				}
				System.out.println();
			} else if (num == 2) {
				if (!itr.hasNext()) {
					System.out.println("삭제할 고객 정보가 없습니다.");
					continue; // while, do~while 문에서 만나면 조건으로 간다.
				}
				System.out.print("삭제하기를 원하는 고객의 번호를 입력하시오 ( 1 ~ ) : ");
				list.remove(sc.nextInt() - 1);
				System.out.println("==========현재 고객 목록==========");
				for (int i = 0; i < list.size(); i++) {
					System.out.println("Customer " + (i + 1) + list.get(i));
				}
			} else if (num == 3) {
				if (!itr.hasNext()) {
					System.out.println("수정할 고객 정보가 없습니다.");
					continue;
				}
				System.out.print("수정하기를 원하는 고객의 번호를 입력하시오 ( 1 ~ ): ");
				list.set(sc.nextInt() - 1, new Customer()); // 교체
				System.out.println("==========현재 고객 목록==========");
				for (int i = 0; i < list.size(); i++) {
					System.out.println("Customer " + (i + 1) + list.get(i));
				}
			} else if (num == 4) {
				System.out.println("==========현재 고객 목록==========");
				for (int i = 0; i < list.size(); i++) {
					System.out.println("Customer " + (i + 1) + list.get(i));
				}
			} else if (num == 5) {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요 : ");
			}
		}

	}
}
