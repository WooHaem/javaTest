package kr.co.job.check;

import java.util.Scanner;

public class exam02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] drinkPrice, drinkGa;	// drinkGa (���)
		String[] drinkName;
		
		boolean done = true;
		int coin = 0, num = 0, choose = 0;
		
// 1. ������ ���ݰ� ��� �̸��� �����ش�.
		drinkPrice = new int[] {500, 700, 1000};					//����
		drinkGa = new int[] {5, 4, 3};							//���
		drinkName = new String[] {"�ݶ�", "���̴�", "Ŀ��"};		//�̸�
		
// 2. ������ �ݾ��� �Է��Ѵ�.
		System.out.print("������ �־��ּ��� : ");
		coin = scan.nextInt();
		
// 3. ���Ǳ⸦ �����Ѵ�.
		while (done) {
		
			System.out.println("=================[ Menu ]=================");
			System.out.println("1.�ݶ�(500)  2.���̴�(700)  3.Ŀ��(1000)  4.����");
			System.out.println("============================= �ܾ� : " + (coin) + "�� =");
			
// 4. ���Ḧ �����Ѵ�.
			System.out.print("�����ϼ��� : ");
			num = scan.nextInt();
			
			if (num < 4) {
				if (coin < drinkPrice[num-1]) {	
					System.out.println("�ܾ��� �����մϴ� �����Ͻðڽ��ϱ�? ��(1) / �ƴϿ�(2)");
					choose = scan.nextInt();
					
					if (choose == 1) {
						System.out.print("������ �ݾ���? ");
						coin = coin + scan.nextInt();
						continue;
					} else if (choose == 2) {
						System.out.println("�ٸ����Ḧ �������ּ���");
						System.out.println(" ");
						continue;
					} else {
						System.out.println("�ùٸ� ��ư�� �Է����ּ���.");
						System.out.println(" ");
						continue;
					}
				}	
			}

// 5. ���ᰡ ���´� or �ܾ��� �����ϴٸ� �ٽ� �޴���
			switch (num) {
				case 1: 	// �ݶ�
					if (coin >= drinkPrice[num-1]) {
						if (drinkGa[num-1] == 0) {
							System.out.println("�����Ǿ����ϴ�. �ٸ����Ḧ �������ּ���.");
							break;
						}
// 6. �ܿ������� ��Ÿ���� (�ش�������)�ܾ��� ��ȯ�Ѵ�.
						System.out.println(drinkName[num-1] + " ���ɴϴ�.");
						coin = coin - drinkPrice[num-1];
						drinkGa[num-1] = drinkGa[num-1] - 1;
						System.out.println("�س��� ��� : " + drinkGa[num-1]);
						System.out.println(" ");
						break;
					} else {
						System.out.println("�ܾ��� �����մϴ�.");
						System.out.println("�س��� ��� : " + drinkGa[num-1]);
						System.out.println(" ");
						break;
					}
				case 2:		// ���̴�
					if (coin >= drinkPrice[num-1]) {
						if (drinkGa[num-1] == 0) {
							System.out.println("�����Ǿ����ϴ�. �ٸ����Ḧ �������ּ���.");
							break;
						}
						System.out.println(drinkName[num-1] + " ���ɴϴ�.");
						coin = coin - drinkPrice[num-1];
						drinkGa[num-1] = drinkGa[num-1] - 1;
						System.out.println("�س��� ��� : " + drinkGa[num-1]);
						System.out.println(" ");
						break;
					} else {
						System.out.println("�ܾ��� �����մϴ�.");
						System.out.println("�س��� ��� : " + drinkGa[num-1]);
						System.out.println(" ");
						break;
					}
				case 3:		// Ŀ��
					if (coin >= drinkPrice[num-1]) {
						if (drinkGa[num-1] == 0) {
							System.out.println("�����Ǿ����ϴ�. �ٸ����Ḧ �������ּ���.");
							break;
						}
						System.out.println(drinkName[num-1] + " ���ɴϴ�.");
						coin = coin - drinkPrice[num-1];
						drinkGa[num-1] = drinkGa[num-1] - 1;
						System.out.println("�س��� ��� : " + drinkGa[num-1]);
						System.out.println(" ");
						break;
					} else {
						System.out.println("�ܾ��� �����մϴ�.");
						System.out.println("�س��� ��� : " + drinkGa[num-1]);
						System.out.println(" ");
						break;
					}
				case 4:
					System.out.println("�����մϴ�.");
					done = false;
					break;
				default:
					System.out.println("�߸��� �Է��Դϴ�.");
					break;
			
			}
		}
		
		
		
	}

}
