package kr.co.job.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest02 {

	public static void main(String[] args) {
		// ���ڿ� �迭 5���� ������ ��, 5���� �̸��� �Է¹�������
		Scanner scan = new Scanner(System.in);
		
		//����
		String[] name;
		name = new String[5];	// �ڡڡڡڡڡڡ� �ʿ��� ���� �迭�� �����Ѵ�.
		
		//�Է�
		for (int i=0; i<name.length; i++) {
			System.out.print("�̸��� �Է��ϼ��� : ");
			name[i] = scan.next();		
			
		}
		
		// �迭 ������ ���.
		System.out.println(Arrays.toString(name));
		
		// �迭 �ϳ��ϳ� ���.
		for (int i=0; i<name.length; i++) {
			System.out.println("name [" + i + "] = " + name[i]);
		}
	}

}
