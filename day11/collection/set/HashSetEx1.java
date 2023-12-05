package day11.collection.set;

import java.util.HashSet;
import java.util.Iterator;

// Set : 순서없고, 중복허용하지 않음
public class HashSetEx1 {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();  // new HashSet<>();
		hs.add("키보드");		hs.add("컵");		hs.add("마우스");		hs.add("볼펜");		hs.add("키보드");
		
		System.out.println("요소 개수 : " + hs.size());
		Iterator it = hs.iterator();  // 
		
		while( it.hasNext() ) {  //다음 요소가 있다면,...
			System.out.println(it.next());
		}
		
		HashSet<Integer> hs2 = new HashSet<>();	
		hs2.add(200);
		hs2.add(3);
		hs2.add(1000);
		hs2.add(30);
		
		System.out.println("-----------------------------");
		for (Integer item : hs2) {
			System.out.println(item);
		}
		
		System.out.println("-----------------------------");
		for (String item : hs) {
			System.out.println(item);
		}
		
		System.out.println("-----------------------------");
		for (Object item : hs) {
			System.out.println(item);
		}
		
		System.out.println("-----------------------------");
		it = hs2.iterator(); 
		while( it.hasNext() ) {  // 다음 요소가 있다면,...
			System.out.println(it.next());  // 요소를 꺼내와서 출력
		}
	}
}














