package quiz.IO.bmiOne;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;
import java.util.Vector;

public class MainEntry {  // view

	public static void main(String[] args) throws FileNotFoundException {

		int h_num = 1000;
		Vector<BmiManager> b_list = new Vector<BmiManager>();     // vector 이용
		BmiManager bm = null;
		Scanner s = new Scanner(System.in);
		OutputStream os = new FileOutputStream("BMI_LIST2.txt");  // file save
		
		try {
			while (true) {
				System.out.println("=========[ M E N U ]==========");
				System.out.println("[ 1 ] BMI 측정 및 정보추가");
				System.out.println("[ 2 ] BMI 정보 삭제");
				System.out.println("[ 3 ] BMI 정보 출력");
				System.out.println("[ 4 ] BMI system exit ");
				System.out.print("[ 선택 ] -> ");
				int ch = s.nextInt();
				
				switch (ch) {
				case 1:
					bm = new BmiManager(b_list, h_num, os);
					h_num++;
					break;
				case 2:
					bm.delete();
					break;
				case 3:
					bm.output();
					break;
				case 4:
					System.exit(0);
					break;
				default:
					continue;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}