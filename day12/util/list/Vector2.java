package day12.util.list;

import java.util.Vector;
import java.util.Date;
import java.util.Enumeration;
class  Vector2{
	public static void main(String[] args) {
		int i;
		Date date = new Date();
		Vector v = new Vector(3,5);
		v.addElement("자바");
		v.addElement(new Double(10.2));
		v.addElement(date);
		System.out.println("----------3개 객체 추가---------------------");
		System.out.println("size:"+v.size()+" capacity:"+v.capacity());
		for(i = 0; i < 10; i++)
			v.addElement(new Integer(i));
		System.out.println("-----------10개 객체 추가---------------------");
		System.out.println("size:"+v.size()+" capacity:"+v.capacity());
		System.out.println("------------Vercotr 내용 출력 ----------------");
		Enumeration enu = v.elements();
		while(enu.hasMoreElements())
			System.out.print(enu.nextElement()+" ");
		System.out.println();
		System.out.println("---------------객체 내용 포함 확인 ---------------");
		if(v.contains("자바"))
			System.out.println("자바 문자열 포함됨!");
		else
			System.out.println("자바 문자열 포함 안됨");
		System.out.println("10.2 객체 위치는 "+v.indexOf(new Double(10.2)));
		System.out.println("입력시간 : "+date);v.get(v.indexOf(date));
		//date 객체 삭제
		v.removeElementAt(v.lastIndexOf(date));
		for(i = 0; i < v.size(); i+=3)
			v.removeElementAt(i);
		v.setElementAt("자바",2); //3번째 위치에 자바 문자열 추가
		enu = v.elements();
		while(enu.hasMoreElements())
			System.out.print(enu.nextElement()+" ");
		System.out.println("\nsize:" + v.size()+" capacity:"+v.capacity());
		v.trimToSize();//공백제거
		System.out.println("size:"+v.size()+" capacity : "+v.capacity());
		v.setSize(2);	//크기를 강제로 2로 조정
		enu = v.elements();
		while(enu.hasMoreElements())
			System.out.print(enu.nextElement()+" ");
		v.removeAllElements(); // 모든 공백 제거
		System.out.println("size:"+v.size()+" capacity : "+v.capacity());
	}
}
