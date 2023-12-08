package quiz.IO.bmiTwo;

import java.io.*;
import java.text.ChoiceFormat;

public class Person {  // model
	
	static final double[] LIMITS = { 0, 18.5, 23.0, 25.0 }; // 작은것에서 큰순으로 기재
	static final String[] BMI_GRADES = { "체중부족", "정상", "과체중", "비만" };
	private static int howManyPerson = 0; // 리스트가 몇명 만들어졌는지 알 수있음

	public static int getIndex() { // person 리스트가 몇명 만들어졌는지 알수있음
		return howManyPerson;
	}

	private String name, BMI_grade;
	private Boolean isMale;
	private int index;
	private float height, weight, ideal_weight, BMI; // cm, kg

	public Person() throws IOException { // 예외처리 위임
		// 생성자에서 입력받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("\t이름 : ");
		this.name = br.readLine();

		System.out.print("\t남자면 true 여자면 false를 입력하세요 : ");
		this.isMale = Boolean.parseBoolean(br.readLine()); // 남자면 true

		System.out.print("\t신장(cm) : ");
		this.height = Float.parseFloat(br.readLine());

		System.out.print("\t체중(kg): ");
		this.weight = Float.parseFloat(br.readLine());

		calcBMI();  // 비만도 측정 계산 함수 
		this.index = howManyPerson++; //
	}// 디폴트 생성자

	public Person(String name, Boolean sex, float h, float w) {
		this.name = name;
		this.isMale = sex;
		this.height = h;
		this.weight = w;
		calcBMI();
	}

	private void calcBMI() {
		// BMI계산 = 몸무게 / 키(m)의 제곱
		this.BMI = (this.weight / (this.height * this.height)) * 100 * 100; // cm로 바꿔서 계산
		// this.BMI = Math.round((this.BMI*1000))/1000 ; //정밀도가 높을필요없는데 어케 간단히 하지

		ChoiceFormat form = new ChoiceFormat(LIMITS, BMI_GRADES);
		BMI_grade = form.format(this.BMI);

		// 적정체중도 그냥 여기서 계산
		this.ideal_weight = (this.height - 100);
		if (isMale)
			this.ideal_weight *= 0.9;
		else
			this.ideal_weight *= 0.85;
	}

	@Override
	public String toString() {
		return " " + this.name + " [ " + this.height + "cm, " + this.weight + "kg, BMI=" + this.BMI + ", \""
				+ this.BMI_grade + "\", 적정체중 : " + this.ideal_weight + "kg ]";
	}
}// class
