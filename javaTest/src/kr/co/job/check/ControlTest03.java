/*
 * 예약번호 받기 배열1 변수 스캐너1 + 스위치, while
 */
package kr.co.job.check;

import java.util.Scanner;

public class ControlTest03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] resNum = new int[200];
		int num =0, plus = 0;
		
		
		boolean done = true;
		while (done) {
			System.out.println("Select Number");
			num = scan.nextInt();
			
			switch (num) {
			case 1: 
					//예약
					System.out.println("예약");
					resNum[plus]= plus+1;
					System.out.println(String.format("%03d", resNum[plus]));
					plus += 1;
					break;
			case 2:
					break;
			case 3:
					break;
			}
		}
		
	}

}
