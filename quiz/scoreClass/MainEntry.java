package quiz.scoreClass;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		Score s = new Score();
		//s.disp();
		
		s.setKor(100);		s.setCom(77);		s.setEng(88);
		s.disp();
		System.out.println("========================");
		Score s2 = new Score(55, 77, 99);
		s2.disp();
		
		s2.input();
		s2.disp();
		
	}
}
