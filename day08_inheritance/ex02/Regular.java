package day08_inheritance.ex02;

public class Regular extends QuizEmployee{
	double pay = 40000000;
	
	public Regular() {
		super();
	}
	
	public Regular(int enumber, int phone, String name, String part) {
		super(enumber, phone, name, part);
	}
	
	public double getPay() {
		return pay;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}
	
}