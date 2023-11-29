package quiz.inheritance.ex01;

public class Regular extends Emp {  // Sub class

	protected int pay;
	
	public Regular(String empNum, String name, String position, String dept, String phone) {
		super(empNum, name, position, dept, phone);
		
		if(position.equals("차장"))   
			pay = 5000000;
		else if(position.equals("과장"))
			pay = 4000000;
		else if(position.equals("대리"))
			pay = 3000000;
		else if(position.equals("사원"))
			pay = 2000000;	
		else if(position.equals("사장"))
			pay = 7000000;		
	}

	public void display(){
		super.display();
		System.out.println(", "+pay);
	}
}
