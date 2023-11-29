package day07_oop.ex02;

public class MainEntry {
	public static void main(String[] args) {
		Point pt = new Point();
		pt.display(); // 초기값
		pt.setX(10);
		pt.setY(10);
		pt.display();
		
		Point pt2 = new Point(1, 2);
		pt2.display();
		
		Point pt3 = new Point(99);
		pt3.setY(88);
		pt3.display();
		
		pt3.setY(77);
		pt3.setX(55);
		pt3.display();
		
		Point pt4 = new Point(1, 3);
	
		
//		System.out.println("Cirlc object");
//		Circle c = new Circle(); //객체생성, 메모리에할당, 생성자함수자동호출
//		c.setR(3); c.setX(100); c.setY(100);
//		c.display();
		
	}
}
