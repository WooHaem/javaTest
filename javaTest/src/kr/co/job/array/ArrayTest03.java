package kr.co.job.array;

public class ArrayTest03 {

	public static void main(String[] args) {
		//
		int sum=0;
		float avg=0f;
		int max = 0, min = 0, tmp;
		
		int[] score = {55, 88, 96, 105, 90, 85, 75, 11, 5};
		
		// �ش� �迭���� �ִ밪�� �ּҰ��� ���ϼ���.
		
		
		for (int i=0; i<score.length; i++) {
			min = max;	// �ڡڡڡڡڡڡڡڡڡڡڡڡڡ� �ּҰ��� ������ �ݵ�� ���ǵǾ���Ѵ�. ( 0�� �Ǿ��� ��� �ִ밪�� �ο���.)
			
			if (max < score[i]) {
				max = score[i];
			} else if (min > score[i]) {
				min = score[i];		// min ���� max(�ִ밪)���� ������ ���ȴ�
			}
			
		}
		System.out.println("�ִ밪 : " + max + " / " + "�ּҰ� : " + min);
		
		
		
		// �ձ��ϱ�
		for (int i=0; i<score.length; i++) {
			sum += score[i];
		}
		// ���
		avg = (float)sum / score.length;
		
		System.out.println("============================");
		System.out.println("���� : " + sum);
		System.out.println("��� : " + avg);
		
		
	}

}
