package day06_method.overload;

// overload(중복)함수

public class MainEntry {
	
	public static int plus(int x, int y, int z) {
		int hap = x + y + z;
		return  hap;   //x + y;
	}
	
	public static double plus(int x, int y, int z, int a) {  // 함수원형 타입 - double
		return  x + y + z + a ;   // return int
	}
	
	public static void add(String str1, String str2) {
		System.out.println(str1 + str2);
	}
	public static void add(int str1, int str2) {
		System.out.println(str1 + str2);
	}
	public static void add(double str1, double str2) {
		System.out.println(str1 + str2);
	}
	public static void add(int str1, String str2) {
		System.out.println(str1 + str2);
	}
	
	public static String name(String name) {
		return name;
	}
	public static String name(String name, int age) {
		return name + ", " + age;
	}
	
	public static void main(String[] args) {
		
	}
}







