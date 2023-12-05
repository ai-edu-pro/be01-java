package day12.util.list;
import java.util.*;
class ArrayListEx1{
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);
		list1.add(new Integer(5));  // list1.add(5);
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		ArrayList list2 = new ArrayList(list1.subList(1,4)); // 시작인덱스포함, 끝인덱스미포함
		print(list1, list2);
		Collections.sort(list1);	
		Collections.sort(list2);	
		print(list1, list2);
		
		System.out.println("list1.containsAll(list2):"+ list1.containsAll(list2));
		
		list2.add("B");
		list2.add("C");  // 뒤에 채워진다.
		list2.add(3, "A"); // 인덱스위치, 데이터값
		print(list1, list2);
		list2.set(3, "AA");
		print(list1, list2);
		
		System.out.println("list1.retainAll(list2):"+ list1.retainAll(list2));	
		
		print(list1, list2);
		for(int i= list2.size()-1; i >= 0; i--) {
			if(list1.contains(list2.get(i)))
				list2.remove(i);
		}
		print(list1, list2);
	} // main

	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1:"+list1);
		System.out.println("list2:"+list2);
		System.out.println();		
	}
} // class









