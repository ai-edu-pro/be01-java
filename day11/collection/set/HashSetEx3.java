package day11.collection.set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

//import java.lang.*; // 자동 임포트 

class Person { // extends Object {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		return name.hashCode() + age;
		//return Objects.hash(name, age);
	}
	@Override
	public boolean equals(Object obj) {
		
		if( obj instanceof Person ) {
			Person temp = (Person)obj;
			return name.equals(temp.name) && age == temp.age;
		}
		return false;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]\n";
	}
} // Person class end

public class HashSetEx3 {
	public static void main(String[] args) {
		
		Set set = new HashSet();
		
		set.add(new String("happy"));
		set.add(new String("happy"));
		set.add(new String("virus"));
		
		set.add(new Double(12.34));
		set.add(new Double(12.));
		set.add(new Double(12.34));
		
		Person ps = new Person("aaa", 10);
		set.add(ps);
		set.add(new Person("David", 10));
		set.add(new Person("David", 33));
		set.add(new Person("David", 10));
		set.add(new Person("David", 10));
		
		System.out.println(set);
		
//		A a = new A();
//		B b = new B();
//		A bb = new B();
//		
//		System.out.println( b instanceof A );
//		System.out.println( b instanceof B );
//		System.out.println( a instanceof A );
//		System.out.println( a instanceof B );  // false 
		
	}
}

//class A {
//	String name;
//}
//
//class B extends A {
//	
//}












