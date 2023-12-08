package day15_thread.syncronized;

public class SimpleThread {   // Outer class
	
	 static void threadMessage(String message) {
		 String threadName = Thread.currentThread().getName();
		 System.out.printf("%s : %s \n\n", threadName, message);
	 }
	 
	 static class MessageLoop  implements Runnable {  // Inner class
		 	
		@Override
		public void run() {
			String[] importantInfo = { "aa aa", "bb b", "cc c", "dd d" };
			
			try {
				for (int i = 0; i < importantInfo.length; i++) {
					Thread.sleep(4000);  // 4초
					threadMessage("I wasn't  done!!!!");
				} // end for
				
			} catch (Exception e) {
				e.printStackTrace();
			}  // try end
			
		}  // run() end
		 
	 } // end MessageLoop  - inner class
	 
	 public static void main(String[] args) throws InterruptedException {
		long parience = 1000 * 60 * 60;
		
		if( args.length > 0 ) {
			try {
				parience = Long.parseLong(args[0]) * 1000;
				
			} catch (Exception e) {
				System.out.println("argument integer input ");
				System.exit(1);   // 강제 종료
			}  // try end
			 
		} // end if
		
		threadMessage("Start MessageLoop thread test ");
		long startTime = System.currentTimeMillis();
		Thread t = new Thread(new MessageLoop());
		t.start();
		
		while( t.isAlive() ) {
			threadMessage("still waitting...................................");
			t.join(1000);
			
			if( ( ( System.currentTimeMillis() - startTime ) > parience  ) && t.isAlive()  ) {
				
				threadMessage("Tired of watting............................");
				t.interrupt();
				t.join();
				
			} // if end
		} // end while
		
		threadMessage("Finally..........................................................");
	}
  
}  // end SimpleThread  - outer class








