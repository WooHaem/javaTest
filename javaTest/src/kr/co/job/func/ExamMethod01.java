/* [�޼ҵ� ȣ��]
 * ��� : Ư�����ڸ� Ƚ����ŭ ����ϴ� �޼ҵ� �����
 * void printCharacter (char ch, int num); �޼ҵ� ����
 * 
 */
package kr.co.job.func;

public class ExamMethod01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printCharacter('*', 3);
		printCharacter('$', 10);
		
		// "hello"�� ���ڿ��̹Ƿ� �Լ��� Ÿ���� String���� ��ȯ (ù��° �Լ�)
		printCharacter("hello", (int)(Math.random() * 10) + 1);
	}
	
	// Ư�� ���ڿ��� Ƚ����ŭ �ݺ��ϴ� �޼ҵ�
	private static void printCharacter(String str, int num) {
		System.out.println("���ڿ� �ݺ� �ӹ� ����");
		for (int i=0; i<=num; i++) {
			System.out.print(str + "\n");
			if (i == num) {
				System.out.print(str);
			}
		}
		System.out.println("\n���ڿ� �ݺ� �ӹ� ����");
		System.out.println("");
		
	}
	
	private static void printCharacter(char ch, int num) {
		System.out.println("�ݺ���� �ӹ� ����");
		for (int i=0; i<=num; i++) {
			System.out.print(ch);
		}
		System.out.println("\n�ݺ���� �ӹ� ����");
		System.out.println("");
		
	}

}
