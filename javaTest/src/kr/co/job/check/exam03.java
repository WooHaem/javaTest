package kr.co.job.check;

import java.util.Scanner;

public class exam03 {
	static Scanner scan = new Scanner(System.in);	
	
	public static void main(String[] args) {
		// 맥도날드
		
//		String[] burgerName = new String[] {"데리버거", "치즈버거", "1988버거", "상하이스파이스", "빅맥"};
//		int[] burgerPrice = new int[] {3000, 5000, 8000, 12000, 15000};
//		int[] burgerNum = new int[] {10, 8, 6, 4, 2};
		
//		String[][] burger = new String[3][5];	
//		burger[0][0] = "데리버거";
//		burger[0][1] = "치즈버거";
//		burger[0][2] = "1988버거";
//		burger[0][3] = "상하이스파이스";
//		burger[0][4] = "빅맥";
//		
//		burger[1][0] = "3000";
//		burger[1][1] = "5000";
//		burger[1][2] = "8000";
//		burger[1][3] = "12000";
//		burger[1][4] = "15000";
//		
//		burger[2][0] = "10";
//		burger[2][1] = "8";
//		burger[2][2] = "6";
//		burger[2][3] = "4";
//		burger[2][4] = "2";
		
		String[][] burger = { 
			{"데리버거","치즈버거","1988버거","상하이스파이스","빅맥"}, 
			{"3000", "5000", "8000", "12000", "15000"},
			{"10", "8", "6", "4", "2"}
		};	
		
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
					
					burgerOrder(burger);
					
					break;
					
				case 2:
					System.out.println("└─ 주문취소페이지로로 넘어갑니다~");
					System.out.println();
					
					burgerCancel(burger);
					break;
					
				case 3:
					break;
					
				case 99:
					System.out.println();					
					System.out.println("감사합니다 또 오세요!");
					result = false;
					break;
					
				default:
					if (choice == 99) {
						System.out.println("");
					} else { 
						System.out.println("!! 올바른 메뉴를 선택해주세요.");
						System.out.println("");
					}
					break;
			}
		}
	}

	private static void burgerCancel(String[] burger) {
		boolean done = true;
		
		
		
	}

	private static void burgerOrder(String[] burger) {
		boolean done = true;
		
		while (done) {
			
			System.out.println("┌───┤ 77.재고　├──────────────────────────────────┐");
			System.out.println("│ 1.데리버거 2.치즈버거 3.1988버거 4.상하이스파이스 5.빅맥　　│");
			System.out.println("└─────────────────────────────────┤ 99.나가기 ├───┘");
			System.out.print("└─ 무엇을 주문하시겠습니까? ");
			int choice = scan.nextInt();
			
			switch (choice) {
				case 1:
					if (Integer.parseInt(burger[2][choice-1]) > 0) {
						Proceed1(burger, choice);
			
					} else { 
						System.out.println("!! 현재 " + burger[0][choice-1] + "는 매진되었습니다.");
						System.out.println();
						
					}
					break;
					
				case 2:
					if (burgerNum[choice-1] > 0) {
						Proceed1(burgerName, burgerPrice, burgerNum, choice);
			
					} else { 
						System.out.println("!! 현재 " + burgerName[choice-1] + "는 매진되었습니다.");
						System.out.println();
						
					}
					break;
					
				case 3:
					if (burgerNum[choice-1] > 0) {
						Proceed1(burgerName, burgerPrice, burgerNum, choice);
			
					} else { 
						System.out.println("!! 현재 " + burgerName[choice-1] + "는 매진되었습니다.");
						System.out.println();
						
					}
					break;
					
				case 4:
					if (burgerNum[choice-1] > 0) {
						Proceed1(burgerName, burgerPrice, burgerNum, choice);
			
					} else { 
						System.out.println("!! 현재 " + burgerName[choice-1] + "는 매진되었습니다.");
						System.out.println();
						
					}
					break;
					
				case 5:
					if (burgerNum[choice-1] > 0) {
						Proceed1(burgerName, burgerPrice, burgerNum, choice);
			
					} else { 
						System.out.println("!! 현재 " + burgerName[choice-1] + "는 매진되었습니다.");
						System.out.println();
						
					}
					break;
				
				case 77:
					System.out.println("└─ 현재 주문가능한 버거수량입니다.");
					System.out.println();
					int cnt = 0, line = 3;
					
					for (int i=0; i<burgerName.length; i++ ) {
						System.out.print("[ " + burgerName[i] + ": " + burgerNum[i] + "개 ]");
						cnt++;
						if (cnt == line) {
							System.out.println();
							cnt = 0;	// 다시 0으로 초기화
						}
					}
					System.out.println("\n");
					break;
					
				case 99:				
					System.out.println("└─ 상위메뉴로 갑니다~");
					System.out.println();
					done = false;
					break;
					
				default: 
					if (choice == 99) {
						System.out.println("");
					} else { 
						System.out.println("!! 올바른 메뉴를 선택해주세요.");
						System.out.println("");
					}
					continue;
			}
		}
		
	}

	
	private static void Proceed1(String[] burgerName, int[] burgerPrice, int[] burgerNum, int choice) {

		boolean done = true;
		int sum = 0;
		
		System.out.println("└─ " + burgerName[choice-1] + "를 선택하셨습니다 가격은 " + burgerPrice[choice-1] + "원 입니다. [남은수량: " + burgerNum[choice-1] + "개]");
		
		while (done) {
			System.out.print("└─ 주문하시겠습니까?  예(1) / 아니오(2) ");
			int go = scan.nextInt();
			
			if (go == 1) {
				System.out.print("└─ 몇 개 주문하시겠습니까? ");
				int num = scan.nextInt();
				// 주문수량이 재고를 초과했을 경우
				if (num > burgerNum[choice-1]) {
					sum = num - burgerNum[choice-1];		
					System.out.println("!! 주문하신 양보다 재고가 " + sum + "만큼 없습니다. [남은수량: " + burgerNum[choice-1] + "개]");
					System.out.println();
					continue;
					
				} else if (num <= 0) {
					System.out.println("!! 잘못된 개수입니다.");
					System.out.println();
					
				} else {
					sum = burgerPrice[choice-1] * num;
					
					while (done) {
						System.out.print("└─ " + burgerName[choice-1] + " " + num + "개 " + sum + "원 입니다. 결제하시겠습니까?  예(1) / 아니오(2) ");
						go = scan.nextInt();
						
						if (go == 1) {
							burgerNum[choice-1] = burgerNum[choice-1] - num;
							
							System.out.println("└─ " + burgerName[choice-1] + "주문이 완료되었습니다~ [남은수량: " + burgerNum[choice-1] + "개]");
							System.out.println();
							done = false;
							break;
							
						} else if (go == 2) {
							System.out.println("└─ 주문을 중단합니다.");
							System.out.println();
							done = false;
							break;
							
						} else {
							System.out.println("!! 올바른 키를 입력해주세요.");
							System.out.println();
							continue;
							
						}
					}
				
				}
				
			} else if (go == 2) {
				System.out.println("└─ 주문을 중단합니다.");
				System.out.println();
				break;
				
			} else {
				System.out.println("!! 올바른 키를 입력해주세요.");
				System.out.println();
				continue;
				
			}						
		}
		
	}

}
