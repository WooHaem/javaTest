package kr.co.job.check;

import java.util.Scanner;

public class RoomTest02 {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int[] room = new int[12];
		int num = 0;

		boolean done = true;
		
		while (done) {
			System.out.println("==============================================");
			System.out.println("1.예약하기  2.예약취소  3.방 확인  4.개인정보입력  99.종료");
			System.out.println("==============================================");
			
			System.out.print("선택하기 : ");
			num = scan.nextInt();
			
			switch (num) {
				case 1:
					RoomList(room);
					RoomReserve(room);
					break;	// 함수 바깥으로 나감.
					
				case 2:
					RoomList(room);
					RoomCancel(room);
					break;
					
				case 3:
					RoomList(room);
					break;
				
				case 4:
					System.out.println("개인정보입력 페이지로 이동합니다.");
					createId();
					break;
					
				case 99:
					System.out.println();
					System.out.println("프로그램 종료.");
					System.out.println();
					done = false;
					break;
					
				default : 
					if (num == 99) {
						System.out.println("");
					} else { 
						System.out.println("올바른 메뉴를 선택해주세요. 상위메뉴로 돌아갑니다.");
					}
				
			}
		}
		
	}

	private static void createId() {
		System.out.println("");
		System.out.println("----------------개인정보입력------------");
		System.out.println("1.이름  2.휴대폰번호  3.주소  4.성별  5.나이");
		System.out.println("------------------------------------");
		
		
	}

	private static void RoomCancel(int[] room) {	// 예약취소 매서드
		
		boolean result = true;
		
		// 배열초과시 에러메세지 탈출코드
		while (result) {
			System.out.print("예약취소 번호입력 : ");
			int num = scan.nextInt();
			
			if (num > 12) {
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
				continue;
				
			} else {
				if (room[num-1] != 0) {						
					System.out.println();
					System.out.println("취소완료");
					System.out.println();
					room[num-1] = 0;
				} else {
					System.out.println();
					System.out.println("취소불가(이미 공실임)");
					System.out.println();
				}
				result = false;
			}
			
			
		}
		
		
		
	}

	private static void RoomReserve(int[] room) {	// 예약진행 매서드
		
		boolean result = true;
		
		while (result) {	// 반복문 while을 입력해서 안에서 탈출 시 바로 아래 번호입력란으로 계속 돌아감
			System.out.print("예약객실 번호입력 : ");
			int num = scan.nextInt();
			
			if (num > 12) {
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
				continue;
			} else {
				if (room[num-1] != 1) {						
					System.out.println();
					System.out.println("예약완료");
					System.out.println();
					room[num-1] = 1;
				} else {
					System.out.println();
					System.out.println("예약불가(이미 예약됨)");
					System.out.println();
				}
				result = false;	// 해당 함수를 탈출한다.
			}
		}


	}

	private static void RoomList(int[] room) {	// 호실확인 매서드
		System.out.println();
		System.out.println("방 확인 -----------");
		
		for (int i=0; i<room.length; i++) {
			System.out.print((i+1) + "번객실 : ");
			if (room[i] != 1) {
				System.out.println("공실	|");
			} else {
				System.out.println("만실	|");
			}
		}
		
		System.out.println("-----------------");
		System.out.println("");
	}

}
