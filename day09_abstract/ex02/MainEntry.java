package day09_abstract.ex02;

public class MainEntry {
	public static void main(String[] args) {
		
		//3. 배열 이용한 형태
		Shape[] ss = new Shape[3]; // 배열 선언 및 생성
		ss[0] = new Circle();
		ss[1] = new Rectangle();
		ss[2] = new Triangle();
		
		String[] name = { "Circle" , "Rectangle", "Triangle" };
		
		for (int i = 0; i < ss.length; i++) {
			ss[i].show(name[i]);
		}
		
		System.out.println("**********************");
		
		//2. Shape 부모 추상클래스를 이용해서 객체 생성
		Shape sh = new Circle();
		sh.show("원원원");
		
		sh = new Rectangle();
		sh.show("Rectangle");
		
		sh = new Triangle();
		sh.show("Triangle");
		
		System.out.println("**********************");
		
		//1. 각자의 클래스로 객체 생성 형태
		//new Circle().show("원");
		Circle c = new Circle();
		c.show("Circle");
		new Triangle().show("삼각형");
		new Rectangle().show("사각형");
		
		
	}
}
