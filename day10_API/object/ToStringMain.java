package day10_API.object;

class Rectangle {
	int x, y;
	
	public void display() {  // user method
		System.out.println(x +", " + y);
	}

	@Override
	public String toString() {
		return "Rectangle [x=" + x + ", y=" + y + "]";
	}
	
//	@Override
//	public String toString() {
//		String str = x +", " + y;
//		return str;
//	}
}

public class ToStringMain {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
//		r.display();
		System.out.println(r);  // r.toString()
	}
}
