/* 나이를 입력받아서 60세 이상이면 "노인", 
 * 30세~59세면 "중장년", 
 * 29세 미만이면 "청소년" 을 표현하세요.
 */
package kr.co.job.oper;

import java.util.Scanner;

public class ifExam04 {

	public static void main(String[] args) {
		//선언
		Scanner scan = new Scanner(System.in);
		int age = 0;
		String result = null; // String 데이터를 명확히 알 수 없을 때, null 삽입.
		
		//입력
		System.out.print("현재 나이를 입력하세요 : ");
		age = Integer.parseInt(scan.next());
		
		//처리
		if (age >= 30 && age < 60) {
			result = "중장년";
		} else if (age < 30) {
			result = "청소년";
		} else {
			result = "노인";
		}
		
/* 
		 * 조건문을 간단하게 쓰는 방법 ( 순서선정 잘하기 )
		if (age >= 60) {
			result = "노인";
		} else if (age < 30) {
			result = "청소년";
		} else {
			result = "중장년";
		}
*/
		
		//출력
		System.out.println("당신은 " + result + "입니다.");
		System.out.println("Program End.");
		scan.close();
	}

}
