package quiz.Abstract.ex02;

public abstract class Trans implements Runnable {  // abstract class , super class
	String message;
	
	Thread t = new Thread();
	
	public abstract void start();
	public abstract void process();
	public abstract void stop();
	

}
