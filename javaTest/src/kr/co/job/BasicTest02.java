/* 두 정수를 키보드로 입력받아서 결과값을 출력하세요.
 * 
 * 키보드 입력절차
 * Scanner scan = new Scanner(); // 키보드 클래스 - scan으로 생성
 * num = scan.next(); 
 */
package kr.co.job;

import java.util.Scanner;

public class BasicTest02 {

	public static void main(String[] args) {

		//키보드를 동작시키기 위해 해당 클래스에 아래 객체(scan)를 생성.
		Scanner scan = new Scanner(System.in); 
		/* 또는
		 * Scanner scan;
		 * scan = new Scanner(System.in);
		 */
		
		//선언
		int num = 0;
		int num2 = 0; // 또는 int num = 0, num2 = 0;
		
		//두 수의 합의 결과값 구하기 (예제1)
		System.out.print("Input press : ");
		num = scan.nextInt();
		
		System.out.print("Input press2 : ");
		num2 = scan.nextInt();
		
		/* 처리(선생님)
		 * result = num1 + num2;
		 * 출력(선생님)
		 * System.out.println("입력받은 정수 두개의 합 : " + result);
		 */
		
		//처리2
		System.out.println("입력받은 정수 두개의 합 : " + (num + num2));
	}

}
