package day16_gui.awt;
import java.awt.*;
import java.awt.event.*;
class  ItemEventEx2 extends Frame implements ItemListener{
	Choice c1, c2;
	Label lb;
	String [] 대륙 = {"아시아" ,"유럽","아프리카"};
	String [][] 나라 = {{"한국","일본","중국"},
								{"영국","스위스","프랑스"},
								{"이집트","콩고","우간다"}};
	public ItemEventEx2(String str){
		super(str);
		Label lb2 = new Label("대륙과 나라를 선택하세요");
		Panel p = new Panel();
		lb = new Label();
		c1 = new Choice();
		c2 = new Choice();
		c1.addItemListener(this);
		c2.addItemListener(this);
		for(int i = 0; i < 대륙.length; i++){
			c1.add(대륙[i]);
		}
		c2.add("        ");
		p.add(c1);p.add(c2);
		add("North",lb2);  add("Center",p);  add("South",lb);
		setSize(300,200);  setVisible(true);
	}
	public void itemStateChanged(ItemEvent e){
		Choice obj = (Choice)e.getSource();
		String str = "선택한 대륙과 나라는 : ";
		if(obj==c1){
			c2.removeAll();
			int j = c1.getSelectedIndex();
			for(int i = 0; i < 나라[j].length;i++){
				c2.add(나라[j][i]);
			}
		}else{
			str +=c1.getSelectedItem();
			str +=" - "+c2.getSelectedItem();
			lb.setText(str);
		}}
	public static void main(String[] args) {
		new ItemEventEx2("초이스 이벤트");
	}
}
