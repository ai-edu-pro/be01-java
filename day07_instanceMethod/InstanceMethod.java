package day07_instanceMethod;
/*
 * instance mehtod : 객체 생성하고 사용해야함(메모리상에 할당이 되어야.....)
 */
class B {
	int x, y;
	
	// instance method
	public void setData(int xx, int yy) {
		System.out.println(xx + ", " + yy);
	}
	
} // B class end

public class InstanceMethod {

	public static void main(String[] args) {
		B b = new B(); // 객체생성, 메모리에 할당, 생성자함수 자동호출
		b.setData(100, 200);
	}
}
