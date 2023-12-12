package day16_gui.awt;
import java.awt.*;
import java.awt.event.*;
public class MouseEventEx extends Frame 
									implements ActionListener, MouseListener {	
	Panel p = new Panel();
	Button test = new Button("Test");
	Button exit = new Button("종료");
	TextArea ta = new TextArea();
	public MouseEventEx() {
		super("MouseEvent 테스트");
		p.add(test);
		p.add(exit);
		ta.setEditable(false);
		add("South",p);
		add("Center",ta);
		setBounds(300,300,300,300);
		setVisible(true);
		test.addMouseListener(this);
		exit.addActionListener(this);				
	}
	public static void main(String args[]) {
		new MouseEventEx();
	}
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
	public void mouseEntered(MouseEvent e) {
		ta.append("Mouse Enter Event... \n");
	}
	
	public void mousePressed(MouseEvent e) {
		ta.append("Mouse Press Event...\n");
	}
	
	public void mouseReleased(MouseEvent e) {
		ta.append("Mouse Release Event...\n");
	}
		
	public void mouseClicked(MouseEvent e) {
		ta.append("Mouse Click Event...\n"); 
	}
	
	public void mouseExited(MouseEvent e) {
		ta.append("Mouse Exit Event...\n"); 
	}	
}	