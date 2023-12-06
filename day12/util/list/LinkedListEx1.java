package day12.util.list;
import java.util.*;
class  LinkedListEx1{
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.add("c");
		list.add("d");
		list.add("k");
		list.add("o");
		list.add("p");
		list.add("x");
		list.addFirst("a");
		list.addLast("z");
		System.out.println(list);
		list.remove("k");  // remove("data value");
		System.out.println(list);
		list.remove(2);  // remove(index number);
		System.out.println(list);
		list.removeFirst();
		System.out.println(list);
		list.removeLast();
		System.out.println(list);  // [c, o, p, x]
		list.set(2,"a");  // 교체 
		System.out.println(list);   // [c, o, a, x]
		list.set(3,list.get(1)+"change");
		System.out.println(list);   // [c, o, a, ochange]
		String str1 = (String)list.peek();
		System.out.println("=====================");
		System.out.println(str1);  // c
		System.out.println(list);  // [c, o, a, ochange]
		String str2 = (String)list.poll();  
		System.out.println(str2);  // c
		System.out.println(list);  // [o, a, ochange]
		list.offer("a");
		System.out.println(list);
		String str3 = (String)list.remove();
		System.out.println(str3);
		System.out.println(list);
	}
}
