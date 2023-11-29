package quiz.inheritance.ex01;

public class Time extends Emp {
	
	private int day, pay;
	
	public Time(String empNum, String name, String position, String dept, String phone, int day){
		super(empNum, name, position, dept, phone);
		this.day = day;
		pay = day * 80000; 
	}
	public void display(){
		super.display();
		System.out.println(", "+pay);
	}
}
