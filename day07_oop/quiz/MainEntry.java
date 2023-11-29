package day07_oop.quiz;

public class MainEntry {
	public static void main(String[] args) {
		TV tv = new TV();
		TV tv1 = new TV("red");
		tv.disp(); // 초기값
		tv.setChannel(7);
		tv.setColor("green");
		tv.disp();
		
		TV tv2 = new TV(7);
		tv2.disp();
		
		TV tv3 = new TV("aqua", 15);
		tv3.disp();
	}
}
