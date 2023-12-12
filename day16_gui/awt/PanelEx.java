package day16_gui.awt;
import java.awt.*;
public class PanelEx{
	public PanelEx(){
		Frame f = new Frame("Panel Test");
		Panel p = new Panel();

		p.setBackground(Color.red);
		f.add(p);

		f.setSize(200, 200);
		f.setVisible(true);
	}
	public static void main(String[] args){
		new PanelEx();
	}
}