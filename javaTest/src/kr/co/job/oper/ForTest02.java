/* 1. ������ �Է¹ް�
 * 2. 1���� �Է¹��� ������ ������� ���
 */

package kr.co.job.oper;

import java.util.Scanner;

public class ForTest02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		
		System.out.print("���� �Է� : ");
		num = scan.nextInt();
		
		//for�� �ۼ�
		
		for (int i=1; i<=num; i++ ) {
			System.out.println("�Է¹��� ���ڱ��� : " + i);
		}
		System.out.println("Program End.");
		scan.close();
	}

}
