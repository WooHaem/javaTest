/*
 * While문과 Math.random() 메소드를 이용
 * 
 * 1~6의 눈을 갖는 두개의 주사위를 던졌을 때
 * 주사위 눈의 값을 (1주사위눈, 2주사위 눈)형태로 출력하고
 * 두개의 눈이 서로 다른 값이면 계속 주사위를 던지고
 * 두개의 눈이 같으면 멈추는 코드 작성
 */
package kr.co.job.oper;

import java.util.Scanner;

public class WhileTest04 {

	public static void main(String[] args) {
		// 선언
		int dice1 = 0, dice2 = 0;
		boolean done = true;
		
		System.out.println("주사위 던지기를 시작합니다.");
		
		// 처리
		while (done) {
				// Math.random은 6까지의 수가 나오려면 곱하기(*)6을 하고 괄호 밖으로 + 1 을 더해준다.
				dice1 = (int)(Math.random() * 6) + 1; 
				dice2 = (int)(Math.random() * 6) + 1;
				
				System.out.println("주사위1 : " + dice1 + " / 주사위2 : " + dice2);
			
		// 종료
				if (dice1 == dice2) {
					done = false;
					System.out.println("같은 수가 나왔으므로 던지기를 종료합니다.");
				}
		}

	}

}
