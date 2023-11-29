package quiz.inheritance;

public class Regular extends Employee {
	
	protected int pay;

	public Regular() {
		//super.input();
		/*System.out.print("pay = ");					
	    pay = sc.nextInt();*/
	}
	public void input() {
		super.input();
		System.out.print("pay = ");					
		pay = sc.nextInt();
	}

	public Regular(int empNO, String name, String dept, String phone, int pay) {
		super(empNO, name, dept, phone);
		this.pay = pay;
	}

	public Regular(int pay) {
		this.pay = pay;
	}
	
	public void disp() {
		super.disp();
		System.out.println("급여 : " + pay);
	}
}
