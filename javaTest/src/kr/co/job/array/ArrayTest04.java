/*
 * 10�� �迭�� �����Ͽ� �迭�ǰ��� 0~9���� ���������� �ʱ�ȭ�ϰ�
 * �ش� �迭���� �����
 */

package kr.co.job.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayTest04 {

	public static void main(String[] args) {
		//
		int[] numArr = new int[100];
		int n = 0, tmp =0;
		
		// �� �ٴ� 10���� ���
		int cnt =0, line=10;
		
		for (int i=0; i<numArr.length; i++) {
			numArr[i] = i;
			System.out.print(numArr[i] + ",");
			cnt++;
			if (cnt == line) {
				System.out.println();
				cnt = 0;	// �ٽ� 0���� �ʱ�ȭ
			}
		}

		for (int i=1; i<100; i++) {	// 1000ȸ
			n = (int)(Math.random()*100);	// n�� 1���� 100������ �������� ����
			
			tmp = numArr[0];		// tmp�� �迭 �ε��� ù��° ���� ����(�Ǵ� ������ �ε������� �����ص� ��)
			numArr[0] = numArr[n];	// �迭 �ε��� ù��° ���� �迭 1~100������ ������ �ε��� ���� ����
			numArr[n] = tmp;		// �迭 1~100������ ������ �ε��� ���� tmp���� ����
						
		}
		System.out.println("=====================");
		System.out.println(Arrays.toString(numArr));
	}

}
