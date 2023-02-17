package ch05;

import java.util.Scanner;

public class YearTest {
	// 윤년 계산하기
	// 4의 배수의 해는 윤년
	// 4의 배수이면서 100의 배수인 해는 윤년이 아님
	// 100의 배수이면서 400의 배수인 해는 윤년
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("년을 입력하시오");
		int year = scanner.nextInt();

		if (year % 4 == 0 && year % 100 != 0) { //
			System.out.println("윤년");
		} else if (year % 100 == 0 && year % 400 == 0) {
			System.out.println("윤년입니다.");
		} else {
			System.out.println("윤년이 아닙니다.");
		}
	}
}
