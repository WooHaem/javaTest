package kr.co.job.array;

import java.util.Arrays;

public class ArrayTest01 {

	public static void main(String[] args) {
		// �迭 or ����Ʈ : ���� Ÿ���� ������ �ϳ��� �������� �ٷ�� 
//		int[] score;				// ����
//		score = new int[5];			// ����
		int[] score = new int[5];	// ����, ���� ���ÿ�
		
		// �迭�� �ʱ�ȭ �۾�
		for (int i=0; i<score.length; i++) {
			score[i] = 0;
		}
		
		// �迭�� �������� 1~100������ ���� �����ϱ�.
		for (int i=0; i<score.length; i++) {
			score[i] = (int)(Math.random()*100) + 1;
			//System.out.println("score[" + i + "] = " + score[i]);	// for�� �ȿ��� ���
		}
		
		// for�� �ۿ��� ����غ���.
		for (int i=0; i<score.length; i++) {
			System.out.println("score[" + i + "] = " + score[i]);
		}
		
		// �ܼ� �迭�� ���� ���
		System.out.println("------------------------");
		System.out.println(Arrays.toString(score));
		
		
	}

}
