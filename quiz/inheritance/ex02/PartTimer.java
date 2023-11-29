package quiz.inheritance.ex02;

public class PartTimer extends Company {

	protected int time;
	protected int pay = 100000;

	public void input() {
		super.input();
		System.out.println("일한날짜를 입력하세요(일당 10만원) ");
		time = sc.nextInt();
		pay = time * pay;
	}

	public void display() {
		super.display();
		System.out.println("급여 : " + pay);
		System.out.println("직급 = 파트타이머");
	}

}
