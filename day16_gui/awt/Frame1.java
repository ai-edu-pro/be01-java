package day16_gui.awt;
import java.awt.*;
class  Frame1{
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setTitle("메서드로 정의");
		//f.setBackground(Color.blue);
		//f.setSize(400,200);  //화면의 크기 
		//f.setLocation(300,200);//화면의 위치
		f.setBounds(400,200,300,200);//setSize(), setLocation() 하나로 합한 메서드
		f.setResizable (false); 
		f.setVisible(true);  //화면 나타내기
		//show() 화면 나타내기
		//hide() 화면 감추기
	}
}
