package kr.co.job.oper;

import java.util.Scanner;

public class WhileTest02 {

	public static void main(String[] args) {
		int i = 1 , sum = 0;
		
		while(true) {
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
