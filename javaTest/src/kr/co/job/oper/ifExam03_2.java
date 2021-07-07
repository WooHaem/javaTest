/* 1. 점수를 입력받아서 성적(A~F)을 출력하세요
 * 2. 점수가 97이상이면 A+, 94~96이면 A0, 93이하이면 A- (이하 뒷자리수 동일 등급별 차등 -10)
 * 3. + 부호처리를 위한 실행문 %나머지연산
 * F. 1부터 100까지의 수를 입력해야 한다면 입력과정에서 함수기호가 필요하다. 함수는 나중에 
 */
package kr.co.job.oper;

import java.util.Scanner;

public class ifExam03_2 {

	public static void main(String[] args) {
		//선언
		Scanner scan = new Scanner(System.in);
		int score = 0; // 점수 선언.
		char ch = 'Z'; // 등급표 선언.
		char buho ='0'; // 부호는 0으로 초기화하고 밑에 상세 if문에 부호를 변형시킨다.
		
		//입력
		System.out.print("점수를 입력하세요 : ");		
		score = Integer.parseInt(scan.next()); // Integer.parseInt(scan.next()); 앞에 선언된 변수를 기재할 것.
		
		//출력
		if (score > 90) { //91점 이상은 A등급의 영역에 우선 들어온다.
			ch = 'A'; //A등급임을 표기함.
		} else if (score > 80) {
			ch = 'B';
		} else if (score > 70) {
			ch = 'C';
		} else if (score > 60) {
			ch = 'D';
		} else if (score > 50) {
			ch = 'E';
		} else {
			ch = 'F';
		}
		// 부호처리를 위한 실행문 %나머지연산
		if (score >= 60 && score <= 100) {
			if (score%10 >= 7) { // 모든 점수 끝자리가 7점대 이상이면 (반복작업이 성립되기 때문)
				buho = '+';
			} else if (score%10 <= 3) { // 모든 점수 끝자리가 3점대 이하이면 (반복작업이 성립되기 때문)
				buho = '-';
			}
		}
		
		//종료
		System.out.println("당신의 점수는 " + score + "점이고, 성적은 " + ch + buho + "등급 입니다"); // 변형시킨 부호를 함께 기재하여 나란히 표기.
		System.out.print("Program End.");
		scan.close();
	
	}
	
	

}
