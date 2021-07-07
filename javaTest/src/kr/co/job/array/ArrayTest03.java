package kr.co.job.array;

public class ArrayTest03 {

	public static void main(String[] args) {
		//
		int sum=0;
		float avg=0f;
		int max = 0, min = 0, tmp;
		
		int[] score = {55, 88, 96, 105, 90, 85, 75, 11, 5};
		
		// 해당 배열에서 최대값과 최소값을 구하세요.
		
		
		for (int i=0; i<score.length; i++) {
			min = max;	// ★★★★★★★★★★★★★★ 최소값의 변수는 반드시 정의되어야한다. ( 0이 되었을 경우 최대값을 부여함.)
			
			if (max < score[i]) {
				max = score[i];
			} else if (min > score[i]) {
				min = score[i];		// min 값이 max(최대값)부터 시작후 계산된다
			}
			
		}
		System.out.println("최대값 : " + max + " / " + "최소값 : " + min);
		
		
		
		// 합구하기
		for (int i=0; i<score.length; i++) {
			sum += score[i];
		}
		// 평균
		avg = (float)sum / score.length;
		
		System.out.println("============================");
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		
		
	}

}
