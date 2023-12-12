package day16_gui.awt;
import java.awt.*;
import java.awt.event.*;
class  ActionEventEx4 extends Frame implements ActionListener{
	TextField tf1, tf2;
	public ActionEventEx4(String str){
		super(str);
		tf1 = new TextField("문자를 입력하세요",20);
		tf2 = new TextField("...",20);
		tf1.selectAll();
		tf1.addActionListener(this);
		tf2.addActionListener(this);
		add("North",tf1);
		add("South",tf2);
		setSize(200,200);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		TextField obj = (TextField)e.getSource();
		if(obj ==tf1){
			tf2.setText(tf1.getText());
			tf2.selectAll();
			tf1.setFocusable(false);
			tf2.setFocusable(true);
			tf1.setText("");
			tf2.requestFocus();
		}else{
			tf1.setText(tf2.getText());
			tf1.selectAll();
			tf2.setFocusable(false);
			tf1.setFocusable(true);
			tf2.setText("");
			tf1.requestFocus();
		}
	}
	public static void main(String[] args) {
		new ActionEventEx4("Action 이벤트");
	}
}
