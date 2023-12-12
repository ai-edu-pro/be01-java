package day16_gui.awt;
import java.awt.*;
public class ChoiceEx{
	public static void main(String[] args){
		Frame f=new Frame("Choice �׽�Ʈ");
		Panel p=new Panel();	
		Choice ch= new Choice();	
		ch.addItem("���");
		ch.addItem("����");
		ch.addItem("��");
		ch.addItem("�ٳ���");	
		p.add(ch);		
		f.add(p);
		
		f.setSize(300,100);
		f.setVisible(true);
	}
}