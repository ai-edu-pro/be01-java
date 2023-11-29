package quiz.inheritance.ex01;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("empNumber >> ");
		String empNum = sc.next();
		System.out.print("name >> ");
		String Name = sc.next();
		
		System.out.print("������Դϱ�?(y/n) >> ");
		String answer2 = sc.next();
		String answer = " ";
		int day = 0;
		if(answer2.charAt(0)=='n'||answer2.charAt(0)=='N'){
			System.out.print("�������Դϱ�?(y/n) >> ");
			answer = sc.next();
		}
		else{
			System.out.print("�� �� ���ϼ̽��ϱ�? >> ");
			day = sc.nextInt();
		}
		System.out.print("position >> ");
		String Title = sc.next();
		System.out.print("Department >> ");
		String Dept = sc.next();
		System.out.print("Phone >> ");
		String Phone = sc.next();
		
		Emp emp = new Emp(empNum,Name,Title,Dept,Phone);
		
		System.out.println("================================");
		if(answer2.charAt(0)=='y' || answer2.charAt(0)=='Y')//�����
			new Time(empNum,Name,Title,Dept,Phone,day).display();
		else
		{
			if(answer.charAt(0)=='y'||answer.charAt(0)=='Y')//������
			{
				emp.display();
				new Sales(empNum,Name,Title,Dept,Phone).display();	
			}
			else//������
				new Regular(empNum,Name,Title,Dept,Phone).display();	
		}		
	}
}
