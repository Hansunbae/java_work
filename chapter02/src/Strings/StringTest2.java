package Strings;

public class StringTest2 {

	public static void main(String[] args) {
		// 상수풀이라는 개념을 이해하였다 가정했을 때
		// 실제 주소값을 찍어보자
		// Student sKim = new Student();
		// System.out.println(sKim); <---주소값이 찍혔다.
		// Object 클래스 일 때 확인

		String str1 = "반가워"; // 1번 방식 -> 상수풀이라는 메모리 영역에 올라감
		String str2 = new String("반가워"); // 2번 방식 -> )heap 메모리 영역(동적메모리)에 주소값이 담김
		String str3 = new String("반가워"); // ?? str2 와 str3은 주소값이 같을까요?
		String str4 = "반가워"; // ?? str1 과 str4는 주소값이 같을까요?

		// 현재 String 의 주소값을 찍어보는 방법?
		System.out.println(System.identityHashCode(str1)); // 93122545
		System.out.println(System.identityHashCode(str4)); // 93122545
		System.out.println(System.identityHashCode(str2)); // 2083562754
		System.out.println(System.identityHashCode(str3)); // 1239731077

		// 상수 풀에 한번 생성된 문자열은 불변(immutable)이다.
		str4 = str4 + " 홍길동";
		System.out.println(System.identityHashCode(str4)); // 557041912
		str1 += " : 하이";
		System.out.println(System.identityHashCode(str1)); // 1134712904
		// 상수 풀 영역에 한번 생성된 문자열 값은 변경이 불가능하다.
		// str1 += " : 하이"; <------ 무조건 새로 생성된다 . 상수풀 영역에 / 동일한 주소로 들어가서 값을 변경하는게 아님

		// 가, 나, a , 가 다 마 마 아 ㅏ ㅓ <----계속 상수 풀 영역에 메모리를 사용한다.
		// 그래서 채팅 프로그램이나 메모리를 관리해야하는 프로그램이라면(메모리를 효율적으로 사용해야 하는 경우)
		// StringBuiler 클래스와 , StringBuffer 클래스를 알아야한다.

	} // end of main

} // end of class
