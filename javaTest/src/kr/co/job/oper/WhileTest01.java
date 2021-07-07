/* 실행문1
 * while(조건) {
 * 		실행문2 => 조건이 참이면 실행됨.
 * }
 * 실행문3
 * 
 */
package kr.co.job.oper;

public class WhileTest01 {

	public static void main(String[] args) {
		// 1부터 10까지의 합
		int i=1, sum=0;
		
		while(i<=10) {
			sum += i;
			System.out.println(i); // 출력문 삽입
			i++;	// i가 1부터 출력된 후에 증감식을 넣어줘야 함. 처음에 넣었을 경우 2부터 시작함.
		}
		
		System.out.println("sum = " + sum);
	}

}
