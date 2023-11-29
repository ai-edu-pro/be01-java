package quiz.inheritance;

public class Sales extends Regular {
	
	private double commision, result;

	public Sales() {
		super.input();
		System.out.print("commision = ");		
		commision = sc.nextDouble();
	}

	public Sales(int empNO, String name, String dept, String phone, int pay, double commision) {
		super(empNO, name, dept, phone, pay);
		this.commision = commision;
	}

	public Sales(double commision) {
		this.commision = commision;
	}
	
	public double getCommision() {
		return commision;
	}

	public void setCommision(double commision) {
		this.commision = commision;
	}

	
	public double getResult() {
		return result;
	}

	public double getResult(int pay, double commision) {
		return pay * commision;
	}

	public void disp() {
		double result2 = getResult(super.pay, commision);
		super.disp();
		System.out.println("commision : " + (commision) 
											+ "% , 총 급여 : " + (super.pay + result2));
	}
}
