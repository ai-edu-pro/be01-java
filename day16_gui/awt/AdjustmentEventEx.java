package day16_gui.awt;
import java.awt.*;
import java.awt.event.*;
class  AdjustmentEventEx extends Frame implements AdjustmentListener{
	Scrollbar r, g, b;
	Panel p;
	public AdjustmentEventEx(String str){
		super(str);
		r = new Scrollbar(Scrollbar.HORIZONTAL,0,10,0,255);
		g = new Scrollbar(Scrollbar.HORIZONTAL,0,10,0,255);
		b = new Scrollbar(Scrollbar.HORIZONTAL,0,10,0,255);
		r.addAdjustmentListener(this);
		g.addAdjustmentListener(this);
		b.addAdjustmentListener(this);
		p = new Panel();
		p.add(r);p.add(g);p.add(b);
		add("Center",p);
		setSize(300,200);
		setVisible(true);
	}
	public void adjustmentValueChanged(AdjustmentEvent e){
		int red, green,blue;
		red = r.getValue();
		green=g.getValue();
		blue = b.getValue();
		p.setBackground(new Color(red,green, blue));
		System.out.println(red+" "+green+" "+blue);
	}
	public static void main(String[] args) {
		new AdjustmentEventEx("스크롤바 이벤트");
	}
}
