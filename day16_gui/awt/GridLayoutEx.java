package day16_gui.awt;
import java.awt.*;
public class GridLayoutEx{
	public static void main(String[] args){
		Frame f=new Frame("GridLayout �׽�Ʈ");		
		f.setLayout(new GridLayout(1,1));
		Button b1=new Button("1,1");
		Button b2=new Button("1,2");
		Button b3=new Button("1,3");
		Button b4=new Button("1,4");
		Button b5=new Button("2,1");
		Button b6=new Button("2,2");
		Button b7=new Button("2,3");

		f.add(b1);f.add(b2);f.add(b3);
		f.add(b4);f.add(b5);f.add(b6);
		f.add(b7);
		
		f.setLocation(300,300);
		f.setSize(200,200);
		f.setVisible(true);
	}
}