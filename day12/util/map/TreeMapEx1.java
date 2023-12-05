package day12.util.map;
import java.util.*;
class TreeMapEx1 {
	public static void main(String[] args) {
		TreeMap tm = new TreeMap();
		tm.put("홍길동",1000);
		tm.put("김길동",1000);
		tm.put("이길동",1000);
		tm.put("황길동",1000);
		System.out.println("홍길동 : "+tm.get("홍길동"));
		System.out.println(tm);
	}
}
