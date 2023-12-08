package quiz.IO.bmiOne;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class BmiManager {  // model & controller
	
	int h_num = 1000;
	protected String name;
	protected int weight;
	protected double height;
	protected double bmi;
	protected String sex;
	protected String bmi_result;
	protected String result;
	Scanner s = new Scanner(System.in);
	
	Vector<BmiManager> b_list;
	int count = 0;
	OutputStream os;

	public BmiManager(Vector<BmiManager> b_list, int h_num, OutputStream os) 
							throws InterruptedException, IOException {
		this.os = os;
		this.b_list = b_list;
		this.h_num = h_num;
		System.out.println("[NOTICE] 새로운 정보를 입력합니다! ");
		System.out.print("#[ 이름 ] : ");
		name = s.nextLine();
		System.out.print("#[ 성별 ] : ");
		sex = s.nextLine();
		System.out.print("#[ 몸무게 ] : ");
		weight = Integer.parseInt(s.nextLine());
		System.out.print("#[ 키 ] : ");
		height = Double.parseDouble(s.nextLine());
		bmi = (double) weight / (double) ((height / 100) * (height / 100));

		System.out.println("[NOTICE] BMI를 측정중입니다.\n측정중.........");
		while (true) {
			Thread.sleep(100);
			System.out.print("@");
			count++;
			if (count == 10) {
				break;
			}
		}
		if (bmi <= 15.0)
			bmi_result = "체중 부족";
		else if (bmi >= 15.1 && bmi <= 24.9)
			bmi_result = "정상";
		else if (bmi >= 25)
			bmi_result = "비만";

		System.out.println("\n[NOTICE] BMI 정보 등록 완료!!");
		result = "[사용자 번호] : " + h_num + "\t[사용자 이름] : " + name + "\t[사용자 성별] : " + sex + "\t[사용자 몸무게] : " + weight
				+ "\t[사용자 키] : " + height + "\t[사용자 BMI] : " + bmi + "\t[사용자 BMI 판정 결과] : " + bmi_result + "\r\n";
		
		os.write(result.getBytes());  // file write 
		
		b_list.addElement(this);  // 추가 
	}

	public void output() {
		Enumeration e = b_list.elements();
		while (e.hasMoreElements()) {
			BmiManager temp = (BmiManager) e.nextElement();   // 출력
			System.out.println("================ [ BMI 정보 출력 ] =================");
			System.out.println("[ 사용자 번호 ] : " + temp.h_num);
			System.out.println("[ 사용자 이름 ] : " + temp.name);
			System.out.println("[ 사용자 성별 ] : " + temp.sex);
			System.out.println("[ 사용자 몸무게 ] : " + temp.weight);
			System.out.println("[ 사용자 키 ] : " + temp.height);
			System.out.println("[ 사용자 BMI ] : " + temp.bmi);
			System.out.println("[ 사용자 BMI 판정 결과 ] : " + bmi_result);
		}
	}

	public void delete() {
		System.out.println("================ [ BMI 정보 삭제 ] =================");
		System.out.println("[NOTICE] 정보를 삭제 할 사용자 이름을 입력하세요 : ");
		String t_name = s.nextLine();
		Enumeration e = b_list.elements();
		while (e.hasMoreElements()) {
			BmiManager temp = (BmiManager) e.nextElement();
			if (t_name.contains(temp.name)) {
				b_list.remove(temp);  // 삭제
				System.out.println(t_name + " 의 정보가 삭제되었습니다.");
			}
		}
	}
}