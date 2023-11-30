package quiz.Abstract.ex02;

public class Biciycle extends Trans {

	int count = 0;

	@Override
	public void start() {
		message = "자 페달 한번 밟아볼까.. ";
		System.out.println(message);
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		message = "끼익!";
		System.out.println(message);
	}

	@Override
	public void process() {
		// TODO Auto-generated method stub
		message = "웨에에에에에에에에에 (타이어 마찰소리)";
		System.out.println(message);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			while (true) {  //무한루프
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
				if (count == 3) {
					break;
				}
			}

		} catch (Exception e) {

		}

	}
}
