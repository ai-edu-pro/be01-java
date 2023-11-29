package quiz.scoreClass;

import java.util.Scanner;

// 3과목 입력 받고, 총점, 평균, 학점(if, switch) 구하기 
public class Score {
	// 멤버변수
	private int kor, eng, com, tot=0;
	private double avg=0.0;
	private String name = null;
	
	// 생성자함수 3개 
	public Score() {
//		kor=eng=com = 0;
		input();
	}
	public Score(int kor, int eng, int com) {
		this.kor = kor;
		this.eng = eng;
		this.com = com;
	}
	public Score(int kor) {
		super();
		this.kor = kor;
	}

	// getter /setter method
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getCom() {
		return com;
	}
	public void setCom(int com) {
		this.com = com;
	}
	
	public void setTot(int tot) {
		this.tot = tot;
	}
	public int getTot() {
		//this.tot = getKor()+getEng()+getCom();
		this.tot = kor + eng + com;
		return tot;
	}

	public double getAvg() {
		//this.avg = getTot() / 3.0;
		this.avg = tot / 3.0;
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	// input 
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("kor = ");
		this.kor = sc.nextInt();
		System.out.print("eng = ");
		this.eng = sc.nextInt();
		System.out.print("com = ");
		this.com = sc.nextInt();
		System.out.print("name = ");
		this.name = sc.next();
	}
	
	// output 
	public void disp() {
		System.out.println("****** "+name+" 님의 성적표 ******");
		System.out.printf("Kor : %d, Eng : %d, Com : %d\n", kor, eng, com);
		System.out.printf("Tot : %d, Avg : %.2f\n", getTot(), getAvg());
	}
}

/*
result>
	이도연님의 성적표 *****
	국어 : 100, 영어: 100, 전산 : 100
	총점 : 300, 평균: 100.00, 학점 : A 
*/