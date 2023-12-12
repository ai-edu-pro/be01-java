package day16_gui.awt;
import java.awt.*; 
import java.awt.event.*; 
public class KeyEventEx extends Frame implements KeyListener{
	TextArea ta=new TextArea();
	public KeyEventEx(){ 
		super("KeyEvent 테스트");
		add(ta);
		setBounds(300,300,300,300);
		setVisible(true); 
		ta.addKeyListener(this);
	}		
 	public void keyReleased(KeyEvent e){
		ta.appendText(e.getKeyChar() + "를 놓았습니다.\n");
	}
	public void keyTyped(KeyEvent e){
		ta.appendText(e.getKeyChar() + "가 입력 \n");
	}
	public void keyPressed(KeyEvent e){ 
		if(e.getKeyCode()==e.VK_DOWN){
			ta.append("Down Key\n");
		} 
        if(e.getKeyCode()==e.VK_UP){
			ta.append("Up Key\n");
		} 
        if(e.getKeyCode()==e.VK_LEFT){
			ta.append("Left Key\n");
		} 
		if(e.getKeyCode()==e.VK_RIGHT){
			ta.append("Right Key\n");
		} 
		if(e.getKeyCode()==e.VK_ENTER){
			ta.append("Enter Key\n");
		} 
    }        
	public static void main(String[] args){
		new KeyEventEx();
	} 
} 
