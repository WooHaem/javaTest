/* 설명문을 작성할 수 있다.
 * 단축키 
 * 1. Ctrl + Space
 * 2. Alt + 방향키(위,아래) 코드 옮기기.
 * 3. Ctrl + Alt + 방향키(위,아래) 코드 복사
 * 4. Ctrl + f 찾기
 * 5. Ctrl + / 주석처리
 */
package kr.co.job; //기본적 자바구조1 = 파일처럼 분류되는 것.

public class BasicTest01 {

	public static void main(String[] args) {
		//주석문 큰따옴표 "" << 문자열 = 무조건 출력 / 작은따옴표 '' << 명령문
		System.out.println("Welcome to JAVA!");
		
		//두 수와 결과값을 선언 
		int num1 = 3; // 첫 수 int num1 = 0;
		int num2 = 4; // 두 수 
		int result; // 결과값
		
		//키보드 입력 : 
		
		//처리
		result = num1 + num2;
		//출력
		System.out.println("결과값 : " + result);
	}

}
