package kr.co.job.oper;

import java.util.Scanner;

public class ForTest06 {

	public static void main(String[] args) {
		System.out.println("========��ĭ �Ǵ� �࿭�� ���Ͽ�========");
		for (int i=1; i<=4; i++) { //��
			
			for (int j=1; j<=i; j++) { //ĭ j : ���� ���� 
				System.out.print("*");
			}
			System.out.println();
		}
		
		// ���� �߻� : Math.random() = 0~0.9999�� ������ ���� "�ϳ���" �߻���Ŵ
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());

		int num =0;
		num = (int)(Math.random()*10); // 0 ~ 9 ������ ���� ���´�. (10�� ���� 1���ڸ����� ��ȯ�Ǿ��� ����)
		System.out.println(num);
		
		// 1~10������ �� �߻���Ű��
		num = (int)(Math.random()*10) + 1; // 0 ~ 9 �����ϱ� �ִ�� 9�� +1�� �ϸ� 10���� ���´�.
		System.out.println(num);
		
		// 1~45������ �� �߻�
		num = (int)(Math.random()*45) + 1; // ���� ū ���� * ������ �Է����ش�. / * 45�� ���� (45������ ���� ����) 
		System.out.println(num);
		
		// 11~13������ �� �߻�
		for (int i=1; i<=3; i++) {
			num = (int)(Math.random() * 3) + 11;
			System.out.println(num);
		}
		
	}

}
