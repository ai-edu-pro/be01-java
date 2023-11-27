package day06_method.ex01;

public class MainEntry {
//	1) 매개변수 없고, 리턴타입 없는 경우
//	public returnType  methodName() {  }
	public static void line() { // 함수정의부
		System.out.println("-------------------------------");
	}
	
//	2) 매개변수 있고, 리턴타입 없는 경우
//	public returnType methodName(parameter val1, parameter val2,.....) {   }
	public static void showName(String name, int age) {
		
		System.out.println("당신의 이름은 "+name+"이시군요.");
		System.out.println("당신의 나이는 "+age+"살.");
	}
	
	public static void main(String[] args) {
		showName("세종대왕", 60);
		System.out.println("main start");
		showName("김연아", 32);
		line(); // 함수 호출
		display();
		line();
		display();
		line();
		System.out.println("main end");
	}
	
	public static void display() {  //함수정의부
		System.out.println("happy doyeon");
	}
}
