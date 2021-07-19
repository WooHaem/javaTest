/*
 * 은행계좌 클래스
 * - 속성(field) : 계좌번호, 예금주, 잔액
 * - 기능(Method) : 입금한다, 출금한다.
 *
 *
 * 생성자 : 모든 클래스는 하나의 생성자가 필요함.
 * -- 클래스에서 정의하지 않으면 기본생성자(디폴트생성자)가 자동발생.
 * -- 인스턴스시 필드의 값(속성)을 초기화하는 작업이 필요할 때 생성자 작성
 * =====> 매개변수 생성자.
 */
package kr.co.job.chap6;

public class Account {	// 클래스의 속성(데이터)만 정의 => bean Class(빈 클래스), VO, DTO
	// 필드
	//	public String accNo;	// 어느폴더에서나 접근하게 하려면 public을 붙여준다.
	String accNo;
	String name;
	int balance;
	// 생성자
	Account() {}; // 디폴트 생성자
	
	// 생성시 이름
	Account(String name) {
		this.name = name;
	}
	
	// 생성시 이름과 계좌번호
	Account(String name, String accNo) {
//		this.name = name;
		this(name);
		this.accNo = accNo;
	}
	
	Account(String name, String accNo, int balance) {
//		this.name = name;
//		this.accNo = accNo;
		this(name, accNo);	// 첫줄에 this() 사용해야함
		this.balance = balance;
	}
	
	
	
	void deposit(int amount) {	// 예금한다
		balance += amount;
	}
	
	int withdraw (int amount) {	// 출금한다
		if (balance < amount) {
			return 0;	// 잔액이 부족하면 0을 리턴
		}
		balance -= amount;
		return amount;
	}
}
