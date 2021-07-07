/*
 * 두 수를 키보드로 입력받아서 두 수의 값을 서로 교환하자
 */

package kr.co.job.check;

import java.util.Scanner;

public class CheckingTest02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 선언  ※ 변수 명 변경하기 a,b,c 자제
		int num1, num2, temp = 0;
		
		// 입력
		System.out.print("첫번째 수 : ");
		num1 = scan.nextInt();
		
		System.out.print("두번째 수 : ");
		num2 = scan.nextInt();
		
		System.out.println(num1 + " / " + num2);
		System.out.println("");
		System.out.println("----교환중----");
		System.out.println("");
		
		// 처리 : swap
		temp = num1;
		num1 = num2;
		num2 = temp;	
		
		// 출력
		System.out.println(num1 + " / " + num2);

	}

}
