package day10_Enum;

public class MainEntry {
	public static void main(String[] args) {
		EnumTest firstDay = new EnumTest(Day.MONDAY);
		firstDay.tellItLikeItIs();
		
		EnumTest thirdDay = new EnumTest(Day.WEDNESDAY);
		thirdDay.tellItLikeItIs();
		
		EnumTest sixthDay = new EnumTest(Day.SATURAY);
		sixthDay.tellItLikeItIs();
	}
}
