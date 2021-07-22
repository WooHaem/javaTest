/*
 * 컬렉션 프레임워크
 * List : ArrayList, LinkedList
 */
package kr.co.job.array;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest01 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("딸기");
		list.add("포도");
		list.add("수박");
		list.add("사과");

		int num = list.size();

		System.out.println(num);
		for (int i = 0; i < num; i++) {
			System.out.println(i + "번째 데이터 : " + list.get(i));
		}
		System.out.println("===============추가===============");

		// 인덱스 2위치에 메로나를 추가합니다 Insert 삽입
		list.add(2, "메로나");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + "번째 데이터 : " + list.get(i));
		}
		System.out.println("===============변경===============");

		// 첫번째요소(index)의 데이터를 오렌지로 변경
		list.set(0, "오렌지");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + "번째 데이터 : " + list.get(i));
		}
		System.out.println("===============삭제===============");

		// 두번째요소(index)의 데이터를 삭제
		list.remove(1); // 또는 list.remove("포도")

		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + "번째 데이터 : " + list.get(i));
		}
		System.out.println("===============검색===============");

		int index = list.indexOf("수박");
		System.out.println("찾은 위치 : " + index);
		index = list.lastIndexOf("수박");
		System.out.println("찾은 위치 : " + index); // 데이터를 뒤에서부터 찾음

		System.out.println("===============Iterator===============");
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("===============향상된 for문===============");
		for (String str:list) {
			System.out.println(str);
		}

	}

}
