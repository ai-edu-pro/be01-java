/*
package day16_Lambda;

interface Message {
	int something(int x);  // int 형태, parameter 
}

class Person {
	public void greeting(Message msg) {
		int su = msg.something(80);
		System.out.println("Number is : "+ su);
	}
}

public class LambdaMain2 {
	public static void main(String[] args) {
		// Lambda Expression , JDK 1.8 이상
		Person p = new Person();
		
		p.greeting(new Message() {  // return type , parameter value
			@Override
			public int something(int x) {
				System.out.println("parameter value : " + x);
				return 100;
			}
		});
		
		System.out.println("----------------------------");
//		p.greeting( (x) -> {
		p.greeting( x -> {  // int x 처럼 타입 안써도 되고, 괄호도 안써도 됨. 람다형태 
			System.out.println("parameter value : " + x);
			return x;
		});
		
		p.greeting( x ->  9999 );
		p.greeting( x ->  x );
		
	}
}
//*/

//  형식> 
//  (매개변수 목록) -> { 실행문 }

