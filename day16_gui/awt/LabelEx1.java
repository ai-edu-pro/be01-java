package day16_gui.awt;
import java.awt.*;
class  LabelEx1 extends Frame{
	Label label1,label2,label3,label4;
	public LabelEx1(String str){
		super(str);
		setLayout(new FlowLayout());
		label1 = new Label("<��>");
		label2 = new Label("<����>");
		label3 = new Label("<����>");
		label4 = new Label("<�ܿ�>");
		add(label1);
		add(label2);
		add(label3);
		add(label4);
		setSize(300,200);
		show();
	}
	public static void main(String[] args) {
		new LabelEx1("���̺� ����1");
	}
}
