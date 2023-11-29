package quiz.inheritance.ex02;

public class NoRegular extends Company {

	protected double pay;

	public void input() {
		super.input();
		System.out.println("급여를 입력하세요(정규직 급여의 70%)  ");
		pay = sc.nextInt();
		pay = pay * 0.7;
	}

	public void display() {
		super.display();
		System.out.println("급여 : " + pay);
		System.out.println("직급 = 비정규직");
	}

}
