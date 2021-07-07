package kr.co.job.check;

import java.util.Scanner;

public class exam02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] drinkPrice, drinkGa;	// drinkGa (재고)
		String[] drinkName;
		
		boolean done = true;
		int coin = 0, num = 0, choose = 0;
		
// 1. 음료의 가격과 재고 이름을 정해준다.
		drinkPrice = new int[] {500, 700, 1000};					//가격
		drinkGa = new int[] {5, 4, 3};							//재고
		drinkName = new String[] {"콜라", "사이다", "커피"};		//이름
		
// 2. 투입할 금액을 입력한다.
		System.out.print("동전을 넣어주세요 : ");
		coin = scan.nextInt();
		
// 3. 자판기를 실행한다.
		while (done) {
		
			System.out.println("=================[ Menu ]=================");
			System.out.println("1.콜라(500)  2.사이다(700)  3.커피(1000)  4.종료");
			System.out.println("============================= 잔액 : " + (coin) + "원 =");
			
// 4. 음료를 선택한다.
			System.out.print("선택하세요 : ");
			num = scan.nextInt();
			
			if (num < 4) {
				if (coin < drinkPrice[num-1]) {	
					System.out.println("잔액이 부족합니다 충전하시겠습니까? 예(1) / 아니오(2)");
					choose = scan.nextInt();
					
					if (choose == 1) {
						System.out.print("투입할 금액은? ");
						coin = coin + scan.nextInt();
						continue;
					} else if (choose == 2) {
						System.out.println("다른음료를 선택해주세요");
						System.out.println(" ");
						continue;
					} else {
						System.out.println("올바른 버튼을 입력해주세요.");
						System.out.println(" ");
						continue;
					}
				}	
			}

// 5. 음료가 나온다 or 잔액이 부족하다면 다시 메뉴로
			switch (num) {
				case 1: 	// 콜라
					if (coin >= drinkPrice[num-1]) {
						if (drinkGa[num-1] == 0) {
							System.out.println("매진되었습니다. 다른음료를 선택해주세요.");
							break;
						}
// 6. 잔여개수를 나타내고 (해당음료의)잔액을 반환한다.
						System.out.println(drinkName[num-1] + " 나옵니다.");
						coin = coin - drinkPrice[num-1];
						drinkGa[num-1] = drinkGa[num-1] - 1;
						System.out.println("※남은 재고 : " + drinkGa[num-1]);
						System.out.println(" ");
						break;
					} else {
						System.out.println("잔액이 부족합니다.");
						System.out.println("※남은 재고 : " + drinkGa[num-1]);
						System.out.println(" ");
						break;
					}
				case 2:		// 사이다
					if (coin >= drinkPrice[num-1]) {
						if (drinkGa[num-1] == 0) {
							System.out.println("매진되었습니다. 다른음료를 선택해주세요.");
							break;
						}
						System.out.println(drinkName[num-1] + " 나옵니다.");
						coin = coin - drinkPrice[num-1];
						drinkGa[num-1] = drinkGa[num-1] - 1;
						System.out.println("※남은 재고 : " + drinkGa[num-1]);
						System.out.println(" ");
						break;
					} else {
						System.out.println("잔액이 부족합니다.");
						System.out.println("※남은 재고 : " + drinkGa[num-1]);
						System.out.println(" ");
						break;
					}
				case 3:		// 커피
					if (coin >= drinkPrice[num-1]) {
						if (drinkGa[num-1] == 0) {
							System.out.println("매진되었습니다. 다른음료를 선택해주세요.");
							break;
						}
						System.out.println(drinkName[num-1] + " 나옵니다.");
						coin = coin - drinkPrice[num-1];
						drinkGa[num-1] = drinkGa[num-1] - 1;
						System.out.println("※남은 재고 : " + drinkGa[num-1]);
						System.out.println(" ");
						break;
					} else {
						System.out.println("잔액이 부족합니다.");
						System.out.println("※남은 재고 : " + drinkGa[num-1]);
						System.out.println(" ");
						break;
					}
				case 4:
					System.out.println("종료합니다.");
					done = false;
					break;
				default:
					System.out.println("잘못된 입력입니다.");
					break;
			
			}
		}
		
		
		
	}

}
