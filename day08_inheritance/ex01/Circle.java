package day08_inheritance.ex01;

public class Circle extends Point {  // Sub class
	private int r;
	
	public Circle() {
		super();
		r = 5;
		System.out.println("Circle default constructor call");
	}

	public Circle(int x, int y, int r) {
		super(x, y);
		this.r = r;
		System.out.println("Circle 3개 constructor call");
	}

	public Circle(int r) {
		this.r = r;
		System.out.println("Circle 1개 constructor call");
	}

	public void disp() {
		super.disp();  // Super class 멤버에 접근
		System.out.println(", " + r);
	}
	
}
