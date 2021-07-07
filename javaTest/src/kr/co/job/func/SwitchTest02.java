/* �Լ� ��, �޼ҵ忡 ���� �����غ���
 * 
 */
package kr.co.job.func;

import java.util.Scanner;

public class SwitchTest02 {
	// ��������(global) - static�� ������ ����� ������ �� �� ù��°�� static�� �Ἥ �޸𸮿� �ø�.
	static Scanner scan = new Scanner(System.in);	// new ... => import���� �ҷ��ͼ� ���� (static�̶� �ٸ� ����)
	
	public static void main(String[] args) {
		// static(����) : �޸𸮿� �ε��
		int num = 1;
		boolean done = true;
		
		while(done) {	
			//�޴���� �� �޴��Է�
			num = menuPrint();
			
			switch (num) {
			case 1 :	// �� ���� ��
				sumTest();
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
			
	} // ���� ��

	private static void sumTest() {
		System.out.println("1�Դϴ�. : ");
		int n1=0, n2=0, sum=0;
		sum = n1 + n2;
		System.out.println("�� ���ϱ� ��");
		
	}

	// �޴� ����ϴ� �Լ�
	private static int menuPrint() {	// private = Ŭ���� �������� ��밡��
		System.out.println("==========[ Menu ]===========");
		System.out.println(" 1.    2.    3.    99.   ����.");
		System.out.println("=============================");
		
		System.out.print("���� �Է� : ");
		
		return scan.nextInt();
		
	} // �Լ� ��

}
