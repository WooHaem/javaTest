package kr.co.job.chap6;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stu;	// 선언
		
		stu = new Student("우해민", "컴공", "2021050003", 30);	// 인스턴스화
		System.out.println(stu);	// 해당 객체 출력
		// 컴공 -> 미대
//		stu.major = "회화";
		
		stu.setMajor("회화");
		System.out.println("당식의 학과 : " + stu.getMajor());

		
	}

}
