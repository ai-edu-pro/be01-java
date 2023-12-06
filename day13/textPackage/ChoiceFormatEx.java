package day13.textPackage;

import java.text.ChoiceFormat;

public class ChoiceFormatEx {
	public static void main(String[] args) {
		
		double[]  limits = { 50, 60, 70, 80, 90 } ;  // 낮은 값부터 큰 값의 순서로 적어줌
		String[]  grades = { "F", "D", "C", "B", "A" }; 
		
		int[] score = { 100, 95, 70, 55, 60, 70 , 65};
		
		ChoiceFormat  form = new ChoiceFormat(limits, grades);
		for(int i=0; i < score.length; i++) {
			System.out.println(score[i] + " : " + form.format(score[i]) + "학점");
		}
	}
}
