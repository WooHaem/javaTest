/* 함수 즉, 메소드에 대해 이해해보기
 * 
 */
package kr.co.job.func;

import java.util.Scanner;

public class SwitchTest02 {
	// 전역변수(global) - static의 영역을 벗어났기 때문에 글 맨 첫번째에 static을 써서 메모리에 올림.
	static Scanner scan = new Scanner(System.in);	// new ... => import파일 불러와서 생성 (static이랑 다른 형태)
	
	public static void main(String[] args) {
		// static(정적) : 메모리에 로드됨
		int num = 1;
		boolean done = true;
		
		while(done) {	
			//메뉴출력 및 메뉴입력
			num = menuPrint();
			
			switch (num) {
			case 1 :	// 두 수의 합
				sumTest();
				break;
			case 2 : 
				System.out.println("2입니다.");
				break;
			case 3 :
				System.out.println("3입니다.");
				break;
			case 99 :
				System.out.println("반복을 종료합니다.");
				done = false;
				// return; 다른 방법 (웹용. 함수용x)
			default :
				System.out.println("누구냐 넌??");
				break;
			}
		}
			
	} // 메인 끝

	private static void sumTest() {
		System.out.println("1입니다. : ");
		int n1=0, n2=0, sum=0;
		sum = n1 + n2;
		System.out.println("합 구하기 끝");
		
	}

	// 메뉴 출력하는 함수
	private static int menuPrint() {	// private = 클래스 내에서만 사용가능
		System.out.println("==========[ Menu ]===========");
		System.out.println(" 1.    2.    3.    99.   종료.");
		System.out.println("=============================");
		
		System.out.print("숫자 입력 : ");
		
		return scan.nextInt();
		
	} // 함수 끝

}