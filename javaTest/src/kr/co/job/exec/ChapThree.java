package kr.co.job.exec;

public class ChapThree {

	public static void main(String[] args) {
		System.out.println("--------------------------------3-1");
		int x = 2;
		int y = 5;
		char c = 'A'; // 'A'�� �����ڵ�� 65
		
		System.out.println(1 + x << 33);
		System.out.println(y >= 5 || x < 0 && x > 2);
		System.out.println(y += 10 - x++);
		System.out.println(x += 2); // �ٷ� ���� ++�� ���� x���� 2���� 3�� ��.
		System.out.println( !('A' <= c && c <= 'Z') );
		System.out.println('C'-c); // ���ڰ� �ִ°��� -+ �� ���ԵǴ� ���� �ƽ�Ű�ڵ�� ��ȯ.
		System.out.println('5'-'0');
		System.out.println(c+1);
		System.out.println(++c);
		System.out.println(c++);
		System.out.println(c);
		
		
		System.out.println("--------------------------------3-2");
		int numOfApples = 123;	// ����� ����
		int sizeOfBucket = 10;	// �ٱ����� ũ�� (�ٱ��Ͽ� ���� �� �ִ� ����� ����)
		int numOfBucket = numOfApples / sizeOfBucket + ( numOfApples%sizeOfBucket > 0 ? 1:0);	//��� ����� ��µ� �ʿ��� �ٱ����� ��
		
		System.out.println("�ʿ��� �ٱ����� �� : " + numOfBucket);
		
		
		System.out.println("--------------------------------3-3");
		int num = 10;
		System.out.println(num > 0 ? "���":(num < 0 ? "����":0));
		
		
		System.out.println("--------------------------------3-4");
		int num2 = 456;
		System.out.println(num2/100*100);
		
		
		System.out.println("--------------------------------3-5");
		int num3 = 333;
		System.out.println(num3/10*10+1);
		
		
		System.out.println("--------------------------------3-6");
		int num4 = 24;
		System.out.println(10 - num4%10);
		
		
		System.out.println("--------------------------------3-7");	
		// 3-7
		int fahrenheit = 100;
		float celcius = ((int)(5f/9 * (fahrenheit - 32) * 100  + 0.5f)) / 100f;
		
		System.out.println("Fahrenheit: " + fahrenheit);
		System.out.println("Celcius: " + celcius);
		
		
		System.out.println("--------------------------------3-8");	
		byte a = 10;	// ASKII �ڵ� = 7��Ʈ (0~127)
		byte b = 20;
		int c_1 = a + b;
		
		char ch = 'A';
		ch = (char)(ch + 2);
		
		float f = 3 / 2f;
		long l = 3000l * 3000l * 3000l;
		
		float f2 = 0.1f;
		double d = (float)0.1;
		
		boolean result = d==f2;
		
		System.out.println("c="+c_1);
		System.out.println("ch="+ch);
		System.out.println("f="+f);
		System.out.println("l="+l);
		System.out.println("result="+result);
		

		System.out.println("--------------------------------3-9");
		char ch_1 = 'z';
		boolean b_1 = ('a' <= ch && 'z' >= ch) || ('A' <= ch && 'Z' >= ch) || ('0' <= ch && '9' >= ch); // <= 48�׸��� 57
		
		System.out.println(b_1);
		
		
		System.out.println("--------------------------------3-10");
		char ch_2 ='A';
		
		char lowerCase = ('A' <= ch && 'Z' >= ch) ? (char)(ch_2 + 32) : ch_2;
		
		System.out.println("ch:"+ch_2);
		System.out.println("ch to lowerCase: " +lowerCase);
	}

}
