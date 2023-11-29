package day08_inheritance.ex01;

public class Rectangle extends Point {
	private int x2, y2;
	
	// 생성자
	public Rectangle(int x2, int y2) {
		super(x2);
		this.x2 = x2;
		this.y2 = y2;
		System.out.println("rrrrr");
	}
	// getter /setter

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}
	
	// disp
	public void disp() {
		super.disp();  // super class 멤버 접근
		System.out.print(", "+x2 + ", " + y2 +", ");
	}
}
