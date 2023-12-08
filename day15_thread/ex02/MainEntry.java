package day15_thread.ex02;

public class MainEntry {
	public static void main(String[] args) {
		
		new Thread(new UserRunnable("u1")).start();
		new Thread(new UserRunnable("u2")).start();
		new Thread(new UserRunnable("u3")).start();
		
//		Runnable t1 = new UserRunnable("u1");
//		Thread tt1 = new Thread(t1);
//		tt1.start();
		
//		t1.run();  //  X 
	}
}
