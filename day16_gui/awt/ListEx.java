package day16_gui.awt;
import java.awt.*;
public class ListEx{
	public static void main(String[] arsg){
		Frame f=new Frame("리스트 테스트");
		Panel p=new Panel();
		List list1=new List(2,false);
		list1.add("김태희");
		list1.add("전지현");
		list1.add("김연아");
		list1.add("소녀시대");	
		p.add(list1);	
		f.add(p);
		
		f.setSize(300,100);
		f.setVisible(true);
	}
}