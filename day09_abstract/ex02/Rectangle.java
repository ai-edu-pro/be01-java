package day09_abstract.ex02;

public class Rectangle extends Shape {
	@Override
	public double calc(double x) {
		result = x*x;
		return result;
	}
	@Override
	public void show(String name) {
		calc(10);
		System.out.println(name+" : "+result);
	}
}
