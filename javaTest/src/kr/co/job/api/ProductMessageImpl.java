package kr.co.job.api;

import java.util.Scanner;

public class ProductMessageImpl implements ProductMessage {
	Scanner scan = new Scanner(System.in);

	@Override
	public int menuSelect() {
		System.out.println("￣￣어서오세요 연세몰입니다.");
		System.out.println("1.상품추가 2.상품수정 3.상품삭제 4.상품조회 99.종료");
		System.out.print("￣선택해주세요 : ");
		
		return scan.nextInt();
	}

	@Override
	public void goodsJoin(Product obj) {
		System.out.println("￣상품추가를 진행합니다.");

		System.out.print("상품번호 : ");
		int gNo = Integer.parseInt(scan.next());
		System.out.print("상품이름 : ");
		String gName = scan.next();
		System.out.print("상품가격 : ");
		int gPrice = Integer.parseInt(scan.next());
		System.out.print("제조국가 : ");
		String gMade = scan.next();

		obj.setgMade(gMade);
		obj.setgName(gName);
		obj.setgNo(gNo);
		obj.setgPrice(gPrice);

		System.out.println();
		System.out.println("￣상품이 추가되었습니다.");
		System.out.println(obj);
		System.out.println();
		
	}

	@Override
	public void goodsUpdate(Product obj) {
		System.out.println("￣상품수정을 진행합니다.");

		System.out.print("상품번호 : ");
		int gNo = Integer.parseInt(scan.next()); // nextInt()는 다중입력시,
		obj.setgNo(gNo);
		System.out.print("상품이름 : ");
		String gName = scan.next();
		obj.setgName(gName);
		System.out.print("상품가격 : ");
		int gPrice = Integer.parseInt(scan.next());
		obj.setgPrice(gPrice);
		System.out.print("제조국가 : ");
		String gMade = scan.next();
		obj.setgMade(gMade);

		System.out.println();
		System.out.println("￣수정되었습니다.");
		System.out.println(obj);
		System.out.println();
		
	}

	@Override
	public void goodsDelete(Product obj) {
		System.out.println();
		System.out.println("상품을 삭제 및 초기화합니다.");
//		obj = new Product(0, "", 0, "");
//		obj = null;	// 전부삭제

//		또는 초기화 시
		obj.setgMade("");
		obj.setgName("");
		obj.setgNo(0);
		obj.setgPrice(0);

		System.out.println();
		
	}

}
