package kr.co.job.oper;

import java.util.Scanner;

public class ForTest04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//����
		int dan = 0;
		
		//�Է�
		System.out.print("������ ���? : ");
		dan = scan.nextInt();
		
		//ó��
		for (int i=1; i <=9; i++) {
			System.out.println(dan + "X" + i + "=" + dan * i);
		}
		System.out.println("Program End.");
		scan.close();
	}

}
