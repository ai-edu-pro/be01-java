package day16_gui.Swing;

import java.awt.Color;

import javax.swing.*;
import javax.swing.event.*;

public class TabWindows extends JFrame implements ChangeListener {
	JTabbedPane pane;
	JLabel  lbl;
	
	public TabWindows(String str){
		super(str);
		JPanel  one, two, three;
		pane = new JTabbedPane();
		lbl = new JLabel("              ");
		
		one = new JPanel();
		one.add(new JLabel("레이블1"));
		one.add(new JTextField("필드1"));
		one.setBackground(Color.pink);
		pane.addTab("One", one);
		
		two = new JPanel();
		two.add(new JLabel("레이블2"));
		two.add(new JTextField("필드2"));
		two.setBackground(Color.yellow);
		pane.addTab("Two", two);
		
		three = new JPanel();
		three.add(new JLabel("레이블3"));
		three.add(new JTextField("필드3"));
		three.setBackground(Color.cyan);
		pane.addTab("Three", three);
		
		pane.setSelectedIndex(0);
		pane.addChangeListener(this);		this.getContentPane().add("North", new JLabel("레이블4"));
		this.getContentPane().add("Center", pane);
		this.getContentPane().add("South", lbl);
		
		this.setSize(300, 200);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//end

	@Override
	public void stateChanged(ChangeEvent e) {
		int index = pane.getSelectedIndex();
		String msg = pane.getTitleAt(index); 
		msg += "연결입니다.";
		lbl.setText(msg);
		pane.setSelectedIndex(index); 
	}
	
	
	public static void main(String[] args) {
		new TabWindows("탭윈도우");
	}
}
