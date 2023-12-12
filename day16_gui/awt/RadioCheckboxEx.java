package day16_gui.awt;
import java.awt.*;
public class RadioCheckboxEx{
	public static void main(String[] args){
		Frame f=new Frame("������ üũ�ڽ� �׽�Ʈ");
		Panel p=new Panel();
		CheckboxGroup group = new CheckboxGroup();
		Checkbox radio1=new Checkbox("����",group,false);
		Checkbox radio2=new Checkbox("����",group,false);
		Checkbox radio3=new Checkbox("�߼�",group,true);
		p.add(radio1);
		p.add(radio2);
		p.add(radio3);	
		f.add(p);
		
		f.setSize(300,100);
		f.setVisible(true);
	}
}
