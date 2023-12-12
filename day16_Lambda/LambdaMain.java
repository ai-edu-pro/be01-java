/*
package day16_Lambda;

interface Message {
	int something();  // int 형태
}

class Person {
	public void greeting(Message msg) {
		int su = msg.something();
		System.out.println("Number is : "+ su);
	}
}

public class LambdaMain {
	public static void main(String[] args) {
		// Lambda Expression , JDK 1.8 이상
		Person p = new Person();
		
		p.greeting(new Message() {  // return type 
			@Override
			public int something() {
				System.out.println("good morning");
				System.out.println("반가워요~.");
				return 300;
			}
		});
		
		System.out.println("----------------------------");
		p.greeting(() -> {
			System.out.println("lambda good morning");
			System.out.println("lambda 반가워요~.222");
			return 50;
		});
		
	}
}
//*/

//  형식> 
//  (매개변수 목록) -> { 실행문 }

