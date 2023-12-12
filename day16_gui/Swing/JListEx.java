package day16_gui.Swing;

import javax.swing.*;
import java.awt.*;
import java.beans.Transient;
import java.util.*;

public class JListEx extends JPanel {
	String[] str = {"���ѹα�", "�߱�", "����", "�̱�", "����", "ĳ����", "�߽���", "�����"};
	JList list;
	Vector info;
	public JListEx(){
		this.setLayout(new BorderLayout());
		list = new JList();
		info = new Vector();
		
		for (int i = 0; i < 8; i++) {
			info.addElement(str[i]);
		}//for end
		
		list.setListData(info);
		add("Center", new JScrollPane(list));
		add("South", new JLabel("����Ʈ ����"));
	}//end
	@Override
	@Transient
	public Dimension getPreferredSize() {
		
		return new Dimension(200, 150);
	}
	
	public static void main(String[] args) {
		JFrame f = new JFrame("JList ����");
		JListEx pane = new JListEx();
		f.setForeground(Color.blue);
		f.setBackground(Color.lightGray);
		f.getContentPane().add(pane);
		f.setSize(pane.getPreferredSize());
		f.setVisible(true);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}









