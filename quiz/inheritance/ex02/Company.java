package quiz.inheritance.ex02;

import java.util.Scanner;

public class Company {
	Scanner sc = new Scanner(System.in);

	protected String name;
	protected String department;
	protected String telephone;

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public void input() {
		System.out.println("이름을 입력하세요 ");
		name = sc.next();
		System.out.println("부서를 입력하세요 ");
		department = sc.next();
		System.out.println("전화번호를 입력하세요 ");
		telephone = sc.next();
	}

	public Company() { }
	
	public void display() {
		System.out.println("이름 : " + name);
		System.out.println("부서 : " + department);
		System.out.println("연락처 : " + telephone);

	}

}
