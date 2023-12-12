package day16_gui.awt;
import java.awt.Frame;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.List;
import java.awt.Choice;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.TextField;
import java.awt.TextArea;
class  Frame3 extends Frame{
	TextArea ta;
	public Frame3(String str){
		super(str);
		setLayout(new FlowLayout());
		setBounds(400,200,300,200);
		ta = new TextArea("문장을 넣으세요",5,30,TextArea.SCROLLBARS_VERTICAL_ONLY);
		add(ta);

		show();
	}
	public static void main(String[] args) {
		new Frame3("새창 예제3");
	}
}
