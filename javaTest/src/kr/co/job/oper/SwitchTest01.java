package kr.co.job.oper;

import java.util.Scanner;

public class SwitchTest01 {

	public static void main(String[] args) {		
		int num = 1;
		Scanner scan = new Scanner(System.in);
		boolean done = true;
		
		while(done) {	
			System.out.println("==========[ Menu ]===========");
			System.out.println(" 1.    2.    3.    99.   ����.");
			System.out.println("=============================");
			
			System.out.print("���� �Է� : ");
			num = scan.nextInt();
			
			switch (num) {
			case 1 :
				System.out.println("1�Դϴ�.");
				break;
			case 2 : 
				System.out.println("2�Դϴ�.");
				break;
			case 3 :
				System.out.println("3�Դϴ�.");
				break;
			case 99 :
				System.out.println("�ݺ��� �����մϴ�.");
				done = false;
				// return; �ٸ� ��� (����. �Լ���x)
			default :
				System.out.println("������ ��??");
				break;
			}
		}
			
	}

}
