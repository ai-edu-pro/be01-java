package quiz.Abstract.ex01;

public class MainEntry {
	public static void main(String[] args) {
		
		Trans[]  t = new Trans[4];
		
		Object[] name = { new BiClycle(), new Bus(), new Subway(), new Plain() };
		
		String[] str = { "자전거", "버스", "지하철", "비행기" };  
		
		for (int i = 0; i < name.length; i++) {
			t[i] = (Trans)name[i];
			
			t[i].show(str[i]);
		}
		
		
//		new BiClycle().show("자전거");
//		new Bus().show("버스");
//		new Subway().show("지하철");
//		new Plain().show("비행기");
	}
}
