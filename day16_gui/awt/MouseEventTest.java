package day16_gui.awt;
import java.awt.*;
import java.awt.event.*;
class  MouseEventTest extends Frame{
	Button b;
	MouseEventTest(){
		setLayout(new FlowLayout());
		b = new Button("Mouse Event..");
		b.addMouseListener(new MouseListener(){
			public void mouseClicked(MouseEvent e){}
			public void mousePressed(MouseEvent e){}
			public void mouseReleased(MouseEvent e){}
			public void mouseEntered(MouseEvent e){
				b.setForeground(Color.red);
			}
			public void mouseExited(MouseEvent e){
				b.setForeground(Color.black);
			}
		});
		add(b);
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MouseEventTest();	
	}
}
