package day10_API.util;
import java.util.Date;
import java.text.SimpleDateFormat;

class DateFormatEx1{
	public static void main(String[] args) {
		Date today = new Date();
		
		System.out.println(today);  //
		
		SimpleDateFormat sdf1, sdf4;
		
//		sdf1 = new SimpleDateFormat("yy-MM-dd");
		sdf1 = new SimpleDateFormat("yy년 MM월 dd일");
		sdf4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a EEEE");  // E : 금
		System.out.println(sdf1.format(today));	// format(Date d)
		System.out.println(sdf4.format(today));
	}
}