/* ���๮1
 * while(����) {
 * 		���๮2 => ������ ���̸� �����.
 * }
 * ���๮3
 * 
 */
package kr.co.job.oper;

public class WhileTest01 {

	public static void main(String[] args) {
		// 1���� 10������ ��
		int i=1, sum=0;
		
		while(i<=10) {
			sum += i;
			System.out.println(i); // ��¹� ����
			i++;	// i�� 1���� ��µ� �Ŀ� �������� �־���� ��. ó���� �־��� ��� 2���� ������.
		}
		
		System.out.println("sum = " + sum);
	}

}
