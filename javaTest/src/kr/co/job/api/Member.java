/*
 * 모델링(기획 -> 설계)
 * 회원 : 순번, 아이디, 이름, 나이, 취미, 종교......
 *  속성 - 필수데이터, 선택데이터
 *  기능??? 가입하기, 수정하기, 삭제하기, 회원조회(전체, 선택) => 제어하기위한 메인(Control)
 *  생성자 -> 객체를 인스턴스할때 필드값을 초기화를 한다.
 */
package kr.co.job.api;

public class Member {
	private int no;
	private String id;
	private String name;
	private int age;

	//생성자
	public Member(int no, String id, String name, int age) {
		super();
		this.no = no;
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	// MemberControl.java 에서 m1 = new Member(); 를 만들경우 아래와 같은 디폴트생성자가 필요함.
	public Member() {
		
	}

	//setter, getter 작성
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "회원정보 [번호=" + no + ", 아이디=" + id + ", 이름=" + name + ", 나이=" + age + "]";
	}
	
	
	
}
