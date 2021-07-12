/* 방 예약 : 12개의 방
 * ==================[메뉴]==================
 * 1.방예약  2.예약취소  3.호실확인  99.종료
 * 
 * int[] room = {0,};
 * room [3] => 0 // 예약가능
 * room [3] => 1 // 예약불가
 * 
 * 초기화 => 반복구문 : 메뉴 -> 선택 실행
 */
package kr.co.job.check;

import java.util.Scanner;

public class RoomTest01 {

	public static void main(String[] args) {
		// 선언
		Scanner scan = new Scanner(System.in);
		int[] Room = new int[12];
		
		boolean done = true;
		int num = 0;
		
		while (done) {	// 3번 부터 짠다.
			System.out.println("=================[메뉴]==================");
			System.out.println("1.방예약  2.예약취소  3.호실확인  99.종료");
			System.out.println("=========================================");
			
			System.out.print("선택해주세요 : ");
			num = scan.nextInt();
			
			switch (num) {
				case 1 : 
					System.out.print("몇번방을 예약하시겠습니까? ");
					num = scan.nextInt();
					if (Room[num-1] != 1) {
						System.out.println(num + "번 방이 예약되었습니다");
						Room[num-1] = 1;
					} else {
						System.out.println("죄송합니다. " + num + "번 방은 예약하실 수 없습니다.");
						continue;
					}
					break;
					
				case 2 :
					System.out.println("취소하시고자 하는 방 번호를 입력해주세요.");
					num = scan.nextInt();
					if (Room[num-1] != 0) {
						System.out.println(num + "번 방 예약취소합니다.");
						Room[num-1] = 0;
					} else {
						System.out.println(num + "번 방은 공실입니다.");
						continue;
					}
					break;
					
				case 3 :
					System.out.println("남은 객실수를 확인합니다.");
					for (int i=0; i<Room.length; i++ ) {
						System.out.print("[" + (i + 1) + "호실] : ");
						
						if (Room[i] != 1) {
							System.out.println("공실");
						} else  {
							System.out.println("예약불가");
							continue;
						}
					}
					break;
				case 99 :
					System.out.println("종료합니다.");
					done = false;
				default :
					continue;
			}
		}
		
		
	}

}
