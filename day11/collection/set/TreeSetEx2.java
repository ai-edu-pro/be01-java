package day11.collection.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx2 {
	public static void main(String[] args) {
		
		Set set = new TreeSet();  // TreeSet<Type>
		
		for (int i = 0;  set.size() < 6 ; i++) {
			
			int num = (int)(Math.random() * 45) + 1;   // 0 ~ n-1
			
			set.add(num);
		}
		
		System.out.println(set);
	}
}
