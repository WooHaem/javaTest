/*
 * �� ���� Ű����� �Է¹޾Ƽ� �� ���� ���� ���� ��ȯ����
 */

package kr.co.job.check;

import java.util.Scanner;

public class CheckingTest02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// ����  �� ���� �� �����ϱ� a,b,c ����
		int num1, num2, temp = 0;
		
		// �Է�
		System.out.print("ù��° �� : ");
		num1 = scan.nextInt();
		
		System.out.print("�ι�° �� : ");
		num2 = scan.nextInt();
		
		System.out.println(num1 + " / " + num2);
		System.out.println("");
		System.out.println("----��ȯ��----");
		System.out.println("");
		
		// ó�� : swap
		temp = num1;
		num1 = num2;
		num2 = temp;	
		
		// ���
		System.out.println(num1 + " / " + num2);

	}

}
