package day09_staticMember;

class Atm {
	int count;  // instance member
	static int total;  // static member
	
	public Atm(int amount) {  //constructor
		count += amount;  // count = count + amount;
		total += amount;  // total = total + amount;
	}
	public static void view() {
//		count = count + 100; // static method에서는 일반(instance) 멤버 변수는 사용 할 수 없다
		total = total + 100;
	}
	
	public void show(int count, int total) {
		this.count = count;
//		this.total = total;  //  static member에는 this 사용하지 않는다.
	}
	
	public void display() {  // instance method에서는 둘다 사용 가능함
		count = count + 200;
		total = total + 200; 
		System.out.println("count = " + count);
		System.out.println("total = " + total);
	}
} // Atm class end

public class MainEntry {
	public static void main(String[] args) {
		Atm at = new Atm(1000);
		at.display(); // c : 1000 ,  t : 1000
		System.out.println("-----------------------");
		Atm at2 = new Atm(1000);
		at2.display(); // c : 1000 ,  t : 2000
		System.out.println("-----------------------");
		Atm at3 = new Atm(1000);
		at3.display(); // c : 1000 ,  t : 3000
		
		System.out.println(Atm.total);
		System.out.println(at.count);
	}
}









