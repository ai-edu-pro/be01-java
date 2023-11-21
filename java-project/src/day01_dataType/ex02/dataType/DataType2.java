package ex02.dataType;

public class DataType2 {
	public static void main(String[] args) {
		String str = "A";
		char ch = 'A';
		char ch2 = 67;
		char ch3 = 'b';
		
		int su = 20; String name ="doyeon"; double dd = 12.34;
		
		System.out.println(ch);
		System.out.println((int)ch);
		System.out.println(ch2 + ", " + (char)ch2);
		System.out.println("name = " +name);
		System.out.println("실수형 데이터 : " + dd);
		System.out.printf("%f %f\n", dd, 33.5678);
		System.out.printf("%10.1f %.2f\n", dd, 33.5678); //       12.3    33.57
		
		for(int i= 65; i <= 90; i++) {
			System.out.print( (char)i + "  ");
		}
		System.out.println("\n\n====================================");
		for(int i= 'a'; i <= 'z'; i++) {
			System.out.print( (char)i + "  ");
		}
		
		System.out.println("\n\n boolean type");
		boolean flag = true;
//		int b = flag; 
		System.out.println(flag);
	}
}



















