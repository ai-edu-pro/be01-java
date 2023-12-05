package day12.collection.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// key / value  한쌍으로 처리. ( set + list )
public class HashMapEx2 {
	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("연아", new Integer(90));
		map.put("단아", 100);
		map.put("동혁", 50);
		map.put("경민", 80);
		map.put("승민", 75);
//		System.out.println(map);
		Set set = map.entrySet();  		//System.out.println(set);
		Iterator it = set.iterator();  //System.out.println(it.next());
		
//		Set set = (Set)map.entrySet().iterator();
		
		while( it.hasNext() ) {  // 다음 요소가 있느냐?
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("Name : "+e.getKey()+", Score : "+e.getValue());
		}
		
		set = map.keySet();
		System.out.println("참가자 명단 : " +set);
		
		Collection values = map.values();
		it = values.iterator();
		
		int total =0;
		while( it.hasNext() ) {
			Integer i = (Integer)it.next();
			total += i.intValue(); 
		}
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + (float)total / set.size());
		System.out.println("최고점수 : " + Collections.max(values));
		System.out.println("최하점수 : " + Collections.min(values));
		
	}
}









