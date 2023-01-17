package string;

public class String_02 {

	public static void main(String[] args) {

		String str1 = "Hello ";
		String str2 = "Java";

		System.out.println("str1 주소 >>> " + System.identityHashCode(str1));
		System.out.println("str2 주소 >>> " + System.identityHashCode(str2));

		System.out.println();

		// 문자열 연산(결합) //상수풀을 찾고 없으면 새로운 상수풀 찾고 새롭게 만들어준다.
		// 스트링 클래스는 문자열을 삭제하거나 추가가 안된다. 새로운 주소를 만들어서 처리!
		// string은 final 클래스니까! 상속이 안된다! 상수화가 되버림.

		str1 = str1 + str2;
		System.out.println("str1 주소 >>> " + System.identityHashCode(str1));

	}

}
