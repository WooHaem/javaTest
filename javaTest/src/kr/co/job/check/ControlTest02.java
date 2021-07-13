package kr.co.job.check;

import java.util.Scanner;

public class ControlTest02 {
	static Scanner scan = new Scanner(System.in);	
	
	public static void main(String[] args) {
		// 맥도날드
		
		
		String[] burgerName = new String[] {"데리버거", "치즈버거", "1988버거", "상하이스파이스", "빅맥"};
		
		int[] burgerPrice = new int[] {3000, 5000, 8000, 12000, 15000};
		int[] burgerNum = new int[] {10, 8, 6, 4, 2};
		int choice = 0;
		
		boolean result = true;
		
		while (result) {
			System.out.println("┌─────── 어서오세요 맥도날드입니다! ───────┐");
			System.out.println("│ 1.주문하기 2.주문취소 3.잔돈반환 99.종료　 │");
			System.out.println("└──────────────────────────────────┘");
			System.out.print("└─ 무엇을 도와드릴까요? ");
			choice = scan.nextInt();
			
			switch (choice) {
				case 1:
					System.out.println("└─ 주문페이지로 넘어갑니다~");
					System.out.println();
					
					burgerOrder(burgerName, burgerPrice, burgerNum);
					break;
					
				case 2:
					break;
					
				case 3:
					break;
					
				case 99:
					System.out.println();					
					System.out.println("감사합니다 또 오세요!");
					result = false;
					break;
					
				default:
					break;
			}
		}
	}

	private static void burgerOrder(String[] burgerName, int[] burgerPrice, int[] burgerNum) {
		boolean done = true;
		
		while (done) {
			
			System.out.println("┌───────────────────────────────────────────────┐");
			System.out.println("│ 1.데리버거 2.치즈버거 3.1988버거 4.상하이스파이스 5.빅맥　　│");
			System.out.println("└─────────────────────────────────┤ 99.나가기 ├───┘");
			System.out.print("└─ 무엇을 주문하시겠습니까? ");
			int choice = scan.nextInt();
			
			switch (choice) {
				case 1:
					System.out.println("└─ " + burgerName[choice-1] + "를 선택하셨습니다 가격은 " + burgerPrice[choice-1] + "원 입니다. [남은수량: " + burgerNum[choice-1] + "개]");
					System.out.println("└─ 주문하시겠습니까?  예(1) / 아니오(2)");
					choice = scan.nextInt();
					if (choice == 1) {
						System.out.println("└─ 몇 개 주문하시겠습니까?");
						int num = scan.nextInt();
						System.out.println("└─ " + burgerName[choice-1] + "주문이 완료되었습니다~");
					}
					break;
					
				case 2:
					break;
					
				case 3:
					break;
					
				case 4:
					break;
					
				case 5:
					break;
					
				case 99:				
					System.out.println("└─ 상위메뉴로 갑니다~");
					System.out.println();
					done = false;
					break;
					
				default: 
			}
		}
		
	}

}
