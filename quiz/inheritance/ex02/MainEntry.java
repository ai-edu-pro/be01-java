package quiz.inheritance.ex02;

import java.util.Scanner;

public class MainEntry {

	public static void main(String[] args) {
		String select = "";
		Scanner sc = new Scanner(System.in);
		Regular regular = new Regular();
		NoRegular noregular = new NoRegular();
		PartTimer parttimer = new PartTimer();

		System.out.println("정규직, 비정규직, 파트타이머를 선택하세요  ");
		select = sc.next();

		if ("정규직".equals(select)) {
			System.out.println("======정규직입니다======");
			regular.input();
			regular.display();
		} else if ("비정규직".equals(select)) {
			System.out.println("======비정규직입니다======");
			noregular.input();
			noregular.display();
		} else if ("파트타이머".equals(select)) {
			System.out.println("======파트타이머입니다======");
			parttimer.input();
			parttimer.display();
		} else {
			System.out.println("정규직,비정규직,파트타이먼 고르세요!!!");
		}
	}

}
