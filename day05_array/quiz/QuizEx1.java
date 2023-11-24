package day05_array.quiz;

public class QuizEx1 {
	public static void main(String[] args) {
		int[] su = { 1, 7, 4, 7, 55, 90, 100, 7, 2, 7, 23 };
		int seek = 7, count = 0;

		for (int i = 0; i < su.length; i++) {
			if (seek == su[i])
				count++;  // count = count + 1;  // count += 1;
		}

		System.out.println("{ 1, 7, 4, 7, 55, 90, 100, 7, 2, 7, 23 }에서 7의 개수 : " + count);
	}
}
