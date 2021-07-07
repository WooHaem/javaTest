/* 두 수를 입력받아서
 * 작은수에서 큰수까지의 합을 출력.
 * 
 */
package kr.co.job.oper;

import java.util.Scanner;

public class ForTest03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 //선언
		 int num = 0;
		 int num2 = 0;
		 int sum = 0;
		 
		 //입력
		 System.out.print("첫번째 수 입력 : ");
		 num = scan.nextInt();
		 System.out.print("두번째 수 입력 : ");
		 num2 = scan.nextInt();
		 
		 /* ※처리이전에 작은값(첫번째값)에 큰 수를 넣을경우 (수가 반대되었을 경우)
		  * ※if문으로 반대의 경우를 만들어준다.
		  * ※메인 for문의 전에 if문을 미리 정의해준다. 
		  */
		 if (num >= num2) {
			 for (int i=num2; i<=num; i++) {
				 sum += i;
				 System.out.println(i);
			 }    
		 }
		 
		 //처리
		 for (int i=num; i<=num2; i++) {
			 sum += i;
			 System.out.println(i);
			 // i가 10일때 멈추기.
			 if (i == 10) {
				 continue; 
				 // => 다시 10이상의 수일경우 10리밋을 무시하고 재생. 실행이후 바로 다시위 for문을 적용하기 떄문에 아래 sysout의 ==라인을 출력하지않음
				 // break; // => for문이 10까지 돌리고 멈춘다. 그리고 10까지의 합만 계산함.
			 }
			 System.out.println("==================");
			 			
		 }
		 
		 //출력
		 System.out.println("입력받은 두 수 까지의 합 : " + sum);
		 System.out.println("Program End.");
		 scan.close();

	}

}
