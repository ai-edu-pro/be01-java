package day16_gui.awt;
import java.awt.*;
import java.awt.event.*;
public class ItemEventEx extends Frame 
									   implements ItemListener, ActionListener{
	Panel p1 = new Panel();
	Panel p2 = new Panel();
	TextArea ta = new TextArea(5, 20);
	Button exit = new Button("����");
	Checkbox cb1 = new Checkbox("�౸", false);
	Checkbox cb2 = new Checkbox("�߱�", false);
	Checkbox cb3 = new Checkbox("��", false);
	Checkbox cb4 = new Checkbox("�豸", false);	
		
	public ItemEventEx(){
		super("ItemEvent �׽�Ʈ");
		p1.add(cb1);	 p1.add(cb2);
		p1.add(cb3);	 p1.add(cb4);
		p2.add(exit);	
		add("North", p1);
		add("South", p2);
		add("Center", ta);
		setBounds(300,300,300,300);
		setVisible(true);	
		exit.addActionListener(this);
		cb1.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e){
				System.out.println(e.getStateChange());
				System.out.println(ItemEvent.SELECTED);
				System.out.println(ItemEvent.DESELECTED);
				if(e.getStateChange() == ItemEvent.SELECTED) 
						ta.append(e.getItem() + "�� �����ϼ̽��ϴ�..\n\n");
				else if(e.getStateChange() == ItemEvent.DESELECTED)
						ta.append(e.getItem() + "�� ����ϼ̽��ϴ�...\n\n");
			}	
		});
		cb2.addItemListener(this);
		cb3.addItemListener(this);
		cb4.addItemListener(this);
	}
	public static void main(String args[]){	
		new ItemEventEx();
	}
	public void actionPerformed(ActionEvent e){
		System.exit(0);
	}

	public void itemStateChanged(ItemEvent e){
		System.out.println(e.getStateChange());
		System.out.println(ItemEvent.SELECTED);
		System.out.println(ItemEvent.DESELECTED);
		if(e.getStateChange() == ItemEvent.SELECTED) 
			ta.append(e.getItem() + "�� ����\n\n");
		else if(e.getStateChange() == ItemEvent.DESELECTED)
			ta.append(e.getItem() + "�� ���\n\n");
	}
}