/* 
 * 자바의 정석 p170 : 입력받은 숫자의 각 자리의 합 구하기
 */
package kr.co.job.oper;

import java.util.Scanner;

public class WhileTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0, sum = 0;
		System.out.println("숫자를 입력하세요. (예:12345)>");
		
		Scanner scan = new Scanner(System.in);
		String tmp = scan.nextLine();	// 화면을 통해 입력받은 내용을 tmp에 저장
		num = Integer.parseInt(tmp);	// 입력받은 문자열(tmp)을 숫자로 변환
		
		while(num!=0) {
			// num을 10으로 나눈 나머지를 sum에 더함
			sum += num%10;	// sum = sum + num%10;
			System.out.printf("sum=%3d num=%d%n", sum, num);
			
			num /= 10; 	// num = num / 10; num을 10으로 나눈 값을 다시 num에 저장
		}
		
		System.out.println("각 자리수의 합 : " + sum);
		
	}

}