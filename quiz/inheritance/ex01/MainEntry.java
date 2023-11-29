package quiz.inheritance.ex01;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("empNumber >> ");
		String empNum = sc.next();
		System.out.print("name >> ");
		String Name = sc.next();
		
		System.out.print("계약직입니까?(y/n) >> ");
		String answer2 = sc.next();  //  "y\n"
		String answer = " ";
		int day = 0;
		
		//if( answer2.toUpperCase().equals("N") ) {
		//if(answer2.equals("n") || answer2.equals("n")) {
		if(answer2.charAt(0)=='n'||answer2.charAt(0)=='N'){
			System.out.print("영업사원이십니까?(y/n) >> ");
			answer = sc.next();
		}
		else {
			System.out.print("몇 일 근무하셨나요? >> ");
			day = sc.nextInt();
		}
		System.out.print("position(차장,과장,대리,사원,사장) >> ");
		String Title = sc.next();
		System.out.print("Department >> ");
		String Dept = sc.next();
		System.out.print("Phone >> ");
		String Phone = sc.next();
		
		Emp emp = new Emp(empNum,Name,Title,Dept,Phone);
		
		System.out.println("================================");
		if(answer2.charAt(0)=='y' || answer2.charAt(0)=='Y')  //계약직
			new Time(empNum,Name,Title,Dept,Phone,day).display();
		else
		{
			if(answer.charAt(0)=='y'||answer.charAt(0)=='Y')  //영업사원
			{
				emp.display();
				new Sales(empNum,Name,Title,Dept,Phone).display();	
			}
			else  //정규직
				new Regular(empNum,Name,Title,Dept,Phone).display();	
		}		
	}
}
