package quiz.IO.bmiTwo;

import java.io.*;
import java.util.*;

public class BMI_MainEntry {  // controller & view

	public static void main(String[] args) throws IOException {   // controller & view

		OutputStream os = new FileOutputStream("BMI_List.txt"); // 파일로 저장할 객체 생성
		// txt파일로 리스트를 작성하겠다.
		HashMap<Integer, Person> bp = new HashMap<Integer, Person>();    // map 이용
		Set s;
		Iterator it;
		// 해시맵의 장점 : key로 검색가능
		do {
			System.out.println("=======================================================");
			System.out.println("BMI 측정 대상  1.추가\t2.삭제\t3.출력\t4.종료(txt 파일  출력)");
			System.out.print(" 메뉴 선택 > ");
			int menu = new Scanner(System.in).nextInt();

			System.out.println("----------------------------------------------------------------------");
			switch (menu) {
			case 1:
				bp.put(Person.getIndex(), new Person());
				break;
			case 2:
				System.out.print("제거 할 index를 입력하세요>");
				int rm = new Scanner(System.in).nextInt();
				Person tmp = bp.remove(rm);
				if (tmp != null)
					System.out.println(tmp + "가 삭제되었습니다.");
				else
					System.out.println("해당하는 index가 없습니다.");
				break;
			case 3:// 출력
				s = bp.entrySet();
				it = s.iterator();
				while (it.hasNext()) {
					System.out.println(it.next());
				}
				break;
			case 4:
				s = bp.entrySet();
				it = s.iterator();
				while (it.hasNext()) {
					os.write(it.next().toString().getBytes());  // 파일
					os.write(new String("\r\n").getBytes());
				}
//				os.write(bp.toString().getBytes());
				os.close();
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못입력하셨습니다.");
				break;
			}
			System.out.println("----------------------------------------------------------------------");
		} while (true);
	}// main
}// MainEntry