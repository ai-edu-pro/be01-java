package quiz.listEx03;

import java.util.Scanner;

public class Customer {  // model 
	
	public static int cnum = 0;
	private String name;
	private String address;
	private String tel;
	Scanner sc = new Scanner(System.in);

	public Customer() { // 디폴트 생성자함수
		System.out.print("이름을 입력하시오 : ");
		name = sc.next();
		System.out.print("주소를 입력하시오 : ");
		address = sc.next();
		System.out.print("전화번호를 입력하시오 : ");
		tel = sc.next();
	}

	// setter/getter method
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return " [name=" + name + ", address=" + address + ", tel=" + tel + "]";
	}

}
