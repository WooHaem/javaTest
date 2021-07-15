/*
 * 예약 시, 예약자명, 예약번호, 예약인원 입력받기
 * 예약취소시 예약번호를 기준으로 취소한다
 */

package kr.co.job.check;

import java.util.Scanner;

public class RoomTest02 {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int[] room = new int[12];				// 방 개수
		int[] hostNum = new int[12];			// 인원
		int[] hostCode = new int[12];			// 예약번호
		
		// int[][] room = new int[3][12] => [행][열]
		// room.length  => 3
		// room[0].length ==>12   // 방 개수
		// room[1].length ==>12   // 인원
		// room[2].length ==>12   // 예약번호
		
		String[] hostName = new String[12];		// 예약자명
		
		int num = 0;	// 버튼선택 토글

		boolean done = true;
		
		while (done) {
			System.out.println("==================================");
			System.out.println("1.예약하기  2.예약취소  3.방 확인  99.종료");
			System.out.println("==================================");
			
			System.out.print("선택하기 : ");
			num = scan.nextInt();
			
			switch (num) {
				case 1:
					roomList(room, hostName, hostNum, hostCode);
					roomReserve(room, hostName, hostNum, hostCode);
					break;
					
				case 2:
					System.out.println("취소를 진행합니다.");		
					roomCancel(room, hostName, hostNum, hostCode);
					break;
					
				case 3:
					roomList(room, hostName, hostNum, hostCode);
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



	private static void roomCancel(int[] room, String[] hostName, int[] hostNum, int[] hostCode) {	// ●●●●● 예약취소 매서드
		
		boolean result = true;	// 이 boolean변수는 예약취소 매서드가 main밖에 위치해있기 때문에 함수 내에서 초기화를 해주어야함
		
		// 배열초과시 에러메세지 탈출코드
		while (result) {	// 반복문 while을 입력해서 조건문 불충족시 바로 아래 번호입력란으로 계속 돌아감
			System.out.print("예약번호 입력 : ");
			int num = scan.nextInt();	// 설정된 예약번호(4자리)를 입력 (뒷자리는 배열 순서와 동일한 숫자를 가짐)
			num = num - 1000;			// 데이터를 배열번호에 옮겨야하기때문에 네자리(+1000)을 다시 배열순서번호로(-1000을 해서) 돌려놓음
			
			if (num > room.length || num < 1) {		// 예약번호(-1000을 한 두자리 배열숫자)가 배열번호를 초과했을 시
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
				continue;	// 다시 번호입력(상위)로 이동			
			
			} else {	// 알맞은 예약번호가 입력되었을 경우. 다음단계 진행.
				
				if (room[num-1] != 0) {		// 호실이 만실(예약이 되어있는 상태)인 경우 다음단계 진행.
					
					System.out.print("예약자:" + hostName[num-1] + "님 취소를 진행하시겠습니까? 예(1) / 아니오(2) : ");
					int choice = scan.nextInt();	// 취소 진행여부를 물음
					
					if (choice == 1) {	// 진행을 할 경우.
						System.out.println("※※※※취소완료※※※※");
						System.out.println();
						// 예약자의 모든 정보를 초기화
						room[num-1] = 0;		// 방을 공실로 초기화
						hostName[num-1] = "";	// 예약자명을 초기화
						hostNum[num-1] = 0;		// 예약 인원수를 초기화
						hostCode[num-1] = 0;	// 예약번호를 초기화
						
					} else if (choice == 2) {	// 취소진행을 하지 않을 경우
						System.out.println("상위메뉴로 돌아갑니다.");
						result = false;	// 해당 예약취소 메뉴를 나감.
					} else {	// ◆◆◆◆◆◆ 디버깅2) 예(1) 아니오(2) 선택 중 1,2가 아닌 다른숫자를 입력했을 경우 = else문으로 해결
						System.out.println("잘못 누르셨습니다. 예약번호를 다시 확인해주세요.");
						continue;
					}
					
				} else {
					System.out.println();
					System.out.println("● 취소불가(예약번호가 잘못됬거나, 공실입니다)");
					System.out.println();
					
				}
				result = false;		// else문의 취소완료 및 불가목록 수행 후 while문 밖으로 이동(초기선택메뉴로)
			}
			
		}
		
		
		
	}

	private static void roomReserve(int[] room, String[] hostName, int[] hostNum, int[] hostCode) {	// ●●●●● 예약진행 매서드
		
		boolean result = true;	// 이 boolean변수는 예약취소 매서드가 main밖에 위치해있기 때문에 함수 내에서 초기화를 해주어야함
		
		// 배열초과시 에러메세지 탈출코드
		while (result) {	// 반복문 while을 입력해서 안에서 탈출 시 바로 아래 번호입력란으로 계속 돌아감						
			System.out.print("예약객실 번호입력 : ");
			int num = scan.nextInt();	// roomReserve() 밖에 num변수가 존재하기 때문에 맨 앞에 데이터타입을 입력해서 함수내의 num을 다시 초기화
			
			if (num > room.length || num < 1) {		// 예약번호(-1000을 한 두자리 배열숫자)가 배열번호를 초과했을 시
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
				continue;	// 다시 번호입력(상위)로 이동
				
			} else {	// 알맞은 객실을 입력한 경우 다음단계로 진행.
				if (room[num-1] != 1) {		// 객실이 공실일 경우 다음단계 진행.				
					System.out.print("성함을 입력해주세요 : ");
					hostName[num-1] = scan.next();	// 입력된 이름을 hostName 배열 해당 데이터에 저장
					
					while (result) {	// ◆◆◆◆◆◆ 디버깅1) 인원수를 음의수 (-1,-200)로 입력해도 진행되는 문제 = while문으로 해결
						System.out.print("인원수를 입력하세요 : ");
						hostNum[num-1] = scan.nextInt();	// 입력된 인원수를 hostNum 배열 해당 데이터에 저장
						
						if (hostNum[num-1] < 1) {
							System.out.println("최소 한명은 입실하셔야 합니다.");
							continue;
						}
						result = false;
					}
					
					
					hostCode[num-1] = 1000 + num;	// 예약하려는 호실넘버에 +1000을 하여 네자리의 예약번호 생성. 예) 12호실 = 1000 + 12 = 1012
					
					System.out.println();
					System.out.println("※※※※예약완료※※※※");
					System.out.println("[예약번호는 " + hostCode[num-1] + "입니다.]");
					System.out.println();
					room[num-1] = 1;	// 예약된 방을 공실이 아닌 예약(1)로 변환
					
				} else {
					System.out.println();
					System.out.println("● 예약불가(이미 예약됨)");
					System.out.println();
				}
				result = false;	// else문의 취소완료 및 불가목록 수행 후 while문 밖으로 이동(초기선택메뉴로)
			}
		}


	}

	private static void roomList(int[] room, String[] hostName, int[] hostNum, int[] hostCode) {	// ●●●●● 호실확인 매서드
		System.out.println();
		System.out.println("----- 방 확인 ---------------");
		
		for (int i=0; i<room.length; i++) {
			System.out.print(" ▦ " + (i+1) + "번객실 : ");
			
			if (room[i] != 1) {
				System.out.println("공실");
			} else {
				System.out.println(hostName[i] + " " + hostNum[i] + "명 [예약번호:" + hostCode[i] + "]");
			}
		}
		
		System.out.println("---------------------------");
		System.out.println("");
	}

}
