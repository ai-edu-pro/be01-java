package day13.textPackage;

import java.util.*;

public class comparatorEx {
	public static void main(String[] args) {
		
		TreeSet  set1 = new TreeSet();   // 오름차순 정렬해줌, 시스템은 내부적으로 항상 오름차순 정렬 
		TreeSet  set2 = new TreeSet(new Desending());  // 사용자가만든 내림차순 클래스 객체 전달
		
		int[] score = { 91, 88, 52, 100, 95, 70 , 55, 60, 70 };
		
		for(int i=0; i < score.length; i++) {
//			set1.add(new Integer(score[i]));  // 오름차순
			set1.add(score[i]); 
			set2.add(new Integer(score[i]));  // 내림차순
		} //for end
		
		System.out.println("set1 : " + set1);
		System.out.println("set2 : " + set2);
	}			
}
