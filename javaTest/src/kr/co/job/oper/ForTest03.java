/* �� ���� �Է¹޾Ƽ�
 * ���������� ū�������� ���� ���.
 * 
 */
package kr.co.job.oper;

import java.util.Scanner;

public class ForTest03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 //����
		 int num = 0;
		 int num2 = 0;
		 int sum = 0;
		 
		 //�Է�
		 System.out.print("ù��° �� �Է� : ");
		 num = scan.nextInt();
		 System.out.print("�ι�° �� �Է� : ");
		 num2 = scan.nextInt();
		 
		 /* ��ó�������� ������(ù��°��)�� ū ���� ������� (���� �ݴ�Ǿ��� ���)
		  * ��if������ �ݴ��� ��츦 ������ش�.
		  * �ظ��� for���� ���� if���� �̸� �������ش�. 
		  */
		 if (num >= num2) {
			 for (int i=num2; i<=num; i++) {
				 sum += i;
				 System.out.println(i);
			 }    
		 }
		 
		 //ó��
		 for (int i=num; i<=num2; i++) {
			 sum += i;
			 System.out.println(i);
			 // i�� 10�϶� ���߱�.
			 if (i == 10) {
				 continue; 
				 // => �ٽ� 10�̻��� ���ϰ�� 10������ �����ϰ� ���. �������� �ٷ� �ٽ��� for���� �����ϱ� ������ �Ʒ� sysout�� ==������ �����������
				 // break; // => for���� 10���� ������ �����. �׸��� 10������ �ո� �����.
			 }
			 System.out.println("==================");
			 			
		 }
		 
		 //���
		 System.out.println("�Է¹��� �� �� ������ �� : " + sum);
		 System.out.println("Program End.");
		 scan.close();

	}

}
