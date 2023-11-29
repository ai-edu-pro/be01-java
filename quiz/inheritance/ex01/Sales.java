package quiz.inheritance.ex01;

public class Sales extends Regular {

	public Sales(String empNum, String name, String title, String dept, String phone) {
		super(empNum, name, title, dept, phone);
		pay *= (1.2);
	}
	
//	public int getPay() {
//		return pay *= (1.2);
//	}
	public void display(){
		super.display();
		System.out.println(", "+pay);
	}
}
