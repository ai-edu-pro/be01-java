package day13.textPackage;

import java.text.ChoiceFormat;

public class ChoiceFormatEx2 {
	public static void main(String[] args) {
		
			String pattern = "50#F|60#D|70#C|80#B|90#A" ;  // 낮은 값부터 큰 값의 순서로 적어줌
//			String pattern = "90#A|80#B|70#C|60#D|50#F" ;
			
			int[] score = { 100, 95, 70, 55, 60, 70 , 55 };
			
			ChoiceFormat  form = new ChoiceFormat(pattern);
			
			for(int i=0; i < score.length; i++) {
				
				System.out.println(score[i] + " : " + form.format(score[i]));
			}
	}
}
