/*/
package day16_Lambda;

interface Message {
	void something();  // void 형태
}

class Person {
	public void greeting(Message msg) {
		msg.something();
	}
}

public class MainEntry {
	public static void main(String[] args) {
		// Lambda Expression , JDK 1.8 이상
		Person p = new Person();
		
		p.greeting(new Message() {  // 일반 상태 
			@Override
			public void something() {
				System.out.println("good morning");
				System.out.println("한주 동안 열공합시다.");
			}
		});
		
		System.out.println("----------------------------");
		p.greeting(() -> {
			System.out.println("lambda good morning");
			System.out.println("lambda 한주 동안 열공합시다.");
		});
		
	}
}
//*/

// public int sum(int x, int y ) {  return  x + y ;  }
// ( x ,  y ) -> { x + y }

// () -> { }







