package kr.co.job.array;

import java.util.Scanner;

public class ArrayTest05 {

	public static void main(String[] args) {
		final int SIZE = 5;	//final ���� : ����Ұ�
		String[] name = new String[SIZE];
		Scanner scan = new Scanner(System.in);
		
		// �̸� �Է¹ޱ�
		for (int i=0; i<SIZE; i++) {
			System.out.print("�̸��� �Է��ϼ��� : ");
			name[i] = scan.next();
		}
		
		// �迭�� �ϳ� ����ϱ� -(����)
		int n = (int)(Math.random()*SIZE);
		System.out.println("������ �迭�� ��� : " + name[n]);

	}

}
