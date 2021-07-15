/*
 * 은행계좌 클래스
 * - 속성(field) : 계좌번호, 예금주, 잔액
 * - 기능(Method) : 입금한다, 출금한다.
 */
package kr.co.job.chap6;

public class Account {	// 클래스의 속성(데이터)만 정의 => bean Class(빈 클래스), VO, DTO
//	public String accNo;	// 어느폴더에서나 접근하게 하려면 public을 붙여준다.
	String accNo;
	String name;
	int balance;
	
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
