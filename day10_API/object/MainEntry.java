package day10_API.object;

class Point {   }

public class MainEntry {
	public static void main(String[] args) {
		Point pt = new Point();
		System.out.println("Point pt information");
		System.out.println("class name : " + pt.getClass());
		System.out.println("hash code : " + pt.hashCode());  // 125993742
		System.out.println("Object String : " + pt.toString());  // 782830e
		System.out.println("Object String : " + pt);
		System.out.printf("10진수 %d\n", 0x782830e);  // 숫자, 0숫자, 0x숫자
		System.out.println("=======================================");
		
		Point pt2 = new Point();
		System.out.println("Point pt2 information");
		System.out.println("class name : " + pt2.getClass());
		System.out.println("hash code : " + pt2.hashCode());  // 457233904
		System.out.println("Object String : " + pt2.toString());  // 1b40d5f0
		System.out.println("Object String : " + pt2);
		
		System.out.println("pt.toString() : toString()의 의미 - day10_API.object.Point@1b40d5f0 ");
		System.out.println(pt2.getClass().getName()+'@'+Integer.toHexString(pt2.hashCode()));
		
		Point pt3 = new Point();
		
		if( pt.hashCode() == pt3.hashCode() ) {
			System.out.println("same");
		} else {
			System.out.println("not same");
		}
		
		Point pt4; 
		pt4 = pt;  // ?? 
		
		if( pt.hashCode() == pt4.hashCode() ) {
			System.out.println("same");
		} else {
			System.out.println("not same");
		}
		
		System.out.println(pt.hashCode() +", " + pt4.hashCode());
		
	}
}











