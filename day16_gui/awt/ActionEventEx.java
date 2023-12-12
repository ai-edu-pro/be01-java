package day16_gui.awt;
import java.awt.*;
import java.awt.event.*;
class  ActionEventEx extends Frame implements ActionListener{
	Label lb;
	Button b1, b2;
	public ActionEventEx(String str){
		super(str);
		lb=new Label("버튼을 눌러주세요");
		b1 = new Button("<=버튼");
		b2 = new Button("버튼=>");
		b1.addActionListener(this);
		b2.addActionListener(this);
		Panel p = new Panel();
		p.add(b1);
		p.add(b2);
		add("Center", p);
		add("South",lb);
		setSize(300,200);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		Object obj = e.getSource();
		System.out.println(e.getActionCommand());
		if((Button)obj==b1){
			lb.setText("윈쪽 버튼 눌렀습니다.");
		}else{
			lb.setText("오른쪽 버튼 눌렀습니다.");
		}
	}
	public static void main(String[] args) {
		new ActionEventEx("Action이벤트 ");
	}
}
