package kr.co.job.array;

import java.util.Arrays;

public class ArrayTest01 {

	public static void main(String[] args) {
		// 배열 or 리스트 : 같은 타입의 변수를 하나의 묶음으로 다루는 
//		int[] score;				// 선언
//		score = new int[5];			// 생성
		int[] score = new int[5];	// 선언, 생성 동시에
		
		// 배열의 초기화 작업
		for (int i=0; i<score.length; i++) {
			score[i] = 0;
		}
		
		// 배열에 랜덤으로 1~100까지의 수를 대입하기.
		for (int i=0; i<score.length; i++) {
			score[i] = (int)(Math.random()*100) + 1;
			//System.out.println("score[" + i + "] = " + score[i]);	// for문 안에서 출력
		}
		
		// for문 밖에서 출력해보기.
		for (int i=0; i<score.length; i++) {
			System.out.println("score[" + i + "] = " + score[i]);
		}
		
		// 단순 배열의 값을 출력
		System.out.println("------------------------");
		System.out.println(Arrays.toString(score));
		
		
	}

}
