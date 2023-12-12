package day16_gui.awt;
import java.awt.*;
import java.awt.event.*;
class  WindowEx1 extends Frame implements WindowListener{
	public WindowEx1(String str){
		super(str);
		addWindowListener(this);
		setSize(200,100);
		setVisible(true);
	}
	public void windowActivated (WindowEvent  e) {} 
 public void windowClosed (WindowEvent  e) {}     
public  void windowClosing (WindowEvent  e) {
	System.exit(0);
}         
public  void windowDeactivated (WindowEvent  e) {}       
public  void windowDeiconified (WindowEvent  e) {}        
public  void windowIconified (WindowEvent  e){}       
public  void windowOpened (WindowEvent  e) {}
	public static void main(String [] args){
		new WindowEx1("test");
	}
}
