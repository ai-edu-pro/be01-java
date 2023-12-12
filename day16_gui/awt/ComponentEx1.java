package day16_gui.awt;
import java.awt.*;
import java.awt.event.*;
class ComponentEx1 extends Frame implements ComponentListener, ActionListener{
	TextArea ta;
	Button b;
	public ComponentEx1(String str){
		super(str);
		b = new Button("화면에서 사라짐");
		b.addActionListener(this);
		add("South",b);
		ta = new TextArea();
		add("Center",ta);
		addComponentListener(this);
		setSize(300,200);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		try{
			this.hide(); //화면에서 사라짐
			Thread.sleep(3000);	 //3초대기
		}catch(InterruptedException se){
			System.out.println(se);
		}
		this.show();	//다시 출력
	}
	public void componentHidden(ComponentEvent e){
		ta.append("컴포넌트가 화면에서 숨겨짐 \n");
	}
	public void componentMoved(ComponentEvent e){
		ta.append("컴포넌트가 이동함 \n");
	}
	public void componentResized(ComponentEvent e){
		ta.append("컴포넌트 크기변경 \n");
	}
	public void componentShown(ComponentEvent e){
		ta.append("컴포넌트 화면에 보임 \n");
	}
	public static void main(String[] args) 
	{
		new ComponentEx1("컴포넌트 이벤트");
	}
}
