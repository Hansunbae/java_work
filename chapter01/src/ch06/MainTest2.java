package ch06;

public class MainTest2 {
	// 메인 함수 -> 코드의 시작점
	// 스택 : 함수가 호출될 때 지역변수들이 사용하는 메모리 -> 함수가 호출되면 컴파일러가 main함수를 먼저 확인함
	// 메모리에 메인함수 영역을 만든다. 그리고 그 안에 아래서부터 변수영역을 쌓는다
	public static void main(String[] args) {
		int n1;
		int n2;
		n1 = 100;
		// 함수 호출
		hello();

	} // end of main

	// 함수 호출 시 stack이라는 메모리 영역을 잡아둔다.
	// 변수를 영역 안에 넣고 함수의 실행이 끝나면 실행의 제어권을 반납하고 변수를 메인함수에 return한다.
	public static void hello() {
		int a1;
	}

} // end of class
