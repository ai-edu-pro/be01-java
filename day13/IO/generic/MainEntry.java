package day13.IO.generic;

import java.util.Date;

class Point { }

public class MainEntry {
	public static void main(String[] args) {
		GenericEx<String> t1 = new GenericEx<String>();
		String[] str = { "abc", "kbs", "dirotor" };
		t1.set(str);		t1.print();
		System.out.println("=============================");
		
		GenericEx<Integer> t2 = new GenericEx<Integer>();
		Integer[] num = { 1,2,3,4,5,6,7,8 };
		t2.set(num);		t2.print();
		System.out.println("=============================");
		// Double type
		
		GenericEx<Object> t3 = new GenericEx<Object>();
		Object[] obj = {"12.45", 2, new Date(), 47.2, 5.5, "text", new Point() };
		t3.set(obj);    t3.print();
	}
}


/*
class GenericEx<T, U> {
	
	T  x, z;
	U y;
	
	public void SetX(T x) {
		this.x = x;
	}
	
	public T getX() {
		return x;
	}
}
*/