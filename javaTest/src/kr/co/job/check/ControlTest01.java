/* 프로그램의 기본흐름구조 설계하기 (Switch문 활용)
 * ==== 메뉴 ====
 * 1. 두수의 합 2. 구구단 3. 입력받은수까지의 합  99. 종료
 * ===============================
 * selct number : 
 */

package kr.co.job.check;

import java.util.Scanner;

public class ControlTest01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int cont = 0; 
		boolean done = true;
		
		while (done) {
			System.out.println("==================[ Menu ]=================");
			System.out.println("1.두수의 합  2.구구단  3.입력받은 수 까지의 합  99.종료");
			System.out.println("===========================================");
			
			System.out.print("선택하세요 : ");
			num = scan.nextInt();
			
		switch (num) {
		
// 1. 두 수의 합
		case 1 :
			//선언
			int sum1 = 0, sum2 = 0, sum3 = 0;
			
			//입력
			System.out.print("두 수의 합(첫번째) : ");
			sum1 = scan.nextInt();
			System.out.print("두 수의 합(두번째) : ");
			sum2 = scan.nextInt();
			
			//처리
			sum3 = sum1 + sum2;
			System.out.println("두 수의 합 : " + sum3);
			
			//종료
			System.out.println(" ");
			
// 2. 구구단		
		case 2 : 
			//선언
			int multiple = 0;
			
			//입력
			System.out.print("구구단수를 입력하세요 : ");
			multiple = scan.nextInt();
			
			if (multiple > 9 || multiple < 2) {
				System.out.println("올바른 숫자를 입력해주세요. 메뉴로 돌아갑니다.");
				System.out.println("");
				break;
			}
			
			//처리
			for (int i=1; i<=9; i++) {
				System.out.println(multiple + " x " + i + " = " + multiple*i);
			}
			
			//종료
			System.out.println(" ");
			continue;
			
// 3. 입력받은 수 까지의 합 (1부터인지?)			
		case 3 : 
			//선언 
			int num4 = 0, sum = 0;
			
			//입력
			System.out.println("숫자를 입력하세요.");
			num4 = scan.nextInt();
			
			//처리
			for (int j=1; j<=num4; j++) {
				sum += j;
				System.out.print(j);
				if (j != num4) {
					System.out.print(" + ");
				} else {
					System.out.print(" ");
				}
				
			}
			System.out.println("= " + sum);
			
			//종료
			System.out.println(" ");
			continue;
			
		case 99 : 
			System.out.println("종료.");
			done = false;
			
		default : 
			System.out.println(" ");
		}
		
		} //while 끝
		
		//종료
		System.out.println("Program End.");
		scan.close();
		
	}

}
