package day16_gui.awt;
import java.awt.*;
class  ButtonEx1 extends Frame{
	Button b1,b2,b3;
	public ButtonEx1(String str){
		super(str);
		setLayout(new FlowLayout());
		b1 = new Button("1번");
		b2 = new Button("2번");
		b3 = new Button("3번");	
		add(b1);
		add(b2);
		add(b3);
		setSize(300,200);
		show();
	}
	public static void main(String[] args) {
		new ButtonEx1("버튼 예제1");
	}
}
