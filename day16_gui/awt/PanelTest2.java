package day16_gui.awt;
import java.awt.*;
class PanelTest2 extends Frame {
   public PanelTest2() {
      Panel p1,p2;
	  p1=new Panel();
      p1.add(new Button("Button 1"));
      p1.add(new Button("Button 2"));
      p1.add(new Button("Button 3"));
	  add("North",p1);
      p2 = new Panel();
      p2.add(new Button("Button 4"));
      p2.add(new Button("Button 5"));
      p2.add(new Button("Button 6"));
      add("South", p2);
	  setSize(200,200);
   }
   public static void main(String args[]) {
      PanelTest2 f = new PanelTest2();
      f.setVisible(true);
   }
}