package kr.co.job.array;

import java.util.Scanner;

public class ArrayTest05 {

	public static void main(String[] args) {
		final int SIZE = 5;	//final 고정 : 변경불가
		String[] name = new String[SIZE];
		Scanner scan = new Scanner(System.in);
		
		// 이름 입력받기
		for (int i=0; i<SIZE; i++) {
			System.out.print("이름을 입력하세요 : ");
			name[i] = scan.next();
		}
		
		// 배열값 하나 출력하기 -(랜덤)
		int n = (int)(Math.random()*SIZE);
		System.out.println("임의의 배열값 출력 : " + name[n]);

	}

}