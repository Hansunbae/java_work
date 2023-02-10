package Strings;

public class StringTest3 {
	// 쓰레드 ---> 메인 작업자1
	public static void main(String[] args) {
		// StringBuilder, StringBuffer 알아보자
		// 문자열을 여러번 연결하거나 변경할 때 유용하다.
		// StringBuffer는 멀티 쓰레드 프로그래밍에서 동기화를 보장한다.
		// 단일 쓰레드 프로그램에서는 StringBuilder를 권장한다.

		String java = new String("java");
		String android = new String("Android");
		System.out.println(" java 주소값 : " + System.identityHashCode(java));
		System.out.println(" android 주소값 : " + System.identityHashCode(android));
		System.out.println("----------------------");
		System.out.println(java + android);
		// java -> "java"
		StringBuilder builder = new StringBuilder(java);
		// 주소값 확인하기
		System.out.println("---------------------------------");
		System.out.println("builder : 주소값 " + System.identityHashCode(builder));
		System.out.println("builder 값  : " + builder);

		// builder 에 문자열 더하는 기능은 append이다.
		builder.append(android); // 기존 문자열 java에 android를 붙임 == 값을 변경
		System.out.println(builder);
		System.out.println("-------------------------");
		System.out.println(System.identityHashCode(builder));

		// 응용
		// 1 .
		// StringBuilder ---> String 형변환 방식은 toString 활용한다.
		String result = builder.toString();
		// 2. 문자열 연산으로 인한 자동형 변환이 되어 들어가진다.
		String result2 = builder + " : 반가워";

		// 정리
		// StringBuilder는 문자열을 다룰 때 한 번 생성한 문자열을 변경하더라도
		// 메모리를 새로 생성하지 않는다.

	} // end of main
}
