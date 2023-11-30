package day09_abstract.ex01;

import javax.swing.plaf.synth.SynthScrollBarUI;

abstract class Shape {  // abstract class, super class
	double result = 0;
	public abstract double calc();  // abstract method
	public abstract void draw();
	
	public void show() {  // 일반메소드
		System.out.println("Super class Shape");
	}
}  // Shape end

class Circle extends Shape {  // Sub class
	double r = 5.0;

	@Override
	public double calc() {
		result = r * r * Math.PI;
		return result;
	}

	@Override
	public void draw() {
		calc();
		System.out.println("원의 넓이 : " + result + "인 원을 그렸습니다.");
	}
}  // Circle end

class Triangle extends Shape {
	int w = 3, h = 5;
	
	@Override
	public double calc() {
		result = (w * h) / 2;
		return result;
	}

	@Override
	public void draw() {
		calc();
		System.out.println("삼각형의 넓이 : " + result + "인 삼각형을 그렸습니다.");
	}
} // Triangle end

class Rectangle extends Shape {
    int a=5,b=8;

    @Override
    public double calc() {
        result = a*b;
        return result;
    }

    @Override
    public void draw() {
        calc();
        System.out.println("직사각형의 넓이 : " + result + "인 직사각형을 그렸습니다.");

    }
}

public class MainEntry {
	public static void main(String[] args) {
		
		Shape sh = new Circle();  // 상속 받은 자손 클래스로는 객체 생성 할 수 있다.
		sh.draw(); 
		
		sh = new Rectangle();
		sh.draw();
		
		System.out.println("=======================");
		new Rectangle().draw();
		
		new Triangle().draw();
		
		Circle c = new Circle();
		c.draw();
		
		//Shape sh = new Shape();  // 자체적으로 객체 생성할 수 없다.
	}
}

/*
 > abstract class (추상클래스)
   - 미완성 클래스 <--- 자체적으로 객체 생성할 수 없다.
    (단, 상속 받은 자손 클래스로는 객체 생성 할 수 있다.) <--- 다형성
   - 추상메소드를 갖고 있다.
    public void disp() {  } //일반메소드
    public abstract void disp();  // 추상메소드 - 몸체(블럭)를 갖지 않는다.
  - abstract 

   형식>
    public abstract class Point {  // 부모 추상 클래스
		void disp() {   }
		abstract void show(); // 추상메소드
    }

    class Sub extends Super {  // 자손(서브) 클래스
	추상메소드 오버라이드해야한다.
    }

*/







