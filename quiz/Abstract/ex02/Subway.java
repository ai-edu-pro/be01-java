package quiz.Abstract.ex02;

public class Subway extends Trans {
	int count = 0;
	
	@Override
	public void run() {
		try {
			while(true) {
				t.sleep(1000);
				
				switch (count) {
				case 0:
					start();
					break;
				case 1:
					process();
					break;
					
				case 2:
					stop();
					break;
				}
				count++;
				if(count == 3)  break;
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void start() {
		message = "열차 출발 합니다";
		System.out.println(message);
	}

	@Override
	public void process() {
		message = "1초~~2초~~~3초~~~.....";
		System.out.println(message);

	}

	@Override
	public void stop() {
		message="열차 멈춥니다. 내리실 문은 오른쪽입니다.";
		System.out.println(message);

	}

}
