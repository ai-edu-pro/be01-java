package day16_gui.awt;
import java.awt.*;
import java.awt.event.*;
class  ActionEventEx3 extends Frame implements ActionListener{
	Label lb;
	Button [] btn = new Button[7];
Color [] color = {Color.red, Color.orange, Color.yellow, Color.blue, 
						  Color.green, Color.magenta, Color.black};
String [] string = {"red","orange","yellow","blue","green","magenta","black"};
	public ActionEventEx3(String str){
		super(str);
		setLayout(new FlowLayout());
		for(int i = 0; i < 7 ; i++){
			btn[i]=new Button(string[i]);
			btn[i].setForeground(color[i]);
			btn[i].addActionListener(this);
			add(btn[i]);
		}
		setSize(200,200);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		Button obj = (Button)e.getSource();
		for(int i = 0 ; i < 7 ; i++){
			if(obj == btn[i])
				this.setBackground(color[i]);
		}
	}
	public static void main(String[] args) {
		new ActionEventEx3("Action 이벤트");
	}
}
