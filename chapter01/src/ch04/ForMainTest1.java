package ch04;

public class ForMainTest1 {

	public static void main(String[] args) {

		// 화면에 구구단 2단을 출력하시오
		int num = 2;
		System.out.println(num + " *1 = " + (num * 1));
		System.out.println(num + " *2 = " + (num * 2));
		System.out.println(num + " *3 = " + (num * 3));
		System.out.println(num + " *4 = " + (num * 4));
		System.out.println(num + " *5 = " + (num * 5));
		System.out.println(num + " *6 = " + (num * 6));
		System.out.println(num + " *7 = " + (num * 7));
		System.out.println(num + " *8 = " + (num * 8));
		System.out.println(num + " *9 = " + (num * 9));

		System.out.println("=================");

		// 화면에 구구단 3단을 출력하시오
		num = 3; // 변수의 효용 재활용 할 수 있는 부분을 변수 처리 리터럴이 아니라서 num숫자가 3으로 바뀔 수 있음
		System.out.println(num + " *1 = " + (num * 1));
		System.out.println(num + " *2 = " + (num * 2));
		System.out.println(num + " *3 = " + (num * 3));
		System.out.println(num + " *4 = " + (num * 4));
		System.out.println(num + " *5 = " + (num * 5));
		System.out.println(num + " *6 = " + (num * 6));
		System.out.println(num + " *7 = " + (num * 7));
		System.out.println(num + " *8 = " + (num * 8));
		System.out.println(num + " *9 = " + (num * 9));

		System.out.println("=================");
		// 구구단 4단을 출력하시오

		num = 4;
		System.out.println(num + " *1 = " + (num * 1));
		System.out.println(num + " *2 = " + (num * 2));
		System.out.println(num + " *3 = " + (num * 3));
		System.out.println(num + " *4 = " + (num * 4));
		System.out.println(num + " *5 = " + (num * 5));
		System.out.println(num + " *6 = " + (num * 6));
		System.out.println(num + " *7 = " + (num * 7));
		System.out.println(num + " *8 = " + (num * 8));
		System.out.println(num + " *9 = " + (num * 9));
		System.out.println("================= 한글만 깨지는가");
		// 구구단 5단을 출력해주세요
//		for(초기화식; 조건식; 증감식) {
//			
//		}

		// i 변수에 유효범위 - scope 범위
		num = 5;
		for (int i = 1; i < 10; i++) {// 반복문 끝나면 i는 소멸, 안에서만 쓸 수 있다
			// i 변수에 유효 범위는 end of 까지이다.
			System.out.println(num + " * " + i + " = " + (num * i));
		} // end of for

		// i = 100; i는 이미 소멸 된 상태

		// 6단 출력 ~ 9단 까지 출력

		System.out.println("=================");

		num = 6;
		for (int i = 1; i < 10; i++) {// 반복문 끝나면 i는 소멸, 안에서만 쓸 수 있다
			// i 변수에 유효 범위는 end of 까지이다.
			System.out.println(num + " * " + i + " = " + (num * i));
		} // end of for

		System.out.println("=================");

		num = 7;
		for (int i = 1; i < 10; i++) {// 반복문 끝나면 i는 소멸, 안에서만 쓸 수 있다
			// i 변수에 유효 범위는 end of 까지이다.
			System.out.println(num + " * " + i + " = " + (num * i));
		} // end of for

		System.out.println("=================");

		num = 8;
		for (int i = 1; i < 10; i++) {// 반복문 끝나면 i는 소멸, 안에서만 쓸 수 있다
			// i 변수에 유효 범위는 end of 까지이다.
			System.out.println(num + " * " + i + " = " + (num * i));
		} // end of for

		System.out.println("=================");

		num = 9;
		for (int i = 1; i < 10; i++) {// 반복문 끝나면 i는 소멸, 안에서만 쓸 수 있다
			// i 변수에 유효 범위는 end of 까지이다.
			System.out.println(num + " * " + i + " = " + (num * i));
		} // end of for

	} // end of main

} // end of class
