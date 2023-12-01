package day10_API.util;
import java.util.*;
class  CalendarEx1{
	public static void main(String[] args) {
		
		final String[] day = {"", "일", "월", "화", "수", "목", "금", "토"};
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		date1.set(2021, 8, 11); 
		
		System.out.println("date1은 "+ toString(date1) + 
			day[date1.get(Calendar.DAY_OF_WEEK)]+"요일이고,");
		System.out.println("오늘(date2)은 " + toString(date2) + 
									day[date2.get(Calendar.DAY_OF_WEEK)]+"요일입니다.");
		long difference = (date2.getTimeInMillis() - date1.getTimeInMillis())/1000;  //  1/1000 <=== 1초
		System.out.println("(date1)부터 지금(date2)까지 " + 	difference +"초가 지났습니다.");
		
		System.out.println("(day)로 계산하면 " + difference/(24*60*60) +"일입니다.");	// 1일 = 24 * 60 * 60 
	}
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+"년 "+ (date.get(Calendar.MONTH)+1) + 
										"월 " + date.get(Calendar.DATE) + "일 ";
	}
}