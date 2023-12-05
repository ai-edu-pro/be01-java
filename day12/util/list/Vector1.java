package day12.util.list;
import java.util.Vector;
class  Vector1{
	public static void main(String[] args) {
		Vector[] v = new Vector[3];
		v[0] = new Vector();
		v[1] = new Vector(5);
		v[2] = new Vector(5,3);
		for(int i = 0; i < v.length; i++){
			System.out.println("벡터V["+i+"] size = "+ v[i].size());
			System.out.println("벡터["+i+"] capacity = "+v[i].capacity());
		}
		for(int i =0; i < 3 ; i++){
			for(int j = 0 ; j < 12; j++)
				v[i].addElement(new Integer(j));
		}
		System.out.println();
		for(int i = 0; i < v.length; i++){
			System.out.println("벡터["+i+"] size = "+ v[i].size());
			System.out.println("벡터["+i+"] capacity = "+v[i].capacity());
		}
	}
}
