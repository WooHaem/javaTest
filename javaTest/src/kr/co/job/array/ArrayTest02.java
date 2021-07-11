package kr.co.job.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest02 {

	public static void main(String[] args) {
		// 문자열 배열 5개를 선언한 후, 5명의 이름을 입력받으세요
		Scanner scan = new Scanner(System.in);
		
		//선언
		String[] name;
		name = new String[5];	// ★★★★★★★ 필요할 때만 배열을 생성한다.
		
		//입력
		for (int i=0; i<name.length; i++) {
			System.out.print("이름을 입력하세요 : ");
			name[i] = scan.next();		
			
		}
		
		// 배열 나열식 출력.
		System.out.println(Arrays.toString(name));
		
		// 배열 하나하나 출력.
		for (int i=0; i<name.length; i++) {
			System.out.println("name [" + i + "] = " + name[i]);
		}
	}

}