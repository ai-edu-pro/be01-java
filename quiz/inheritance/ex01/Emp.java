package quiz.inheritance.ex01;

public class Emp {  // Super class
	
	protected String empNum, name, position, dept, phone;
	
	public Emp(){}
	
	public Emp(String empNum, String name, String position, String dept, String phone){
		this.empNum = empNum;
		this.name = name;
		this.position = position;
		this.dept = dept;
		this.phone = phone;
	}
	public void display(){
		System.out.print(empNum+", "+name+", "+position+", "+dept+", "+phone);
	}

}
