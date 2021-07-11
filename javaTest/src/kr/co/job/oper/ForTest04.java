package kr.co.job.oper;

import java.util.Scanner;

public class ForTest04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//선언
		int dan = 0;
		
		//입력
		System.out.print("구구단 몇단? : ");
		dan = scan.nextInt();
		
		//처리
		for (int i=1; i <=9; i++) {
			System.out.println(dan + "X" + i + "=" + dan * i);
		}
		System.out.println("Program End.");
		scan.close();
	}

}