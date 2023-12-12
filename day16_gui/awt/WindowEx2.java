package day16_gui.awt;
import java.awt.*;
import java.awt.event.*;
class  WindowEx2 extends Frame {
	public WindowEx2(String str){
		super(str);
		addWindowListener(new WindowHandler());
		setSize(200,200);
		setVisible(true);
	}
	static class WindowHandler extends WindowAdapter{
		public void windowClosing(WindowEvent e){
			System.out.println("������ â�ݱ�");
			System.exit(0);
		}
	}
	public static void main(String[] args) {
		new WindowEx2("������ �̺�Ʈ2");
	}
}
