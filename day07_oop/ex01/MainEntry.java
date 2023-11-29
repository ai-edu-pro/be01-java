package day07_oop.ex01;

class Point {
	private int x, y;  // 멤버변수 , int 0 , double/float 0.0, String null 로 초기화 된다.
	
	//멤버함수 - getter / setter method
	public void setX(int x) {  this.x = x; }
	public int getX() { return x; }
	public void setY(int yy) {  y = yy; }
	public int getY() { return y; }
	public void display() {
		//System.out.println(x + ", " + y);
		System.out.println(getX() + ", " + getY());
	}
} // Point end

class Circle {
	private int x, y, r;
	// getter / setter method
	public void setX(int xx) {	x = xx;	}
	public int getX() {	return x;	}	
	public void setY(int yy) {	y = yy;	}
	public int getY() {	return y;	}
	public void setR(int rr) {	r = rr;	}
	public int getR() {	return r;	}
	
	// output
	public void display() {
		System.out.println("x =" + x +", y = " + y + ", r = "+ r);
		//System.out.println(getX() +", " + getY() + ", " + getR() );
	}
} // Circle end

public class MainEntry {
	public static void main(String[] args) {
		// Circle 객체 생성해서 출력하기 
		Circle c = new Circle();
		c.display();
		c.setR(5);   c.setY(100);  c.setX(150);
		c.display();
		
		System.out.println("=============================");
		Point pt = new Point();  // 객체생성, 메모리에할당, 생성자함수 자동호출
		System.out.println(pt.getX()+ ", "+ pt.getY());  //  0,0
		pt.setX(33);
		pt.setY(99);
		//System.out.println(pt.getX()+ ", "+ pt.getY()); // 55, 100
		pt.display(); //
		
//		pt.x = 3;
//		pt.y = 5;
//		System.out.println(pt.x +", " + pt.y);
	}
} // MainEntry end
