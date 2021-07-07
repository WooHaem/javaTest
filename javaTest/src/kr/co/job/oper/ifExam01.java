/* 
 * 키보드로 숫자를 입력받아서 0인지 아닌지 확인하는 프로그램을 작성해보자
 */
package kr.co.job.oper; // .XXX 이 추가 될수록 패키지 계단식 구조 ( job폴더 안에 oper폴더 )

import java.util.Scanner;

public class ifExam01 {

	public static void main(String[] args) {
		// 선언부 : 키보드 입력, 숫자보관
		Scanner scan = new Scanner(System.in);
		int num = 0; // 선언과 동시에 0으로 초기화
		String result = null; // 문자열( 숫자가 아닌 경우 )의 결과값 출력
		
		// 입력
		System.out.print("Input Number : "); // println = 한칸띄기
		num = Integer.parseInt(scan.next()); // Intefer.parseInt = 문자열(scan으로 입력된 문자)을 숫자열(정수형)로 바꿔 줄 수 있음. 
		
		if(num == 0) {
			// 조건이 참일 때
//			System.out.println("num은 0 입니다.");
			result = "num은 0 입니다."; // 결과값을 보존하기 위해 변수화 선언함.
		} else {
			// 조건이 거짓일 때
//			System.out.println("num은 0이 아닙니다.");
			result = "num은 0이 아닙니다.";
		}
		System.out.println(result);
		System.out.println("Program End.");
		
		
	} // end of main

} // end of class
