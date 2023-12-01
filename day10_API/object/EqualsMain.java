package day10_API.object;

class Circle {
	int x, y;
}

public class EqualsMain {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		
		if(c1 == c2 ) System.out.println("same");
		else System.out.println("not same");
		System.out.println(c1.hashCode() + ", "+c2.hashCode());
		
		int x = 3, y = 3;
		System.out.println("기본 자료형 비교");
		if( x == y ) System.out.println("same");
		else System.out.println("not same");
		
		String s1 = new String("korea");
		String s2 = new String("koreA");  //
		
		System.out.println("참조 자료형 비교");
		if( s1 == s2 ) System.out.println("same");
		else System.out.println("not same");
		
		System.out.println("***** equals method ********");
		if( s1.equals(s2) ) System.out.println("same!!!");  // 대소문자 구분
		else System.out.println("not same!!!");
		
		System.out.println("***** equalsIgnoreCase method ********");
		if( s1.equalsIgnoreCase(s2) ) System.out.println("same!!!");  //대소문자 구분 안하고 비교
		else System.out.println("not same!!!");
		 
	}
}







