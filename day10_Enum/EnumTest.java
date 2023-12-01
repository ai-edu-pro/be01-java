package day10_Enum;

//> enum 열거형 - 새로운 클래스 타입을 정의하는것
//- 특정한 값만을 가질 수 있는 데이터 타입을 정의 할때 필요하다.
//[접근지정자] enum 열거형이름 { 필요한 상수들 나열,.....}

enum Day {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
	THURSDAY, FRIDAY, SATURAY
}

public class EnumTest {
	Day day;
	
	public EnumTest(Day day) {
		this.day = day;
	}
	
	public void tellItLikeItIs() {
	
		switch (day) {
			case MONDAY:
				System.out.println("Mondays are bad.");
				break;
			case FRIDAY:
				System.out.println("Friday are better.");
				break;
			case SATURAY:
				System.out.println("Weekends are best.");
				break;
	
			default:
				System.out.println("Midweek days are so-so.");
				break;
		}
	}
}













