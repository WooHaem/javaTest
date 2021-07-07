package kr.co.job.oper;

import java.util.Scanner;

public class ForTest06 {

	public static void main(String[] args) {
		System.out.println("========줄칸 또는 행열에 대하여========");
		for (int i=1; i<=4; i++) { //줄
			
			for (int j=1; j<=i; j++) { //칸 j : 별의 개수 
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 난수 발생 : Math.random() = 0~0.9999의 임이의 수를 "하나만" 발생시킴
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());

		int num =0;
		num = (int)(Math.random()*10); // 0 ~ 9 까지의 수가 나온다. (10을 곱해 1의자리수로 변환되었기 때문)
		System.out.println(num);
		
		// 1~10까지의 수 발생시키기
		num = (int)(Math.random()*10) + 1; // 0 ~ 9 까지니까 최대수 9에 +1을 하면 10까지 나온다.
		System.out.println(num);
		
		// 1~45까지의 수 발생
		num = (int)(Math.random()*45) + 1; // 제일 큰 값은 * 곱셈에 입력해준다. / * 45는 범위 (45가지의 수를 뜻함) 
		System.out.println(num);
		
		// 11~13사이의 수 발생
		for (int i=1; i<=3; i++) {
			num = (int)(Math.random() * 3) + 11;
			System.out.println(num);
		}
		
	}

}
