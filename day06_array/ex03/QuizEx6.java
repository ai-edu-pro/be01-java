package day06_array.ex03;

public class QuizEx6 {
	public static void main(String[] args) {
		int[][] score = { { 98, 98, 90, 92, 99 },
							{ 81, 82, 83, 84, 85 },
							{ 71, 73, 75, 77, 79 },
							{ 60, 65, 60, 65, 69 }, 
							{ 77, 74, 79, 78, 72} };
		
		//주어진 2차원 배열 점수의 총점/평균 구하시오
		int[] avg = new int[5];
	    int[] scoreTotal = new int[5]; 
	    int totalAll = 0; // 학급전체 총점
	    int avgAll = 0; // 학급전체 평균
		
		for (int i = 0; i < score.length; i++) {
			
			for (int j = 0; j < score[i].length; j++) {
				scoreTotal[i] += score[i][j];
				avg[i] = scoreTotal[i] / score[j].length;
				
				totalAll += scoreTotal[i];
				avgAll += avg[i];
			} // j end
			
			System.out.println("total["+i+"] = "+scoreTotal[i] +",\taverage["+i+"] = "+ avg[i]);
		} // i  end
		
		System.out.println("\n학급 전체 총점 : "+ totalAll +", 학급 전체 평균 : "+avgAll);
	}
}






