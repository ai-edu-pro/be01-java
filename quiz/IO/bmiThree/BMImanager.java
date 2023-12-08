package quiz.IO.bmiThree;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class BMImanager extends BMI {

	static HashMap<Integer, BMI> map = new HashMap<Integer, BMI>();   // map 이용
	static int top = 1;

	public static void main(String[] args) throws IOException {  // controller & view
		
		BMImanager bi = new BMImanager();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("《1》고객정보추가 \t《2》고객정보출력 \t《3》고객정보 삭제 \t《4》종료");
			switch (sc.nextInt()) {
			case 1:
				add();
				break;
			case 2:
				print();
				break;
			case 3:
				delete();
				break;
			case 4:
				System.out.println("종료하겠습니다");
				System.exit(0);
				break;
			}
		}
	}

	private static void add() throws IOException {
		BMI bmi = new BMI();
		map.put(top, BMI.input(bmi));
		top++;
	}

	private static void print() {
		Set<Integer> set = map.keySet();
		for (Integer number : set) {
			String name = map.get(number).name;
			String weight = map.get(number).weight;
			int wei = Integer.parseInt(weight);
			String height = map.get(number).height;
			int hei = Integer.parseInt(height);
			double sum = wei / ((hei / 100.0) * (hei / 100.0));

			System.out.println(
					number + " : " + "성함 : " + name + "\t몸무게 : " + weight + "\t키 : " + height + "비만율 : " + sum);
		}
	}

	private static void delete() throws IOException {
		System.out.println("삭제하실 인덱스번호를 입력해주세요.");
		int num = br.read();
		if (map.containsKey(num)) {
			map.remove(num);
			System.out.println("삭제되었습니다.");
		} else {
			System.out.println("고객의 인덱스번호를 잘못 입력하셨습니다.");
		}
	}
}