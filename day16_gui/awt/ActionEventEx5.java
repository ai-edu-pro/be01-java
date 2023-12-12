package day16_gui.awt;
import java.awt.*;
import java.awt.event.*;
class  ActionEventEx5 extends Frame implements ActionListener{
	List list;
	Label lb;
	public ActionEventEx5(String str){
		super(str);
		list = new List(5,false);
		list.add("서울");list.add("부산");list.add("인천");list.add("대구");
		list.add("대전");list.add("광주");list.add("울산");list.add("수원");
		list.add("제주");list.add("경기");list.add("강원");list.add("섬");
		lb = new Label("        ");
		list.addActionListener(this);
		add("Center", list);
		add("South",lb);
		setSize(200,100);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		lb.setText(list.getSelectedItem());
	}
	public static void main(String[] args) 
	{
		new ActionEventEx5("Action예제");
	}
}
