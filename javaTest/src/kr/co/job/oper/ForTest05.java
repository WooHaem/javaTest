/* �پ��� for����
 * 1. ���۰� �������� �Է¹޾� ��� Ȧ���� ��
 */
package kr.co.job.oper;

import java.util.Scanner;

public class ForTest05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//����
		int StartValue, LastValue;
		int sum = 0;
		
		System.out.print("���۰� �Է� : ");
		StartValue = scan.nextInt();
		
		System.out.print("���� �Է� : ");
		LastValue = scan.nextInt();
		
		
		//ó�� : ��� Ȧ���� ���
		for (int i=StartValue; i<=LastValue; i++) {
			if (i%2 != 0) { // ¦���� ���. i%2 != 0
				System.out.println(i + " ");
			}
		}
	
		
		System.out.println("=======================================");
		
		// 1+2+3...+10 = 55 ����غ���
		for(int i=1; i<=10; i++) {
			sum += i;
			System.out.print(i);
			if (i != 10) { // 10 �ڿ��� ��� = �� ���;���. +��ȣ�� �������Ѿ� �ϱ� ������ if ������ ����.
				System.out.print("+");	
			} else { 
				System.out.print("");
			}	
		}
		System.out.println("=" + sum); // ����� ����� for�� �ۿ� ��ġ.
		
		
		//����
		System.out.println("Program End.");
		scan.close();

	}

}
