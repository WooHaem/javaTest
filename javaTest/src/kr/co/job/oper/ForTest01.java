/* �⺻���� for��
 * for(�ʱⰪ; ����; ����ġ) {
 * 	���๮
 * }
 */
package kr.co.job.oper;

public class ForTest01 {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		
		for (i=2; i>=0; i--) {
			System.out.println("�ݺ����� i�� : " + i);
			sum = sum + i;	// ���� ���� => sum += i �� ����
		}
		System.out.println("for�� ���� �� �ݺ����� i�� : " + sum);

	}

}
