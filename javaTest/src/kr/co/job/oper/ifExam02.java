/*
 * 키보드로 두 수를 입력받아서 큰지 작은지 비교하는 프로그램을 작성.
 */
package kr.co.job.oper;

import java.util.Scanner;

public class ifExam02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0, num2 = 0;
		String result = null;
		
		System.out.print("첫번째 수 입력 : ");
		num = Integer.parseInt(scan.next());
		
		System.out.print("두번째 수 입력 : ");
		num2 = Integer.parseInt(scan.next());
		
		if (num > num2) {
			result = "첫번째 입력수가 더 큽니다. " + num + " > " + num2;
			/* 선생님 답
			 * System.out.println("1"); 처리 이전에 결과값이 제대로 나오는지 확인할 것.
			 */
		} else if (num == num2) {
			result = "둘 다 같습니다. " + num + " = " + num2;
			/* 선생님 답
			 * 
			 */
		} else {
			result = "두번째 입력수가 더 큽니다. " + num + " < " + num2;
			/* 선생님 답
			 * 
			 */
		}
		System.out.println(result);
		System.out.println("Program End.");
		scan.close(); // 스캔 닫는 명령어가 없으면 위에 스캔 선언문에 빨간줄 생김.
		

	} // end of main

} // end of class
