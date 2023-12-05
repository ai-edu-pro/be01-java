package quiz.listEx01;

import java.util.Scanner;

public class MainEntry_Array {
	public static void main(String[] args) {
		
		int SU = 3;
		
		Customers[] customers = new Customers[SU];
		Scanner sc = new Scanner(System.in);
		String[] title = { "name", "address", "tel" };
		
		for (int i = 0; i < title.length; i++) {
				customers[i] = new Customers();
				//System.out.println(title[i] + " 입력 요망 : ");
				System.out.println((i+1) + " 입력 하세요 ( name, address, tel ) : ");
				customers[i].setName(sc.nextLine());
				customers[i].setAddress(sc.nextLine());
				customers[i].setTel(sc.nextLine());
		}
		
		System.out.println("\nName  \t   Address \t   Phone");
		for (int i = 0; i < customers.length; i++) {
			System.out.println(customers[i].toString());
//			customers[i].show();
		}
	}
}
