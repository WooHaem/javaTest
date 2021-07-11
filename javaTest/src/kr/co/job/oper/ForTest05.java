/* 다양한 for문들
 * 1. 시작값 끝값까지 입력받아 모든 홀수의 합
 */
package kr.co.job.oper;

import java.util.Scanner;

public class ForTest05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//선언
		int StartValue, LastValue;
		int sum = 0;
		
		System.out.print("시작값 입력 : ");
		StartValue = scan.nextInt();
		
		System.out.print("끝값 입력 : ");
		LastValue = scan.nextInt();
		
		
		//처리 : 모든 홀수만 출력
		for (int i=StartValue; i<=LastValue; i++) {
			if (i%2 != 0) { // 짝수일 경우. i%2 != 0
				System.out.println(i + " ");
			}
		}
	
		
		System.out.println("=======================================");
		
		// 1+2+3...+10 = 55 출력해보기
		for(int i=1; i<=10; i++) {
			sum += i;
			System.out.print(i);
			if (i != 10) { // 10 뒤에는 결과 = 이 나와야함. +기호는 생략시켜야 하기 때문에 if 문으로 제어.
				System.out.print("+");	
			} else { 
				System.out.print("");
			}	
		}
		System.out.println("=" + sum); // 결과값 출력은 for문 밖에 위치.
		
		
		//종료
		System.out.println("Program End.");
		scan.close();

	}

}