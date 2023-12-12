//*
package day16_Lambda;

// 타입을 써야할 상황이 있다
interface Message {
	void something(int x, int y);  // int 형태, parameter 여러개
//	char c = 'a';
//	a = 'p';
//	void good(int x);
}

interface Talk {
	void something(String x, String y); // functional interface
}

class Person {
	
	public void greeting(Message msg) {
		msg.something(1, 2);
	}
	
	public void greeting(Talk msg) {
		msg.something("Hello", " World");
	}
}

public class LambdaMain4 {
	
	
	public static void main(String[] args) {
		// Lambda Expression , JDK 1.8 이상
		Person p = new Person();
//		char ch2 = 'A';
//		ch2 = 'C';
		
		p.greeting(new Message() {
			@Override
			public void something(int x, int y) {
				System.out.println("parameter value : " + x + ", " + y);	
//				ch2 = '9';
			}
		});
		
		System.out.println("----------------------------");
		
		//p.greeting( ( x, y ) -> { 
		//p.greeting( (int x, int y) -> {  // 매개변수 목록 2개 이상이면 괄호 생략하면 안됨. 람다형태 
		p.greeting( (String x, String y) -> {  
			System.out.println("parameter value : " + x + ", " + y);
//			System.out.println(ch);
			
//			ch = 'B'; // 값 변경 할 수 없다.
			
			num = 2222;  // static 변수값은 변경 가능함
			System.out.println(num);
			
		});
	}
	
	static int  num = 30;
}
//*/

//  형식> 
//  (매개변수 목록) -> { 실행문 }

