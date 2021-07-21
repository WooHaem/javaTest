/*
[상품]에 
상품추가,수정,삭제,조회가 가능한 프로그램작성
(1개의 상품만 제공합니다.)
상품의 정보 : 번호,상품명,가격,제조나라
Goods    : gNo, gName,gPrice,gMade

1) 상품클래스 작성

2) 동작흐름 작성
    - 인터페이스 작성
    - 인터페이스 구현
3) 컨트롤작성
   

[예외처리하기]
[오버라이딩] -> 부모클래스 메소드 변경함
[상속] -> 유사한 클래스를 확장하여 사용
[오버로딩]  -> 메소드이름같은것,매개변수는 틀림
[setter/getter]
[접근제한자] public,protected,(default),private
[인스턴스]
[클래스의 구성]
필드, 생성자, 메소드
-----------------------------------------
생성자, 매개변수생성자 : 속성을 초기화함.
-----------------------------------------------
this- 자신의 필드, this() - 자신의 생성자
-----------------------------------------------
super           super()

자동차 클래스
[속성]
- 엔진- 바퀴- 차종- 색상
[기능]
-> 달린다
-> 연비율

* 인스턴스(객체)
자동차 obj = new 자동차();
자동차 obj2 = new 자동차();
자동차 obj3 = new 자동차();
obj.차종 = "아반데";
obj.엔진 = "2000"
obj.바퀴 =4
obj.색상 ="빨강"


obj2.차종 ="suv";

 */
package kr.co.job.api;

import java.util.Scanner;

public class ProductControl2 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Product p1 = new Product();	// 인스턴스 생성
		ProductMessageImpl pc = new ProductMessageImpl();

		boolean done = true;

		while (done) {
			int sel = 0;
			sel = pc.menuSelect();

			switch (sel) {
			case 1: // 가입
				pc.goodsJoin(p1);
				break;

			case 2: // 수정
				pc.goodsUpdate(p1);
				break;

			case 3: // 삭제
				pc.goodsDelete(p1);
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

}
