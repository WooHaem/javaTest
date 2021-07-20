/*
 * 클래스의 속성(데이터)만 정의 -> bean Class, VO, DTO(웹)
 * 
 * - 클래스 : 속성과 메소드 그리고 생성자로 구성됨
 * -- 클래스의 캡슐화(은닉) : private Goods Class
 * -- 클래스의 상속(다중상속안됨)
 * -- 메소드의 오버라이딩 : 상속받은 메소드를 변경하는 것
 * 
 * Account obj = new Account();	//객체생성, 인스턴스화 라고 부름
 * 
 * 참고) 메모장: 0715.txt
 * 
 * ※ 상속의 예)
 * 펜(색상, 길이, 쓴다) -> 볼펜(기본특성 쓴다 5555임)
 * -> 싸인펜
 * -> 마카펜 : 던진다.  <== 라고 하면,
 *
 * 마카펜 extends 펜 {	// extends 는 기본특성을 상속받고 추가함.
 *    던진다.
 *    쓴다 {	// 오버라이딩 기존 '쓴다'값 5555를 6666으로 바꿈
 *      6666	
 *    }
 * }
 */


package kr.co.job.chap6;

public class AccountTest01 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Account obj = new Account();
      obj.accNo="123-23-2324";
      obj.name="홍길동";
      obj.balance=10000;
      
      //만원을 입금
      
      obj.deposit(10000);
      
      System.out.println("예금주명 : " + obj.name);
      System.out.println("계좌번호 : " + obj.accNo);
      System.out.println("잔액 " + obj.balance);
      
      //오천원을 출금
      try {
         obj.withdraw(25000);
      } catch (Exception e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } finally {
         System.out.println("여기는 무조건 거쳐간다.");
      }
      
      System.out.println("예금주명 : " + obj.name);
      System.out.println("계좌번호 : " + obj.accNo);
      System.out.println("잔액 " + obj.balance);
      System.out.println("==========================");
      //은행계좌 생성시 이름을 주고싶다ㅓ
      Account obj2 = new Account("장길산");
      //   obj2.name = "장길산";
      System.out.println(obj2.name);
      System.out.println("==========================");
      
      Account obj3 = new Account("임걱정", "910-3004-3156", 1000000000);
      //System.out.println(obj3.name +", "+ obj3.accNo +", "+ obj3.balance);
      printAccount(obj3);
      System.out.println("==========================");
      
      MinusAccount obj4 = new MinusAccount("마이너스", "110-333-598299", 7000, 1000000);	// obj4는 인스턴스
      obj4.withdraw(10000);
      printAccount(obj4);
      System.out.println("=========================");
    
      

   }
   private static void printAccount(Account obj) {
   //private static void printAccount(Object obj) {
      System.out.println(obj.name +", "+ obj.accNo +", "+ obj.balance);
   }

}