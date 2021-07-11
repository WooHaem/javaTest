/* 두 수를 입력받아서 더하기, 빼기, 곱하기, 나누기를 구하는 메소드
 * void plusV(int n1, int n2);
 * minusV(), mulV(), divV()		=> 메소드 이름
 */
package kr.co.job.func;

public class ExamFunction02 {


	public static void main(String[] args) {
		// 3,5의 합 구하기
		int plus = plusV(3, 5);	// 함수에서 return으로 보낸 값을 동일한 데이터타입으로 바꾸어 선언해준다.
		System.out.println("3과 5의 합 : " + plus);	
		// 3,10의 뺄셈
		int minus = minusV(3, 10);
		System.out.println("3과 5의 뺄 : " + minus);
		// 5,4의 곱셈
		int multiple = mulV(5, 4);
		System.out.println("3과 5의 곱 : " + multiple);
		// 2,8의 나눗셈
		int division = divV(2, 8);
		System.out.println("3과 5의 나 : " + division);
		
	}

	private static int divV(int i, int j) {		// private static 데이터타입 함수()
		int sum = i / j;
		//System.out.println(i + "÷" + j + " = " + sum);
		//System.out.println("");
		return i / j;	// 함수밖으로 결과값을 출력하는 방법. => return은 무조건 하나 두개이상 안됨.
	}

	private static int mulV(int i, int j) {
		int sum = i * j;
		//System.out.println(i + "X" + j + " = " + sum);
		//System.out.println("");
		return i * j;
	}

	private static int minusV(int i, int j) {
		int sum = i - j;
		//System.out.println(i + "-" + j + " = " + sum);
		//System.out.println("");
		return i - j;
	}

	private static int plusV(int i, int j) {
		int sum = i + j;
		///System.out.println(i + "+" + j + " = " + sum);
		//System.out.println("");
		return i + j;
	}

}