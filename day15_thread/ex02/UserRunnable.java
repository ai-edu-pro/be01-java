package day15_thread.ex02;

public class UserRunnable implements Runnable {
	
	String name;
	
	public UserRunnable(String name) {
		this.name = name;
	}

	@Override
	public void run() {  // 스레드 실행부(구현부)
		
//		System.out.println("runnable run() call~~~");
		
		for (int i = 1; i < 11; i++) {
			
			if( i  == 4 ) {
				try {
					Thread.sleep(1000);  // 예외발생,  1/1000 <=== 1초
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println(name);
			}
			
			System.out.println(i);
		}
		
	}

}
