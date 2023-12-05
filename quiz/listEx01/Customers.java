package quiz.listEx01;

import java.util.Scanner;

/*
 * 문제] Customers class
	name, address, tel  field 
	생성자함수, setter / getter method
 */
public class Customers {
	private String name, address, tel;
	
	public Customers() {
//		this.name = "noName";
//		this.address="Seoul";
//		this.tel="000-0000-0000";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("name >> ");
		this.name = sc.next();
		System.out.print("address >> ");
		this.address = sc.next();
		System.out.print("phone >> ");
		this.tel = sc.next();
		
	}

	public Customers(String name, String address, String tel) {
		super();
		this.name = name;
		this.address = address;
		this.tel = tel;
	}

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
		return "Customers [name=" + name + ", address=" + address + ", tel=" + tel + "]";
	}
	
	
}






