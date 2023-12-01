package day10_API.util;
import java.util.Date;
class Date1{
	public static void main(String[] args) {
		Date date = new Date();
		int h = date.getHours();
		int m = date.getMinutes();
		int s = date.getSeconds();

		System.out.println("현재시간은 "+h+"시 "+m+"분 "+s+"초 입니다.");
		if(h > 12)
			System.out.println("현재 시간은 오후 "+(h-12)+"시 "+m+"분 "+s+"초 입니다.");
		else
			System.out.println("현재 시간은 오전"+h+"시 "+m+"분 "+s+"초 입니다.");
	}
}
