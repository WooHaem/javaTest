/*
 * 상품 추가, 수정, 삭제, 조회 가능한 프로그램 작성
 * (1개의 상품만 제공됩니다)
 * public void goodsJoin(obj); => 상품추가 메소드
 * public void goodsUpdate(obj); => 상품수정 메소드
 * public void goodsDelete(obj); => 상품삭제 메소드
 */
package kr.co.job.api;

import java.util.Scanner;

public class ProductControl {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Product p1 = new Product(); // 인스턴스 생성
		boolean done = true;

		while (done) {
			int sel = 0;

			sel = menuSelect();

			switch (sel) {
			case 1: // 가입
				goodsJoin(p1);
				break;

			case 2: // 수정
				goodsUpdate(p1);
				break;

			case 3: // 삭제
				goodsDelete(p1);
				break;

			case 4:
				System.out.println();
				System.out.println(p1);
				System.out.println();
				break;

			case 99:
				System.out.println("￣￣프로그램을 종료합니다.");
				done = false;
				break;
			default:
				break;

			}
		} // while 끝

	} // main 끝

	private static int menuSelect() {
		System.out.println("￣￣어서오세요 연세몰입니다.");
		System.out.println("1.상품추가 2.상품수정 3.상품삭제 4.상품조회 99.종료");
		System.out.print("￣선택해주세요 : ");

		return scan.nextInt();
	}

	private static void goodsDelete(Product p1) {
		System.out.println();
		System.out.println("상품을 삭제 및 초기화합니다.");
//		p1 = new Product(0, "", 0, "");
//		p1 = null;	// 전부삭제

//		또는 초기화 시
		p1.setgMade("0");
		p1.setgName("");
		p1.setgNo(0);
		p1.setgPrice(0);

		System.out.println();

	}

	private static void goodsUpdate(Product p1) {
		System.out.println("￣상품수정을 진행합니다.");

		System.out.print("상품번호 : ");
		int gNo = Integer.parseInt(scan.next()); // nextInt()는 다중입력시,
		p1.setgNo(gNo);
		System.out.print("상품이름 : ");
		String gName = scan.next();
		p1.setgName(gName);
		System.out.print("상품가격 : ");
		int gPrice = Integer.parseInt(scan.next());
		p1.setgPrice(gPrice);
		System.out.print("제조국가 : ");
		String gMade = scan.next();
		p1.setgMade(gMade);

		System.out.println();
		System.out.println("￣수정되었습니다.");
		System.out.println(p1);
		System.out.println();

	}

	private static void goodsJoin(Product p1) {
		System.out.println("￣상품추가를 진행합니다.");

		System.out.print("상품번호 : ");
		int gNo = Integer.parseInt(scan.next());
		System.out.print("상품이름 : ");
		String gName = scan.next();
		System.out.print("상품가격 : ");
		int gPrice = Integer.parseInt(scan.next());
		System.out.print("제조국가 : ");
		String gMade = scan.next();

		p1.setgMade(gMade);
		p1.setgName(gName);
		p1.setgNo(gNo);
		p1.setgPrice(gPrice);

		System.out.println();
		System.out.println("￣상품이 추가되었습니다.");
		System.out.println(p1);
		System.out.println();

	}

}
