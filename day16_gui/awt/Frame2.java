package day16_gui.awt;
import java.awt.*;
class  Frame2
{
	public static void main(String[] args) 
	{
		Frame f = new Frame();
		f.setTitle("새창예제2");
		f.setSize(200,200);
		f.setBackground(Color.blue);  //Color 클래스를 이용하여 색갈 지정
		f.setLocation(500,200);
		f.show();
		}
}
