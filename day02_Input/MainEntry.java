package day02_Input;

//패키지 임포트하기 : import 
import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("integer data input : ");
		int su = sc.nextInt();
		System.out.print("name input : ");
		String name = sc.next();
		
		System.out.println(su + ", name : " + name);
		
	}
}
