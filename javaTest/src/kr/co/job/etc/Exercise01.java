package kr.co.job.etc;

import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class Exercise01 {

	public static void main(String[] args) {
		// 4-1
		boolean done, powerOn;	// true, false
		
		String str = "no";
		int x = 0, year = 0, sum = 0;
		char ch = ' ';
		
		// 1. int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식
		if (x > 10 && x < 20) {
			done = true;
			
		// 2. char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식
		} else if (ch != ' ' && ch != '\t') {
			done = true;
			
		// 3. char형 변수 ch가 'x' 또는 'X'일 때 true인 조건식
		} else if (ch == 'x' || ch == 'X') {
			done = true;
		
		// 4. char형 변수 ch가 숫자 ('0' ~ '9')일 때 true인 조건식
		} else if (ch >= (int)'0' && ch >= (int)'9') {	// (ch >= '0' && ch >= '9')
			done = true;
			
		// 5. char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식
		} else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
			done = true;
			
		// 6. int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로 나눠떨어지지 않을 때 true인 조건식	
		} else if (year % 400 == 0 && year % 4 == 0 && year % 100 != 0) {
			done = true;
		
		// 7. boolean형 변수 powerOn가 false일 때 true인 조건식
		} else if (powerOn = false) {	// if(!powerOn)
			done = true;
			
		// 8. 문자열 참조변수 str이 "yes"일 때 true인 조건식
		} else if (str == "yes") {	//  if(str.equals("yes"))
			done = true;
		}
		
		// 4-2
		// 1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오.
		/*
		for (int i=1; i<=20; i++) {
			if (i%2 != 0 && i%3 != 0) { // 2또는 3의 배수가 아닌 수
				System.out.println(i);
				sum += i;
			}
		}
		System.out.println("합 : " + sum);
		*/
		
		// 4-3
		// 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오.
		/*
		for (int i=1; i<=10; i++) {
			for (int j=1; j <=i; j++) {
				sum += j;
				System.out.printf("%d", j);
			}
			System.out.println();
		}
		System.out.println("합 : " + sum);
		*/
		
		/* 선생님 답
		int totalsum =0;	//, sum = 0;
			for (int i=1; i<=9; i++) {
				sum += i;
				totalsum += sum;
			}
			System.out.println(totalsum);
		*/	
			
		// 4-4
		// 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100이상이 되는지 구하시오.		
		
		/*
		int num = 0, sum2 = 0;
		while (sum2 < 100) {
			++num;
			
			if (num%2 == 0) {
				sum2 -= num;
			} else {
				sum2 += num;
			}
			System.out.println("num="+num+"sum="+sum2);
		}
		*/
		
		
		/* 
		선생님 답 (for문)
		int i=0, sum2=0, s=-1;		
		for (i=1; true; i++) {
			sum2 = sum2 + i *(s*(-1));
			if (sum2>100) {
				break;
			}
		}
		System.out.println(i);
		선생님 답2 (while문)
		int i=0, sum2=0;
		while (sum2<100) {
			i++;
			if (i%2==1) {	// i가 홀수라면 +
				sum2 += i;
			} else {		// i가 짝수라면 -
				sum2 -= i;
			}
		}
		*/
		
		
		//System.out.println(num + "일 때, 총합이 " + sum2 + "이 된다.");
		
		// 4-5
		// 다음의 for문을 while문으로 변경하시오.
		/* 
		for(int i=0; i<=10; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		} 
		
		// 변환
		int i = 0;
		while ((i++)!=10) {
			int tmp = i;
			while ((tmp--)!=0) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		// 4-6
		// 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오.
		
		
		/* ★★★★★★★★★★★★ 아래와같이 모든 숫자로 나오는 값을 변수로 선언해서 들어가도록 한다. ★★★★★★★★★★★★★★
		int dice1=0, dice2=0, sum=0;
		int diceSize=6, result=6;
		
		for (int dice1=0; dice1<=diceSize; dice1++) {
			for (int dice2=0; dice2<=diceSize; dice2++) {
				if (dice1 + dice2 == result) {
					System.out.println("주사위1 = " + i + " / " + "주사위2 = " + j + " = " + (i+j));
				}
			}
		}
		*/
		
		/*
		for (int i=0; i<=6; i++) {
			for (int j=0; j<=6; j++) {
				if (i + j == 6) {
					System.out.println("주사위1 = " + i + " / " + "주사위2 = " + j + " = " + (i+j));
				}
			}
		}
		*/
		
		
		// 4-7
		// Math.random()을 이용해서 1부터 6사이의 임의의 정수를 변수 value에 저장하는 코드를 완성하라. (1)에 알맞은 코드를 넣으시오.
		/*
		int value = ((int)(Math.random()* 6) + 1);
		System.out.println("value : " + value);
		*/
		
		// 4-8
		// 방정식 2x+4y=10의 모든 해를 구하시오. 단, x와 y는 정수이고 각각의 범위는 0<=x<=10 이다.
		/*
		for (int X=0; X<=10; X++) {
			for (int Y=0; Y<=10; Y++) {
				if (2*X + 4*Y == 10) {
					System.out.println("2(" + X + ") + " + "4(" + Y + ") =" + (2*X + 4*Y));
				}
			}
		}
		*/
		
		// 4-9
		/* 
		숫자로 이루어진 문자열 str2이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라.
		만일 문자열이 "12345"라면, '1+2+3+4+5'의 결과인 15가 출력되어야 한다. (1)에 알맞은 코드를 넣으시오.
		*/
		
		/*
		String str2 ="12345";
		int sum3 = 0;
		
		for (int i=0; i<str2.length(); i++) {	// 문자를 아스키코드로 반환한다.
			sum3 += str2.charAt(i) - '0'; 		// 아스키코드 숫자를 반환한다 '1'문자의 아스키코드는 49 '0'문자의 아스키코드는 48. 그래서 49-48 = 1  
		}
		
		System.out.println("sum=" + sum3);
		*/
		
		// 4-10
		/*
		int타입의 변수 num이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라.
		만일 변수 num의 값이 12345라면, '1+2+3+4+5'의 결과인 15를 출력하라. (1)에 알맞은 코드를 넣으시오. 
		*/
		
		/*
		int num2 = 23456;
		int sum4 = 0;
		
		while (num2 > 0) {
			sum4 += num2%10;	// 숫자 맨끝자리수를 차례대로 반환. ex) 12345 / 10 = 나머지 5
			num2 /= 10;			// 나머지 계산 후 한자리씩 줄인다. ex) 12345 / 10 = 1234
			// 한자리 줄인 숫자를 다시 위에서 반복.
			System.out.println(num2 + "/10 = " + num2%10 + " = " + sum4);
		}
		System.out.println(sum4);
		*/
		
		// 4-11
		/*
		피보나치(Fibonnaci) 수열은 앞의 두 수를 더해서 다음 수를 만들어 나가는 수열이다. 예를 들어
		앞의 두 수가 1과 1이라면 그 다음 수는 2가 되고 그 다음 수는 1과 2를 더해서 3이 되어서 1,1,2,3,5,8,13,21... 과 같은 식으로 진행된다.
		1과 1부터 시작하는 피보나치수열의 10번째 수는 무엇인지 계산하는 프로그램을 완성하시오. 
		*/
		
		/*
		int num3 = 1;
		int num4 = 1;
		int num5 = 0;	// 세번째 값
		//System.out.println(num3 + "," + num4);
		
		for (int i=0; i<8; i++) {
			num5 = num3 + num4;
			System.out.println("합 : " + num3 + "+" + num4 + " = " + num5);
			num3 = num4;	// 이전 수의 값을 한자리씩 옮김.
			num4 = num5;	// 결과값을 이전의 덧셈값에 대입.
		}
		*/
		
		// 4-12 (★★★★★★)
		// 구구단의 일부분을 다음과 같이 출력하시오.
		
		/*
		for (int i=1; i<=9; i++) {
			for (int j=1; j<=3; j++) {
				int z = 0;
				int y = i%3 == 0 ? 3: i%3;	// i를 3의 배수라면 3을 대입. 
				
				System.out.println(z+ "*" + y + "=" + z*y + "\t");
				if (i%3 == 1) {
					
				}
			}
		}
		*/
		
		// 4-13
		// 다음은 주어진 문자열(value)이 숫자인지를 판별하는 프로그램이다. (1)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
		/*
		String value2 = "12o34";
		char ch2 = ' ';
		boolean isNumber = true;
		
		// 반복문과 charAt(int i)를 이용해서 문자열의 문자를 하나씩읽어서 검사한다.
		for(int i=0; i < value2.length() ;i++) {
			ch2 = value2.charAt(i);
			if (!(ch2 >= '0' && ch2 <= '9')) {
				isNumber = false;
				break;
			}
		}
		
		if (isNumber) {
			System.out.println(value2 + "는 숫자입니다.");
		} else {
			System.out.println(value2 + "는 숫자가 아닙니다.");
		}
		*/
		
		// 4-14
		/*
		다음은 숫자맞추기 게임을 작성한 것이다. 1과 100사이의 값을 반복적으로 입력해서 컴퓨터가 생각한 값을 맞추면 게임이 끝난다.
		사용자가 값을 입력하면, 컴퓨터는 자신이 생각한 값과 비교해서 결과를 알려준다. 사용자의 컴퓨터가 생각한 숫자를 맞추면
		게임이 끝나고 몇 번 만에 숫자를 맞췄는지 알려준다. (1)~(2)에 알맞은 코드를 넣어 프로그램을 완성하시오. 
		*/
		
		/*
		// 1~100사이의 임의의 값을 얻어서 answer에 저장한다.
		int answer = (int)(Math.random() * 100) + 1;
		int input = 0;	// 사용자 입력을 저장할 공간
		int count = 0;	// 시도횟수를 세기위한 변수
		
		// 화면으로부터 사용자입력을 받기 위해서 Scanner클래스 사용
		Scanner s = new Scanner(System.in);
		
		do {
			count++;
			System.out.print("1과 100사이의 값을 입력하세요 :");
			input = s.nextInt();	// 입력받은 값을 변수 input에 저장한다.
			
			if(input < answer) {
				System.out.println("더 큰 수를 입력하세요.");
			} else if (input == answer) {
				System.out.println("맞췄습니다.");
				System.out.println("시도횟수는 " + count + "번 입니다.");
				break;
			} else {
				System.out.println("더 작은 수를 입력하세요.");
			}
			
		} while(true);	//무한반복문
		*/
		
		// 4-15 (★★★★★★)
		/*
		다음은 회문수를 구하는 프로그램이다. 회문수(palindrome)란, 숫자를 거꾸로 읽어도 앞으로 읽는 것과 같은 수를 말한다. 
		예를 들면 '12321'이나 '13531'같은 수를 말한다. (1)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
		*/
		
		/*
		int number =12321;
		int tmp = number;
		
		int result = 0; // 변수 number를 거꾸로 변환해서 담을 변수
		
		while (tmp !=0) {
			result = result*10 + tmp%10;	// 1, 10, 100의 자리 순으로 만든다고 생각하고 나머지 값을 누적한다.
			tmp = tmp/10;					// 1의 자리를 구했다면 10의 자리를 구하기 위해 나눈다.
			
			System.out.println("변환값 : " + result);
			System.out.println("다음값 : " + tmp);
			
		}	
		
		if (number == result) {
			System.out.println(number + "는 회문수 입니다.");
		} else {
			System.out.println(number + "는 회문수가 아닙니다.");
		}
		*/
		
		
	}

}