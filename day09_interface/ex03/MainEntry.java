package day09_interface.ex03;

import day09_abstract.ex02.Shape;
import day09_interface.ex02.IDraw;

public class MainEntry {
	public static void main(String[] args) {
		MultiClass mc = new MultiClass();
		
		mc.draw();
		mc.tshow("강감찬");
		mc.show("광개토대왕");
		System.out.println("==============================");
		IDraw i = new MultiClass();
		i.draw();
		System.out.println(i.su);
		
		System.out.println("==============================");
		Shape s = new MultiClass();
		System.out.println(s.calc(3.3));
		s.show("김희선");
	}
}
