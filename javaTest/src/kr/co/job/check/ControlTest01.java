/* ���α׷��� �⺻�帧���� �����ϱ� (Switch�� Ȱ��)
 * ==== �޴� ====
 * 1. �μ��� �� 2. ������ 3. �Է¹����������� ��  99. ����
 * ===============================
 * selct number : 
 */

package kr.co.job.check;

import java.util.Scanner;

public class ControlTest01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int cont = 0; 
		boolean done = true;
		
		while (done) {
			System.out.println("==================[ Menu ]=================");
			System.out.println("1.�μ��� ��  2.������  3.�Է¹��� �� ������ ��  99.����");
			System.out.println("===========================================");
			
			System.out.print("�����ϼ��� : ");
			num = scan.nextInt();
			
		switch (num) {
		
// 1. �� ���� ��
		case 1 :
			//����
			int sum1 = 0, sum2 = 0, sum3 = 0;
			
			//�Է�
			System.out.print("�� ���� ��(ù��°) : ");
			sum1 = scan.nextInt();
			System.out.print("�� ���� ��(�ι�°) : ");
			sum2 = scan.nextInt();
			
			//ó��
			sum3 = sum1 + sum2;
			System.out.println("�� ���� �� : " + sum3);
			
			//����
			System.out.println(" ");
			
// 2. ������		
		case 2 : 
			//����
			int multiple = 0;
			
			//�Է�
			System.out.print("�����ܼ��� �Է��ϼ��� : ");
			multiple = scan.nextInt();
			
			if (multiple > 9 || multiple < 2) {
				System.out.println("�ùٸ� ���ڸ� �Է����ּ���. �޴��� ���ư��ϴ�.");
				System.out.println("");
				break;
			}
			
			//ó��
			for (int i=1; i<=9; i++) {
				System.out.println(multiple + " x " + i + " = " + multiple*i);
			}
			
			//����
			System.out.println(" ");
			continue;
			
// 3. �Է¹��� �� ������ �� (1��������?)			
		case 3 : 
			//���� 
			int num4 = 0, sum = 0;
			
			//�Է�
			System.out.println("���ڸ� �Է��ϼ���.");
			num4 = scan.nextInt();
			
			//ó��
			for (int j=1; j<=num4; j++) {
				sum += j;
				System.out.print(j);
				if (j != num4) {
					System.out.print(" + ");
				} else {
					System.out.print(" ");
				}
				
			}
			System.out.println("= " + sum);
			
			//����
			System.out.println(" ");
			continue;
			
		case 99 : 
			System.out.println("����.");
			done = false;
			
		default : 
			System.out.println(" ");
		}
		
		} //while ��
		
		//����
		System.out.println("Program End.");
		scan.close();
		
	}

}
