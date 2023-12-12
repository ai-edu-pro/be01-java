package day16_gui.awt;
import java.awt.*;
class  MenuTest{
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setSize(300,300);
		MenuBar mb = new MenuBar();
		Menu m1 = new Menu("파일");
			MenuItem m1_1 = new MenuItem("새파일");
			Menu m1_2 = new Menu("저장");
				MenuItem m1_11 = new MenuItem("지금저장");
				MenuItem m1_12 = new MenuItem("빠른저장");
				m1_2.add(m1_11);m1_2.add(m1_12);
			MenuItem m1_3 = new MenuItem("인쇄");
			m1.add(m1_1);
			m1.addSeparator();
			m1.add(m1_2);
			m1.addSeparator();
			m1.add(m1_3);
		Menu m2 = new Menu("편집");
			CheckboxMenuItem cm = new CheckboxMenuItem("상태");
			m2.add(cm);
		Menu m3 = new Menu("보기");
		mb.add(m1);mb.add(m2);mb.add(m3);
		f.setMenuBar(mb);
		f.show();

	}
}
