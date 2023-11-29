package quiz.inheritance.ex01;

public class Regular extends Emp {

	protected int pay;
	
	public Regular(String empNum, String name, String position, String dept, String phone) {
		super(empNum, name, position, dept, phone);
		
		if(position.equals("����"))   // == 
			pay = 5000000;
		else if(position.equals("����"))
			pay = 4000000;
		else if(position.equals("�븮"))
			pay = 3000000;
		else if(position.equals("���"))
			pay = 2000000;	
		else if(position.equals("����"))
			pay = 7000000;		
	}

	public void display(){
		super.display();
		System.out.println(", "+pay);
	}
}
