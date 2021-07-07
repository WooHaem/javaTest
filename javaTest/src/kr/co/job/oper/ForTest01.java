/* 기본적인 for문
 * for(초기값; 조건; 증감치) {
 * 	실행문
 * }
 */
package kr.co.job.oper;

public class ForTest01 {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		
		for (i=2; i>=0; i--) {
			System.out.println("반복변수 i값 : " + i);
			sum = sum + i;	// 합을 누적 => sum += i 와 동일
		}
		System.out.println("for문 종료 후 반복변수 i값 : " + sum);

	}

}
