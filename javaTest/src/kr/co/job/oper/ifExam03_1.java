/* 1. 점수를 입력받아서 성적(A~F)을 출력하세요
 * 2. 점수가 97이상이면 A+, 94~96이면 A0, 93이하이면 A- (이하 뒷자리수 동일 등급별 차등 -10)
 * F. 1부터 100까지의 수를 입력해야 한다면 입력과정에서 함수기호가 필요하다. 함수는 나중에 
 */
package kr.co.job.oper;

import java.util.Scanner;

public class ifExam03_1 {

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
			if (score >= 97) { // if문 안에 추가 if문 부여하여 상세설정이 가능하도록.
				buho = '+'; //97 이상일 시 등급옆의 부호는 +형태로 변형하도록.
			} else if (score <= 93) {
				buho = '-'; //93 이하이면 등급옆의 부호는 -형태로 변형하도록.
			} else {
				buho = '0'; //부호의 영역에서 벗어났을 경우, 0의 값을 부여.
			}
		} else if (score > 80) {
			ch = 'B';
			if (score >= 87) {
				buho = '+';
			} else if (score <= 83) {
				buho = '-';
			} else {
				buho = '0';
			}
		} else if (score > 70) {
			ch = 'C';
			if (score >= 77) {
				buho = '+';
			} else if (score <= 73) {
				buho = '-';
			} else {
				buho = '0';
			}
		} else if (score > 60) {
			ch = 'D';
			if (score >= 67) {
				buho = '+';
			} else if (score <= 63) {
				buho = '-';
			} else {
				buho = '0';
			}
		} else if (score > 50) {
			ch = 'E';
			if (score >= 57) {
				buho = '+';
			} else if (score <= 53) {
				buho = '-';
			} else {
				buho = '0';
			}
		} else {
			ch = 'F';
		}
		// 부호처리를 위한 실행문 %나머지연산
		if (score >= 60 && score <= 100) {
			if (score%10 >= 7) {
				buho = '+';
			} else if (score%10 <= 3) {
				buho = '-';
			}
		}
		
		//종료
		System.out.println("당신의 점수는 " + score + "점이고, 성적은 " + ch + buho + "등급 입니다"); // 변형시킨 부호를 함께 기재하여 나란히 표기.
		System.out.print("Program End.");
		scan.close();
	
	}
	
	

}
