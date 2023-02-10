package ch04;

import java.util.Scanner;

public class WhileMainTest4 {
	// 메인 작업자(메인 쓰레드)
	public static void main(String[] args) {

//    강사님이 상수 사용해서 한 것
//		int num = 1;
//		int sum = 0;
//		// 상수 만들어 보기
//		final int USER_INPUT;
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("덧셈 정수값을 입력해주세요");
//		USER_INPUT = scanner.nextInt();

//		while (num <= USER_INPUT) {
//			sum = sum + num;
//			num++;
//		}
//		System.out.println("결과값:" + sum);

		// 사용자가 0을 입력하면 프로그램을 종료하게 설계
		// 0이 아니라면 사용자가 입력한 값을 계속 덧셈해서 sum에 담아주세요.
		// while 으로 코드를 작성해주세요

		System.out.println("덧셈 정수값을 입력해주세요");
		Scanner scanner = new Scanner(System.in);
		int userInput = -1; // 임의의 값
		int sum = 0;

		while (userInput != 0) { // 0이 아니라 true가 되면 반복문을 계속 진행
			userInput = scanner.nextInt();
			sum = sum + userInput;
			System.out.println("덧셈 값 :" + sum);

		}
		System.out.println("결과값:" + sum);
		System.out.println("결과값 연산이 종료되었습니다");

	} // end of main

} // end of class
