package quiz.listEx02;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;

public class CustomerManager extends Customer { // controller
	//
	ArrayList<Customer> list = new ArrayList<Customer>();

	//
	CustomerManager() {
	}

	CustomerManager(String name, String add, String tel) { // 생성자함수 명시적 호출 불가능 - 1회 호출됨
		Customer c = new Customer(name, add, tel);
		list.add(c);
	}

	//
	public void CustomerAdd(String name, String add, String tel) { // 추가
		Customer c = new Customer(name, add, tel);
		list.add(c);
	}
	
	public void CustomerAdd() { // 추가2
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 >> ");
		name = sc.next();
		System.out.print("주소 >> ");
		add = sc.next();
		System.out.print("연락처  >> ");
		tel = sc.next();
		
		Customer c = new Customer(name, add, tel);
		list.add(c);
	}

	public void CustomerRmv(int i) { // 삭제
		System.out.println("\n\n* 삭제된 고객");
		list.get(i - 1).display();
		System.out.println("--------------");
		list.remove(i - 1);
	}

	public void CustomerCh(int i, String name, String add, String tel) { // 수정
		Customer c = new Customer(name, add, tel);
		list.set(i - 1, c); // 교체
	}

	public void display() {
		System.out.println("저장된 고객 수 : " + list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.println();
			System.out.println("- " + (i + 1) + "번 -");
			list.get(i).display();
		} // for
	}// display()
}// CustomerManager





