package day16_gui.awt;
import java.awt.*;
import java.awt.event.*;
class  EventEx extends Frame implements ActionListener{
	public void actionPerformed(ActionEvent  e){ // 이벤트 처리 
		System.out.println("==발생된 이벤트 정보==");
		System.out.println("getSource() ="+e.getSource());
		System.out.println("toString() ="+e.toString());
		System.out.println("getID() ="+e.getID());
		System.out.println("paramString() ="+e.paramString());
	}
	public EventEx(String title){
		super(title);
		Button b1 = new Button("버튼"); // 이벤트 소스
		b1.addActionListener(this); // 이벤트 리스너 등록
		add(b1);
		setSize(300,200);
		show();
	}
	public static void main(String[] args) {
		new EventEx("이벤트");
	}
}
