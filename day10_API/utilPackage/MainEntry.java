package day10_API.utilPackage;

import java.util.Calendar;
import java.util.Date;

public class MainEntry {
	public static void main(String[] args) {
		Calendar  c = Calendar.getInstance();  // system이 갖고 있는 날짜 얻어옴
		
		System.out.println(c.get(Calendar.YEAR) + "년");
		System.out.println( (c.get(Calendar.MONTH)+1) + "월"); // 월은 0부터 시작함
		System.out.println(c.get(Calendar.DATE) + "일");
		
		Date date = new Date();
		int h = date.getHours();
		int m = date.getMinutes();
		int s = date.getSeconds();
		System.out.println("현재 시간은 " + h+" : "+m+" : "+ s);
		
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		
		c2.set(2022, 12, 20, 0, 0);
		
		if( c1.after(c2) ) {
			System.out.println("O");
		} else if( c.before(c2) ) {
			System.out.println("X");
		} else if( c1.equals(c2)) {
			System.out.println("==");
		}
	}
}








