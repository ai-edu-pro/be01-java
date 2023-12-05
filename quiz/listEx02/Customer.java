package quiz.listEx02;

public class Customer { // model
	//
	protected String name;
	protected String add;
	protected String tel;

	//
	Customer() {
	}

	Customer(String name, String add, String tel) {
		this.name = name;
		this.add = add;
		this.tel = tel;
	}

	//
	public void display() {
		System.out.println("이름    : " + name);
		System.out.println("주소    : " + add);
		System.out.println("연락처 : " + tel);
	}// display()

}// Customer