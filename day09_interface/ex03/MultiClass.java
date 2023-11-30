package day09_interface.ex03;

import day09_abstract.ex02.Shape;
import day09_interface.ex02.IDraw;

public class MultiClass 
				extends Shape implements Test, IDraw {
	
	String irum = "이순신";

	@Override
	public void draw() {
		System.out.println("IDraw interface method");
	}

	@Override
	public void tshow(String name) {
		System.out.println("Test interface method");

	}

	@Override
	public double calc(double x) {
		System.out.println("Shape abstract class");
		return 100;
	}

	@Override
	public void show(String name) {
		System.out.println("Shape class method");
		System.out.println(name + " hi!!!");
		
	}

}
