package day10_API.util;
import java.util.Calendar;
import java.util.GregorianCalendar;
class  GregorianCalendar1{
	public static void main(String[] args) {
		GregorianCalendar gcal = new GregorianCalendar();
		p("현재 날짜와 시간 \n");
		p(gcal.get(Calendar.YEAR)+"년");
		p((gcal.get(Calendar.MONTH)+1)+"월");
		p(gcal.get(Calendar.DATE)+"일");
		if(gcal.isLeapYear(gcal.get(Calendar.YEAR)))
			p("\n윤년입니다.");
		else
			p("\n윤년이 아닙니다.");
	}
	static void p(String str){
		System.out.print(str);
	}
}
