package day16_gui.awt;
import java.awt.*;
public class TextAreaEx{
	public static void main(String[] args){
		Frame f=new Frame("TextArea Test");
		Panel p=new Panel();
		
		TextArea ta1=new TextArea("default",5,30);
		TextArea ta2=new TextArea("Vertical Scroll",10,25, 
			      TextArea.SCROLLBARS_VERTICAL_ONLY);
		p.add(ta1);
		p.add(ta2);
		f.add(p);
		
		f.setSize(300,300);
		f.setVisible(true);
	}
}