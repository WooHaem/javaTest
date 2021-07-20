/*
 * 학생 클래스 => Student
 * [속성, 멤버변수, 필드]
 * 학생명, 학과, 학번, 나이
 * [생성자]
 * 
 * bean Class, VO, DTO
 * 오버라이딩 -> 부모클래스 메소드 변경
 * 오버로딩 -> 메소드 아름은 같고, 매개변수는 다름
 * 
 * -------------------------------------------
 * 생성자, 매개변수생성자 : 속성을 초기화함.
 * this-자기자신의 필드, this()-자신의 생성자
 * -------------------------------------------
 * 
 * super	super()
 */
package kr.co.job.chap6;

public class Student {
	// 클래스 변수
	static int cnt;	// 정적 초기화 클래스변수(static) 동일한 값을 가지고 있음.
	
	// 필드
	private String name;
	private String major;
	private String sNo;
	private int age;
	
	
	// getter setter (필드가 private로 걸려있을 경우 필요)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getsNo() {
		return sNo;
	}

	public void setsNo(String sNo) {
		this.sNo = sNo;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

	// 생성자
	public Student() {
		cnt++;
		//cnt= cnt+1;
		System.out.println("학생생성");
		
	}

	public Student(String name, String major, String sNo, int age) {
		super();
		this.name = name;
		this.major = major;
		this.sNo = sNo;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", major=" + major + ", sNo=" + sNo + ", age=" + age + "]";
	}
	
	
	
}
