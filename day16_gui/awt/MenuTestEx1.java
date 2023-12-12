package day16_gui.awt;
import java.awt.*;
class  MenuTestEx1{
	public static void main(String[] args) {
		Frame f  = new Frame("Menu Test");
		MenuBar mb = new MenuBar();
		Menu m1 = new Menu("����");
			MenuItem mi1 = new MenuItem("����",new MenuShortcut('o'));
			CheckboxMenuItem mi2 = new CheckboxMenuItem("�ݱ�");
			Menu m1m = new Menu("����");
				MenuItem m1m1 = new MenuItem("��������");
				MenuItem m1m2 = new MenuItem("�ٸ�����");
		m1m.add(m1m1);
		m1m.add(m1m2);
		m1.add(mi1);
		m1.add(mi2);
		m1.addSeparator();
		m1.add(m1m);

		mb.add(m1);
		f.setMenuBar(mb);
		f.setSize(300,300);
		f.show();
	}
}
