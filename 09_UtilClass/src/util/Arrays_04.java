package util;

import java.util.Arrays;

/*
 * 4.Arrays 클래스
 * 	-배열 객체를 처리해 주는 클래스
 */
public class Arrays_04 {

	public static void main(String[] args) {

		String[] str = { "홍길동", "이순신", "유관순" };

		for (String k : str) { // 단축 포문, 향상된 포문

			System.out.println("str 배열 요소 >>> " + k);

		}
		System.out.println();
		// 1. fill() : 배열의 요소를 특정한 값(데이터로) 채우는 메서드.

		Arrays.fill(str, "김유신");

		for (String k : str) { // 단축 포문, 향상된 포문

			System.out.println("str 배열 요소 >>> " + k);

		}

		System.out.println();

		String[] str2 = { "김유신", "김유신", "이유신" };

		// 2. equals(객체, 객체) 객체를 비교함. 객체안에있는 요소가 서로 같나요?
		// 두 객체의 내용(데이터)이 같은지, 다른지 비교하는 메서드. - 반환타입은 boolean 타입

		if (Arrays.equals(str, str2)) {

			System.out.println("두 객체의 내용(데이터)은 같습니다.");

		} else {

			System.out.println("두 객체의 내용(데이터)은 다릅니다.");

		}

		System.out.println();

		// 3.sort() : 배열의 원소(데이터)를 정렬(오름차순) 해주는 메서드

		int[] arr = { 54, 67, 13, 97, 41 };

		Arrays.sort(arr); // 오름차순 정렬

		for (int s : arr) {

			System.out.print(s + "\t");
		}

	}

}
