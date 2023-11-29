package quiz.inheritance;

import java.util.Scanner;

public class PartTime extends Employee {
	
	protected int hourly = 5000;
	protected int hour;
	protected int day;
	
	Scanner sc = new Scanner(System.in);
	public void setHour(int hour) {
		this.hour = hour;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void show() {
		System.out.print("직원이름을 입력하세요 : ");		setName(sc.next());
		System.out.print("부서를 입력하세요 : ");		    setDept(sc.next());
		System.out.print("연락처를 입력하세요 : ");		setPhone(sc.next());
		System.out.print("사원번호를 입력하세요 : ");		setEmpNO(sc.nextInt());
		System.out.println("몇일 일했나요?? : ");		    setDay(sc.nextInt());
		System.out.println("하루에 몇시간 일함?? : ");	setHour(sc.nextInt());
		super.disp();
		System.out.println("알바월급 : " + (day * hour * hourly));
	} // show m end


} // PartTime class end
