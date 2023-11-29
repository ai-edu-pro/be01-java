package day07_oop.ex02;

public class Point {

	private int x, y;

	public Point() {
		this(33,55);
		x = y = 100;
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Point(int x) {
//		System.out.println(111);
		this(x, 22);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void display() {
		//System.out.println(x + ", " + y);
		System.out.println(getX() + ", " + getY());
	}
	
}
