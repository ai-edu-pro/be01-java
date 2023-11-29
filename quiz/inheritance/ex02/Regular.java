package quiz.inheritance.ex02;

public class Regular extends Company {

	protected int num;
	protected double pay;
	protected int bonus;
	protected String position;

	public void input() {
		super.input();

		System.out.println("사번을 입력하세요 ");
		num = sc.nextInt();

		System.out.println("직급을 입력하세요 ");
		position = sc.next();

		System.out.println("급여를 입력하세요 ");
		pay = sc.nextInt();

		System.out.println("보너스를 입력하세요(1~200(%)) ");
		bonus = sc.nextInt();

		pay = (pay * (bonus / 100)) * pay;
	}

	public void display() {
		super.display();

		System.out.println("사번 : " + num);
		System.out.println("직급 : " + position);
		System.out.printf("급여(보너스포함) : " + "%.1f", pay);

	}

}
