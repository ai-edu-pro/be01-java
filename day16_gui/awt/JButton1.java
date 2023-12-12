package day16_gui.awt;
import java.awt.*;
import javax.swing.*;
class  JButton1 extends JPanel{
	public JButton1(){
		setLayout(new GridLayout(1,2,5,5));
		AbstractButton btn = new JButton("Ȯ��");
		add(btn);
		btn = new JButton("���");
		add(btn);
	}
	public Dimension getPreferedSize(){
		return new Dimension(400,300);
	}

	public static void main(String[] args) {
		JFrame f = new JFrame("JButton");
		JButton1 panel = new JButton1();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().add(panel,"Center");
		f.setSize(panel.getPreferredSize());
		f.setVisible(true);
	}
}
