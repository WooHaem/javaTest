/* �� ���� �Է¹޾Ƽ� ���ϱ�, ����, ���ϱ�, �����⸦ ���ϴ� �޼ҵ�
 * void plusV(int n1, int n2);
 * minusV(), mulV(), divV()		=> �޼ҵ� �̸�
 */
package kr.co.job.func;

public class ExamFunction02 {


	public static void main(String[] args) {
		// 3,5�� �� ���ϱ�
		int plus = plusV(3, 5);	// �Լ����� return���� ���� ���� ������ ������Ÿ������ �ٲپ� �������ش�.
		System.out.println("3�� 5�� �� : " + plus);	
		// 3,10�� ����
		int minus = minusV(3, 10);
		System.out.println("3�� 5�� �� : " + minus);
		// 5,4�� ����
		int multiple = mulV(5, 4);
		System.out.println("3�� 5�� �� : " + multiple);
		// 2,8�� ������
		int division = divV(2, 8);
		System.out.println("3�� 5�� �� : " + division);
		
	}

	private static int divV(int i, int j) {		// private static ������Ÿ�� �Լ�()
		int sum = i / j;
		//System.out.println(i + "��" + j + " = " + sum);
		//System.out.println("");
		return i / j;	// �Լ������� ������� ����ϴ� ���. => return�� ������ �ϳ� �ΰ��̻� �ȵ�.
	}

	private static int mulV(int i, int j) {
		int sum = i * j;
		//System.out.println(i + "X" + j + " = " + sum);
		//System.out.println("");
		return i * j;
	}

	private static int minusV(int i, int j) {
		int sum = i - j;
		//System.out.println(i + "-" + j + " = " + sum);
		//System.out.println("");
		return i - j;
	}

	private static int plusV(int i, int j) {
		int sum = i + j;
		///System.out.println(i + "+" + j + " = " + sum);
		//System.out.println("");
		return i + j;
	}

}
