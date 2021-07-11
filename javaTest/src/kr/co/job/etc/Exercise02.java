package kr.co.job.etc;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		/* 
		 * 1. �� ȸ���� ȸ����ȣ�� �ĺ��Ǹ� 
		 * �̸�,�ֹι�ȣ,�ּ�,�ڵ�����ȣ,�����ּ�, 
		 * �����ϴ� �帣�� ���� ������ ������ �ִ�.
		 */
		
		Scanner scan = new Scanner(System.in);
	    boolean done = true;
	    
	    while (done) {
	    	// ���� ���� �� ����
	    	int Choice, Phone, yon;
			int[] IDnum;
	    	String Name, Email;
			String[] Adress;
	    	
	    	// ������ ���
	    	System.out.println("==============================ȸ������==============================");
	    	System.out.println("| 1.�̸� | 2.�ֹε�Ϲ�ȣ | 3.�ּ� | 4.�ڵ�����ȣ | 5.�����ּ� | 6.�����ϴ� �帣 |");
	    	System.out.println("====================================================== ����.10 ====");
	    	
	    	// �׸� �Է�
	    	System.out.print("��� �� �����Ͻ� �׸��� �����ϼ��� : ");
		    Choice = scan.nextInt();
		    
		    switch (Choice) {
		    	case 1 :
		    		System.out.println("�̸��� �Է��ϼ���.");
		    		Name = scan.next();	
		    	case 2 :
		    		IDnum = new int[2];
		    		System.out.println("�ֹε�Ϲ�ȣ �� 6�ڸ��� �Է����ּ���");
		    		IDnum[0] = scan.nextInt();
		    		System.out.println("������ �ڿ� 6�ڸ��� �Է��ϼ���.");
		    		IDnum[1] = scan.nextInt();
		    		
		    		
		    		System.out.println("�Է��Ͻ� ��ȣ�� " + IDnum[0] + "-" + IDnum[1] + " �Դϴ�.");
		    	case 3 :
		    		Adress = new String[5];		    		
		    		while (done) {
		    			System.out.println("�ּ��� �Է��ϼ���.");
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
