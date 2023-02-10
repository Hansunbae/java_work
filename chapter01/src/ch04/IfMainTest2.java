package ch04;

import java.util.Scanner;

public class IfMainTest2 {

	public static void main(String[] args) {

		System.out.println("성적을 입력하세요");

		Scanner sc = new Scanner(System.in);
		int Point = sc.nextInt();
		// 100 ~ 90 A 학점 입니다,
		// 89 이하 80 이상이거나 같다면 B학점 입니다.
		// 79 이하 70 이상 c 학점입니다
		// 69 이하 60이상 D학점 입니다
		// 나머지 F학점 입니다.
		char result = 'Z';

		if (Point <= 100 && Point >= 90) {
			result = 'A';
		} else if (Point <= 89 && Point >= 80) {
			result = 'B';
		} else if (Point <= 79 && Point >= 70) {
			result = 'C';
		} else if (Point <= 69 && Point >= 60) {
			result = 'D';
		} // else {
//			result = 'F';
//		}

		// 방어적 코드를 작성
		if (result == 'Z') {
			System.out.println("값을 잘못 입력하였습니다.");
		} else {

			System.out.println(result + "학점입니다.");
		}

	}// end of main

}// end of class
