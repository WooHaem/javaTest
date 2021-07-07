package kr.co.job.oper;

import java.util.Scanner;

public class WhileTest02 {

	public static void main(String[] args) {
		int i = 1 , sum = 0;
		
		while(true) { // 무한반복 true 조건으로 주기
			sum +=i;
			System.out.println(i);
			if (i == 10) {
				break;
			}
			i++;
		}
		System.out.println("sum = " + sum);
		

	}

}
