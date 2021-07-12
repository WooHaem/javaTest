package kr.co.job.check;

import java.util.Scanner;

public class RoomTest02 {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int[] room = new int[12];
		int num = 0;

		boolean done = true;
		
		while (done) {
			System.out.println("==========================================");
			System.out.println("1.예약하기  2.예약취소  3.방 확인  99.종료");
			System.out.println("==========================================");
			
			System.out.print("선택하기 : ");
			num = scan.nextInt();
			
			switch (num) {
				case 1:
					RoomList(room);
					RoomReserve(room);
					continue;
					
				case 2:
					RoomList(room);
					RoomCancel(room);
					continue;
					
				case 3:
					RoomList(room);
					continue;
					
				case 99:
					System.out.println();
					System.out.println("프로그램 종료.");
					System.out.println();
					done = false;
					
				default : 
					if (num == 99) {
						System.out.println("");
					} else { 
						System.out.println("올바른 메뉴를 선택해주세요. 상위메뉴로 돌아갑니다.");
					}
			}
		}
		
	}

	private static void RoomCancel(int[] room) {	// 예약취소 매서드
		System.out.print("예약취소 번호입력 : ");
		int num = scan.nextInt();
		
		// 배열초과시 에러메세지 탈출코드
		if (num > 12) {
			System.out.println("잘못된 번호입니다. 상위메뉴로 돌아갑니다.");
			return;
		}
		
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
		
	}

	private static void RoomReserve(int[] room) {	// 예약진행 매서드
		System.out.println();
		System.out.print("예약객실 번호입력 : ");
		int num = scan.nextInt();
		
		// 배열초과시 에러메세지 탈출코드
		if (num > 12) {
			System.out.println("잘못된 번호입니다. 상위메뉴로 돌아갑니다.");
			return;
		}
				
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

	}

	private static void RoomList(int[] room) {	// 호실확인 매서드
		for (int i=0; i<room.length; i++) {
			System.out.print((i+1) + "번객실 : ");
			if (room[i] != 1) {
				System.out.println("공실");
			} else {
				System.out.println("만실");
			}
		}
	}

}
