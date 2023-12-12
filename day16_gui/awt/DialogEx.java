package day16_gui.awt;
import java.awt.*;
public class DialogEx extends Frame{
	public DialogEx(){
		super("Dialog Test");
		Dialog d = new Dialog(this, "사용자 다이얼로그");

		setSize(200, 200);
		setVisible(true);

		d.setSize(200,100);
		d.setVisible(true);
	}
	public static void main(String[] args){
		new DialogEx();
	}
}