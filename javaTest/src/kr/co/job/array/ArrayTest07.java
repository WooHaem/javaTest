package kr.co.job.array;

public class ArrayTest07 {

	public static void main(String[] args) {
		// 2차원 배열을 이해하자
		int[][] score = {
//				국어, 영어, 수학
				{100,100,100,0},	// (0,0)(0,1)(0,2)
				{20,30,10,0},		// (1,0)(1,1)(1,2)
				{30,40,20,0},		// (2,0)(2,1)(2,2)
				{40,50,30,0},		// (3,0)(3,1)(3,2)
				{50,60,40,0}		// (4,0)(4,1)(4,2)
		};
		int korSum = 0;
		int engSum = 0;
		int matSum = 0;
		
		int korEvg = 0;
		int engEvg = 0;
		int matEvg = 0;
		
		// i : 행(줄) - 학생		j : 열(칸) - 국어, 영어, 수학
		for(int i=0; i<score.length; i++) {	//score.length => 5 (행의 길이)
			System.out.println(i + "행===============");
			
			for (int j=0; j<score[i].length; j++) {
				System.out.print(i + "행 출력 : score[" + i + "][" + j + "] = " + score[i][j] + " ");
				
			}
			System.out.println();
		}
		
		// 과목별 총합
		for (int i=0; i<score.length; i++) {
			korSum += score[i][0];
			engSum += score[i][1];
			matSum += score[i][2];

		}
		System.out.println("국어 점수 합 : " + korSum);
		System.out.println("영어 점수 합 : " + engSum);
		System.out.println("수학 점수 합 : " + matSum);
		
		// 과목별 평균
		System.out.println("학생 평균 : " + korEvg);

		
	}

}
