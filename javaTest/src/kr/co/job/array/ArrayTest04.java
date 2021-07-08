/*
 * 10개 배열을 생성하여 배열의값을 0~9까지 순차적으로 초기화하고
 * 해당 배열값을 섞어보기
 */

package kr.co.job.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayTest04 {

	public static void main(String[] args) {
		//
		int[] numArr = new int[100];
		int n = 0, tmp =0;
		
		// 한 줄당 10개씩 출력
		int cnt =0, line=10;
		
		for (int i=0; i<numArr.length; i++) {
			numArr[i] = i;
			System.out.print(numArr[i] + ",");
			cnt++;
			if (cnt == line) {
				System.out.println();
				cnt = 0;	// 다시 0으로 초기화
			}
		}

		for (int i=1; i<100; i++) {	// 1000회
			n = (int)(Math.random()*100);	// n에 1부터 100까지의 랜덤값을 생성
			
			tmp = numArr[0];		// tmp에 배열 인덱스 첫번째 값을 저장(또는 임의의 인덱스값을 저장해도 됨)
			numArr[0] = numArr[n];	// 배열 인덱스 첫번째 값에 배열 1~100까지의 랜덤의 인덱스 값을 저장
			numArr[n] = tmp;		// 배열 1~100까지의 랜덤의 인덱스 값에 tmp값을 저장
						
		}
		System.out.println("=====================");
		System.out.println(Arrays.toString(numArr));
	}

}
