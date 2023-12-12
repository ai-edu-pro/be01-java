package day16_gui.awt;
import java.awt.*;
import java.awt.event.*;
class ContainerEx1 extends Frame implements ContainerListener, ActionListener{
	Panel p;
	Button b1, b2;
	public ContainerEx1(String str){
		super(str);
		p = new Panel();
		p.setSize(200,200);
		add("Center",p);
		p.addContainerListener(this);
		b1 = new Button("������Ʈ �߰�");
		b1.addActionListener(this);
		add("South",b1);
		setSize(300,300);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getActionCommand().equals("������Ʈ �߰�")){
			p.add("Center",b2 = new Button("�߰���ư"));
			b1.setLabel("������Ʈ ����");
		}else{
			p.remove(b2);
			b1.setLabel("������Ʈ �߰�");
		}
	}
	public void componentAdded(ContainerEvent e){
		setTitle("������Ʈ �����̳ʿ� �߰�");
	}
	public void componentRemoved(ContainerEvent e){
		setTitle("������Ʈ �����̳ʿ��� ����");
	}
	public static void main(String[] args) {
		new ContainerEx1("�����̳� �̺�Ʈ");
	}
}
