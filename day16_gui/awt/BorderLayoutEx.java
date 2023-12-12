package day16_gui.awt;
import java.awt.*;
public class BorderLayoutEx{
	public static void main(String[] args){
		Frame f=new Frame("BorderLayout 테스트");
		Button east=new Button("EAST");
		Button west=new Button("WEST");
		Button center=new Button("CENTER");
		Button south=new Button("SOUTH");
		Button north=new Button("NORTH");
		Panel p = new Panel();
		List list = new List(3,true);
		list.add("홍길동");
		list.add("김길동");
		list.add("이길동");
		list.add("박길동");
		p.add(list);
		f.add(east, BorderLayout.EAST);
		f.add(west, BorderLayout.WEST);
		f.add(p, BorderLayout.CENTER);
		f.add("South", south);
		f.add("North", north);		
		f.setLocation(300,300);
		f.setSize(200,200);
		f.setVisible(true);
	}
}