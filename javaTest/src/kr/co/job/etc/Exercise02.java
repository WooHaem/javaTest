package kr.co.job.etc;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		/* 
		 * 1. 각 회원은 회원번호로 식별되며 
		 * 이름,주민번호,주소,핸드폰번호,메일주소, 
		 * 좋아하는 장르에 대한 정보를 가지고 있다.
		 */
		
		Scanner scan = new Scanner(System.in);
	    boolean done = true;
	    
	    while (done) {
	    	// 변수 설정 및 선언
	    	int Choice, Phone, yon;
			int[] IDnum;
	    	String Name, Email;
			String[] Adress;
	    	
	    	// 폼보드 출력
	    	System.out.println("==============================회원가입==============================");
	    	System.out.println("| 1.이름 | 2.주민등록번호 | 3.주소 | 4.핸드폰번호 | 5.메일주소 | 6.좋아하는 장르 |");
	    	System.out.println("====================================================== 종료.10 ====");
	    	
	    	// 항목 입력
	    	System.out.print("등록 및 수정하실 항목을 선택하세요 : ");
		    Choice = scan.nextInt();
		    
		    switch (Choice) {
		    	case 1 :
		    		System.out.println("이름을 입력하세요.");
		    		Name = scan.next();	
		    	case 2 :
		    		IDnum = new int[2];
		    		System.out.println("주민등록번호 앞 6자리를 입력해주세요");
		    		IDnum[0] = scan.nextInt();
		    		System.out.println("나머지 뒤에 6자리를 입력하세요.");
		    		IDnum[1] = scan.nextInt();
		    		
		    		if (IDnum) {
		    			
		    		}
		    		System.out.println("입력하신 번호는 " + IDnum[0] + "-" + IDnum[1] + " 입니다.");
		    	case 3 :
		    		Adress = new String[5];		    		
		    		while (done) {
		    			System.out.println("주소을 입력하세요.");
		    			Name = scan.next();			    			
		    		}
		    		
		    	case 4 :
		    		
		    	case 5 : 
		    		
		    	case 6 :
		    		
		    	case 10 :
		    		
		    	default :
		    
		    }
		    		   		    
		    
	    }
	
	}

}
