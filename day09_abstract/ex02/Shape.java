package day09_abstract.ex02;

public abstract class Shape {
	
	double result = 0;
	
	public abstract double calc(double x) ; // abstract method
	public abstract void show(String name) ;
	
	public void view() { // generic method
		System.out.println("super class Shape 입니다.");
	}

}
